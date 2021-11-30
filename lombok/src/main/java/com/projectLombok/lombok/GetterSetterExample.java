package com.projectLombok.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @Getter @Setter 
public class GetterSetterExample {

	private String username;
	private String password;
}

class TestGetterSetter {
	
	public void execute() {
		GetterSetterExample lombokEx = new GetterSetterExample();
		lombokEx.setUsername("Raviraj");
		lombokEx.setPassword("P@assword");
		
		System.out.println("User name: " + lombokEx.getUsername());
		System.out.println("Password: " + lombokEx.getPassword());
	}
}
