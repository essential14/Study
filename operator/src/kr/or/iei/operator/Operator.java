package kr.or.iei.operator;

import java.util.Scanner;

public class Operator {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		
	}
	public void exam4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		//입력 받은 나이가 19세보다 많으면 성인, 아니면 미성년자
		System.out.println(age>19?"성인입니다":"미성년자");
	}
	public void exam5( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		double avg = kor+eng+math/3.0;
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f",avg);
		String result = kor>=40 && eng>=40 && math>=40 && avg>=60?"합격":"불합격";
		
	}
	public void exam6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		//홀수 짝수 구분하는 기준 
		//짝수의 정의 : 2로 나눴을 때 나누어 떨어지는 수
		//나누어 떨어진다 ->나머지가 0
		System.out.println(num%2 == 0 ?"짝수":"홀수");
	}

}
