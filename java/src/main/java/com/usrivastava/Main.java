package com.usrivastava;

import com.usrivastava.model.CreateCompletionRequest;
import com.usrivastava.model.CreateCompletionRequestPrompt;

public class Main {
	public static void main(String[] args) {
		var s = new CreateCompletionRequest();
		var pr = new CreateCompletionRequestPrompt();
		pr.setActualInstance("");
		s.setPrompt(pr);
		System.out.println(s.toJson());
	}
}
