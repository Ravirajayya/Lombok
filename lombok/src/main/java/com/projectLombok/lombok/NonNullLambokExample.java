package com.projectLombok.lombok;

import lombok.NonNull;

public class NonNullLambokExample {

	private String name;
	
	public NonNullLambokExample(@NonNull User person) {
		name = person.getFirstName();
	}
	
	public String getName() {
		return this.name;
	}
}

class User{

	private String firstName;
	
	public User(String firstname) {
		this.firstName = firstname;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
}