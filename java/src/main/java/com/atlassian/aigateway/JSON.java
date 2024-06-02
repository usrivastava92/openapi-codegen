package com.atlassian.aigateway;

import com.google.gson.Gson;

public class JSON {
	public static Gson GSON = new Gson();

	public static Gson getGson() {
		return GSON;
	}
}
