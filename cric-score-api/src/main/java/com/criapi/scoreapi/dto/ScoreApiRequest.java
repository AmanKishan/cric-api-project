package com.criapi.scoreapi.dto;

public class ScoreApiRequest {

	private String unique_id;

	private String apikey;

	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ScoreApiRequest [unique_id=");
		builder.append(unique_id);
		builder.append(", apikey=");
		builder.append(apikey);
		builder.append("]");
		return builder.toString();
	}
}
