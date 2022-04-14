package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("반지름: ");
		double r = sc.nextDouble();
		System.out.println("구의부피는: " + 4.0/3.0*pi*r*r*r);
		
		
		sc.close();

	}

}
