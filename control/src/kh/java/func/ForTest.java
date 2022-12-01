package kh.java.func;

import java.util.Scanner;

public class ForTest {
	public void test1() {
		//for(초기;조건;증감)
		/* 
		 초기 : 반복 횟수를 위한 변수 선언 및 초기화
		 조건 : 반복 횟수 조절
		 증감 : 초기에서 선언된 변수를 증가 또는 감소
		 */
		//System.out.println("안녕하세요"); 5번 출력 
		/*
		for(int i=1;i<=5;i++) {
			System.out.println("안녕하세요");
		}*/
		for(int i=1;i<=1000;i++) {
			System.out.println("안녕하세요");
		}
	
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번 출력하시겠습니까? ");
		int count =sc.nextInt();
		for(int i=1;i<=count;i++) {
			System.out.println(i+"안녕하세요");
		}
		
	}
	public void test3() {
		//구구단 2단 출력
		/* 
		 2 X 1 = 2
		 2 X 2 = 4
		 2 X 3 = 6
		 2 X 4 = 8
		 2 X 5 = 10
		 */
		System.out.println("구구단 2단");
		for(int i=1;i<=9;i++) {
			//System.out.println(2+"*"+i+"="+2*i);
			System.out.printf("%d x %d = %d*%d",2,i,2*i);
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇단을 출력하시겠습니까? ");
		int count = sc.nextInt();
		System.out.println(count+"단 입니다.");
		for(int i=1;count<=9 && i<=9;i++) {
			System.out.println(count+"*"+i+ "=" +count*i);			
		}
	}
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("몇단을 출력하시겠습니까? ");
		int count = sc.nextInt();
		System.out.println(count+"단 입니다.");
		for(int i=0;count<=9 && i<9;i++) {
			System.out.printf("%d x %d = %d\n",count,i+1,count*(i+1));
		}
	}

}
