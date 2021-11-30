package com.projectLombok.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserLombokModel {

	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
}

class UserModel {
	
	public void execute() {
		UserLombokModel userModel = new UserLombokModel( 22347, "Raviraj", " D S", 26, "Male");
		System.out.println("First name of user: " + userModel.getFirstName());
		System.out.println("Last name of user: " + userModel.getLastName());
		System.out.println("User id: " + userModel.getId());
	}
}