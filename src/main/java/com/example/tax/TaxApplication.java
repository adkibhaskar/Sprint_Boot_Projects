package com.example.tax;

import java.util.Scanner;


import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TaxApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to tax Payment Application");
		String beanId = "";
		while(true){
			System.out.println("Please Select which tax you want to pay:\n1. Income \n2. Property \n3. Exit");
			int userType = sc.nextInt();
			switch (userType) {
				case 1:
					beanId = "income";
					break;

				case 2:
					beanId = "property";
					break;
			    case 3:
					System.out.println("Exiting");
					break;
				default:
					System.out.println("Please Enter Valid Choice");
					break;
			}
			if(userType == 3){
				break;
			}
			Tax tax = (Tax) context.getBean(beanId);
			System.out.println("The tax Type is : " + tax.getTaxType());
			tax.setTaxableAmount(600000);
			tax.calculateTaxAmount();
			System.out.println("The tax Amount is : " + tax.getTaxAmount());
			tax.payTax();
			System.out.println("Is tax payed : " + tax.isTaxPayed());
		}
	}
}
