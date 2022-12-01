package kh.java.funtion;

import java.util.Scanner;

public class Example {
	
	public void exam1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번 째 정수 입력 : ");	
		int num2 = sc.nextInt();
		System.out.println("======결과======");
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+num1*num2);
		System.out.println("나누기 몫 : "+num1/num2);
		System.out.println("나누기 몫 : "+num1%num2);
	}
	public void exam2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이 입력 : ");
		double num1 = sc.nextDouble();
		System.out.print("세로 길이 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("=====결과=====");
		System.out.println("면적 : "+(num1*num2));
		System.out.println("둘레 : "+2*(num1+num2));
	}
	
	
	public void exam3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("영어단어 입력 : ");
		String str =sc.next();//문자열을 가져옴
		char cha0 = str.charAt(0);
		char cha1 = str.charAt(1);
		char cha2 = str.charAt(2);
		System.out.println("첫번째 문자 : "+cha0);
		System.out.println("첫번째 문자 : "+cha1);
		System.out.println("첫번째 문자 : "+cha2);
		
		
		
		// char cha0 = sc.next().charAt(0); / 문자를 가져옴 한번만 가져올 때 씀
		 
	}
	

}
