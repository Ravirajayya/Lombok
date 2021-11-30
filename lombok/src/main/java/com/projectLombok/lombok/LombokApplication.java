package com.projectLombok.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
		lombokTest();
	}

	public static void lombokTest() {
		
		System.out.println("======> Lombok: @Getter, @Setter <======");
		TestGetterSetter lombok_1 = new TestGetterSetter();
		lombok_1.execute();
		
		System.out.println("======> Lombok: @NoArgsConstructor, @AllArgsConstructor, @ToString <======");
		UserModel lombok_2 = new UserModel();
		lombok_2.execute();
		
		System.out.println("======> Lombok: @Data <======");
        UserDataModel lombok_3 = new UserDataModel();
        lombok_3.execute();
        
        System.out.println("======> Lombok: @Builder at class level <======");
        lombokBuilderOnClass lombok_4 = new lombokBuilderOnClass();
        lombok_4.execute();
        
        System.out.println("======> Lombok: @Builder at Constructor level <======");
        lombokBuilderonConstructor lombok_5 = new lombokBuilderonConstructor();
        lombok_5.execute();
	}
}
