package com.atlassian.aigateway;

import com.atlassian.aigateway.model.CreateChatCompletionResponse;
import com.atlassian.aigateway.model.CreateCompletionRequest;
import com.atlassian.aigateway.model.CreateCompletionRequestPrompt;

public class Main {
	public static void main(String[] args) {
		var s = new CreateCompletionRequest();
		var pr = new CreateCompletionRequestPrompt();
		pr.setActualInstance("");
		s.setPrompt(pr);
		System.out.println(s.toJson());
	}
}
