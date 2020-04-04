package com.criapi.scoreapi.dto;

public class CricScoreWinner {

	private String team1;
	private String team2;
	private String winnerScore;
	private String roundRotation;

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getWinnerScore() {
		return winnerScore;
	}

	public void setWinnerScore(String winnerScore) {
		this.winnerScore = winnerScore;
	}

	public String getRoundRotation() {
		return roundRotation;
	}

	public void setRoundRotation(String roundRotation) {
		this.roundRotation = roundRotation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CricScoreWinner [team1=");
		builder.append(team1);
		builder.append(", team2=");
		builder.append(team2);
		builder.append(", winnerScore=");
		builder.append(winnerScore);
		builder.append(", roundRotation=");
		builder.append(roundRotation);
		builder.append("]");
		return builder.toString();
	}

}
