package kh.java.func;

import java.util.Scanner;

public class SwitchTest {
	
	public void test1() {
		//swich 문은 범위값 제어 불가능
		Scanner sc = new Scanner(System.in);
		System.out.print("1~3 사이 정수를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("1 입력!!!");
			break;
		case 2 :
			System.out.println("2 입력@@@@");
			break;
		case 3 :
			System.out.println("3 입력####");
			break;
		default : 
			System.out.println("잘못 입력!!!!!!!!");
			break;
		}
		//switch 순서 상관없음
		//break 없으면 나가지 않고 끝까지(default)실행 됨
	 	
		/*if(num==1) {
			System.out.print("1 입력!!!");
		}else if(num==2) {
			System.out.print("2 입력@@@@");
		}else if(num==3) {
			System.out.print("3 입력####");
		}else {
			System.out.print("잘못 입력!!!!!!!!");
		}*/
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고싶은 월을 입력하세요 : ");
		int month = sc.nextInt();
		switch(month) {
		case 1 : 
		case 3:
		case 5: 
		case 7 : 
		case 8: 
		case 10: 
		case 12: 
			System.out.print("31일");
			break;
		case 4 : 
		case 6:
		case 9:
		case 11:
			System.out.print("30일");
			break;
		case 2: 
			System.out.print("28일");
			break;
		default : 
			System.out.print("잘못 입력하셨습니다!");
		}
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		//switch 로 문자열을 처리하는 기능은 자바 1.7에 추가된 기능
		switch(str) {
		case "a" :
			System.out.println("aaaa");
			break;
		case "b" :
			System.out.println("bbbb");
			break;
		default :	
			System.out.println("cccc");
			break;
		}
		
		
		/*
		if(str.equals("a")) { //문자열은 =="a" 로 비교못함 .equal("?") 로 쓰자
			System.out.println("aaaa");
		}else if (str.equals("b")) {
			System.out.println("bbbb");
		}else {
			System.out.println("cccc");
		} */
	}

}