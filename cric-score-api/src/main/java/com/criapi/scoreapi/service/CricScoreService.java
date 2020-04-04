package com.criapi.scoreapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.criapi.scoreapi.constants.Constants;
import com.criapi.scoreapi.dto.CricScoreResponse;
import com.criapi.scoreapi.dto.CricScoreWinner;
import com.criapi.scoreapi.dto.ScoreApiRequest;
import com.criapi.scoreapi.dto.TeamAndScore;

@Service
public class CricScoreService {

	private static final Pattern p = Pattern.compile("\\d+");
	
	@Autowired
	private RestTemplate restTemplate;

	
	public CricScoreWinner getCricWinnerStat(ScoreApiRequest request){
		CricScoreResponse response = getCricScore(request);
		CricScoreWinner cricScoreWinner = new CricScoreWinner();
		cricScoreWinner.setTeam1(response.getTeam1());
		cricScoreWinner.setTeam2(response.getTeam2());
		String score = response.getScore();
		getWinnerScore(score,cricScoreWinner);
		return cricScoreWinner;
	}
	
	public CricScoreResponse getCricScore(ScoreApiRequest request) {
		return restTemplate.postForObject(Constants.CRIC_SCORE_API_URI, request, CricScoreResponse.class);
	}
	
	private void getWinnerScore(String score,CricScoreWinner cricScoreWinner ) {
		String team1 = cricScoreWinner.getTeam1().toLowerCase();
		
		String team2 = cricScoreWinner.getTeam2().toLowerCase();
		
		
		String team1Score = "";
		String team2Score = "";
		
		String team1ScoreWithWicket = "";
		String team2ScoreWithWicket = "";
		String[] teams = score.split(" v "); 
		if(teams.length == 2) {
			team1ScoreWithWicket = getScoreWithWicket(teams[0]);
			team2ScoreWithWicket = getScoreWithWicket(teams[1]);
			team1Score = getScore(team1ScoreWithWicket);
			team2Score = getScore(team2ScoreWithWicket);
			
		}
		
		String winnerScore = "";
		if(Integer.parseInt(team1Score) > Integer.parseInt(team2Score)) {
			winnerScore = team1ScoreWithWicket;
			team1 = team1 +  " (Winner)";
			cricScoreWinner.setTeam1(team1);
		}else {
			 winnerScore = team2ScoreWithWicket;
			 team2 = team2 +  " (Winner)";
			 cricScoreWinner.setTeam2(team2);
		}
		cricScoreWinner.setWinnerScore(winnerScore);
		String rotateScore=rotateScore(cricScoreWinner.getWinnerScore());
		cricScoreWinner.setRoundRotation(rotateScore);
	}
	
	private static String getScoreWithWicket(String team) {
		
		String score = "";
		Matcher m = p.matcher(team);
        while(m.find()) {
        	score = score + m.group() + "/"; 
        }
        score = score.substring(0, score.length() - 1);
        return score;
	}
	
	
	private static String getScore(String teamScore) {
		
		int idx = teamScore.indexOf("/");
		
		return teamScore.substring(0, idx);
		
	}
	
	
	private String rotateScore(String score) {
		int idx  =score.length() -1;
		char ch = score.charAt(idx);
		score = score.substring(0, idx);
		String lastChar=Character.toString(ch);
		return lastChar + score;
	}
}
