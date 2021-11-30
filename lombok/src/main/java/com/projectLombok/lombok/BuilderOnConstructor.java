package com.projectLombok.lombok;

import lombok.Builder;
import lombok.ToString;

@ToString
public class BuilderOnConstructor{
	
	String name;
	int age;
	boolean isactive;
	String role;
	
	public BuilderOnConstructor(String name, int age, boolean isactive, String role) {
		super();
		this.name = name;
		this.age = age;
		this.isactive = isactive;
		this.role = role;
	}
	
	@Builder
	public static BuilderOnConstructor creatInstance(String name, int age) {
		return new BuilderOnConstructor(name, age, true, "Admin");
	}
}

class lombokBuilderonConstructor{
	
	public void execute() {
		BuilderOnConstructor person1 = BuilderOnConstructor
											.builder().name("Ravi").age(26).build();
		System.out.println(person1);									 
	}
}