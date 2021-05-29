package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//this is functional interface
@FunctionalInterface
interface MyInterface {

	// abstract method
	double getPiValue(int x);
}

public class Sample {

	/*
	 * public static void main(String[] args) { String temp = "little star"; for
	 * (int i = 0; i < temp.length(); i++) { Character x = temp.charAt(i); int count
	 * = 0; for (int j = 0; j < temp.length(); j++) { Character y = temp.charAt(j);
	 * if (x.toString().equalsIgnoreCase(y.toString())) { count++; } }
	 * System.out.println("Letter: "+x + " count :" + count); } }
	 */

}
