package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int fh = sc.nextInt();
		System.out.print("100원 개수: ");
		int h = sc.nextInt();
		System.out.print("50원 개수: ");
		int f = sc.nextInt();
		System.out.print("10원 개수: ");
		int t = sc.nextInt();
		
		System.out.println("동전의 총합은 " + ((500*fh)+(100*h)+(50*f)+(10*t)) + " 원 입니다.");
		sc.close();

	}

}
