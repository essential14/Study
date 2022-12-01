package kr.or.iei.func;

import java.util.Scanner;

public class Scan {
	public void scan1() {
		//스캐너 별칭 생성(객체 만듦)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println("str : "+str);  
		
		System.out.print("정수를 입력하세요 : ");
		// sc.nextInt() : 키보드 입력값을 기다리는 상황
		// 키보드 값 입력 후 엔터를 치면 입력된 값을 정수로 읽어옴
		// 정수가 아닌 값을 입력하면 에러 발생
		int num = sc.nextInt();
		System.out.println("num : "+num);
		
		System.out.print("실수를 입력하세요 : ");
		// sc.nextDouble() : 키보드 입력을 기다림
		// 키보드 값 입력 후 엔터를 치면 입력된 값을 실수로 읽어옴
		// 실수로 변환할 수 없는 값을 입력하면 에러 발생 
		double dNum = sc.nextDouble();
		System.out.println("dNum : "+dNum);
		
		
		//Scanner 를 이용한 문자열 입력받기
		//1)
		System.out.print("문자열을 입력하세요 : ");
		// sc.next() : 문자열을 입력받는 메소드
		// 단, 띄어쓰기가 포함된 문자열은 띄어쓰기 이전까지만 인식
		String str1 = sc.next();
		System.out.println("str1 : "+str1);
		
		//2)
		System.out.print("문자열을 입력하세요 : ");
		sc.nextLine(); // 버퍼에 남아있는 엔터를 제거하는 용도
		String str2 = sc.nextLine();
		System.out.println("str2 : "+str2);
		
		//스캐너를 통한 문자 입력 받는 방법
		/* 
		 문자열을 받는 메소드 :sc.next(), sc.nextLine()
		 정수 입력 받는 메소드 :sc.nextInt();
		 실수 입력 받는 메소드 :sc.nextDouble();
		 문자 입력 받는 메소드 :sc.nextChar(); X
		 */
		//스캐너를 통한 문자 입력받는 방법 
		System.out.print("문자를 입력하세요 : ");
		String str3 = sc.next(); //문자열로 입력 받고
		//입력 받은 문자열 중 첫번째 글자만 문자로 추출
		//chatAt(num)<num에 들어가는 숫자가 글자 자릿수 0~
		char ch = str3.charAt(0);
		System.out.println("ch : "+ch);
		
		System.out.print("문자를 입력하세요22 : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("ch2 : "+ch2);
	}
	
	public void exam1() {
		/*
		 이름(String), 나이(int), 주소(String), 키(double)
		 몸무게(double), 성별(char)을 입력받고 출력하는 프로그램
		 -키는 정수로 변환하여 출력
		 -몸무게는 소수 첫째 자리까지 출력
		 
		 */
		//스캐너 사용 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("주소 입력 : ");
		sc.nextLine();//버퍼에 엔터 제거
		
		String addr = sc.nextLine();
		System.out.println("키 입력 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게 입력 :");
		double weight = sc.nextDouble();
		System.out.println("성별 입력[남/여] :");
		char gender = sc.next().charAt(0);
		System.out.println("------------------------");
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주소 :"+addr);
		int intHeight = (int)height;
		System.out.println("키 :"+intHeight);
		System.out.printf("몸무게 : +%.1f\n",weight);
		System.out.println("성별 :"+gender);
	}
		
		
	public void exam2() {
	    Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 입력 : ");
		int lang = sc.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println();
		int sum = lang+math+eng;
		double avg = (lang+math+eng)/3;
		System.out.printf("당신 성적의 총 합은 %d 평균은 %.2f 입니다!",sum,avg);
					
	
		
	}

}