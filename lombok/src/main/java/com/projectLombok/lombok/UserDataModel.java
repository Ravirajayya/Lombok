package com.projectLombok.lombok;

import lombok.Data;

/**
 * @Data is a convenient shortcut annotation that bundles the features of 
 * @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together.
 */

@Data
class UserLombokDataModel {

	private long id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
}

class UserDataModel {
	
	public void execute() {
		UserLombokDataModel userModel = new UserLombokDataModel();
		userModel.setId(22347);
		userModel.setFirstName("Raviraj");
		userModel.setGender("Male");
		
		System.out.println("User id: " + userModel.getId());
		System.out.println("First name of user: " + userModel.getFirstName());
		System.out.println("User gender : " + userModel.getGender());
	}
}