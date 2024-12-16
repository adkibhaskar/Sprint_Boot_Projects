package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.demo");
		StudentInfo studentInfo = (StudentInfo) context.getBean("studentInfo");
		studentInfo.getStudentInfo();;

		
	}

}
