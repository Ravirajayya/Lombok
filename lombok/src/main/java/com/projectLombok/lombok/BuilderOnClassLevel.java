package com.projectLombok.lombok;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
class BuilderOnClassLevel {

	String name;
	int age;
}

class lombokBuilderOnClass{
	
	public void execute() {
		
		BuilderOnClassLevel user1 = BuilderOnClassLevel.builder().name("Raviraj").age(26).build();
		System.out.println("First user name: " + user1.getName());
		System.out.println("First user age: " + user1.getAge());
		
		BuilderOnClassLevel user2 = BuilderOnClassLevel.builder().name("naveen").build();
		System.out.println("Second user name: " + user2.getName());
		System.out.println("Second user age: " + user2.getAge());
	}
}