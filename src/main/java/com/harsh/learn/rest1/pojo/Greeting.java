package com.harsh.learn.rest1.pojo;

public class Greeting {

	private final Integer id;
	private final String content;
	
	public Greeting(Integer id, String content) {
		this.id = id;
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	
	
}
