package com.criapi.scoreapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class CricScoreResponse {

	@JsonProperty("stat")
	private String stat;
	
	@JsonProperty("score")
	private String score;
	
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("matchStarted")
	private Boolean matchStarted;
	
	@JsonProperty("team-1")
	private String team1;
	
	@JsonProperty("team-2")
	private String team2;

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getMatchStarted() {
		return matchStarted;
	}

	public void setMatchStarted(Boolean matchStarted) {
		this.matchStarted = matchStarted;
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CricScoreResponse [stat=");
		builder.append(stat);
		builder.append(", score=");
		builder.append(score);
		builder.append(", description=");
		builder.append(description);
		builder.append(", matchStarted=");
		builder.append(matchStarted);
		builder.append(", team1=");
		builder.append(team1);
		builder.append(", team2=");
		builder.append(team2);
		builder.append("]");
		return builder.toString();
	}
	
	
}
