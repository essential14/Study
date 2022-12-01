package kh.java.practice;

import java.util.Scanner;

public class Sample {
	public void sample1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		char num = sc.next().charAt(0);
		int iNum = (int)num;
		System.out.println("A의 유니코드 값 : "+iNum);
	}
	public void sample2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int lang = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("======결과=====");
		int sum = lang+math+eng;
		int avg = (int)(lang+math+eng)/3;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg); 
	}

}
