package kh.java.func;

import java.util.Scanner;

public class IfTest {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 10을 입력해보세요 : ");
		int num = sc.nextInt();
		System.out.println("입력한 숫자 : "+num);
		if(num == 10) { //true 조건이 진짜면 안에거 실행 아니면 밖에거 실행
			System.out.println("잘했어요!!!!!");
		}
		System.out.println("끝!!!");
	}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======숫자 구별 프로그램=====");
		System.out.print("임의의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("당신이 입력한 수 "+num+"은(는) 양수입니다."); 	
		}
		if(num < 0) {
			System.out.println("당신이 입력한 수 "+num+"은(는) 음수입니다.");	
		}
		if(num == 0) {
			System.out.println("당신이 입력한 수 "+num+"은(는) 0입니다.");			
		}
	}
	
	public void test3( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======두수 비교 프로그램======");
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num > num2) {
			System.out.println(num+">"+num2);
			System.out.println("첫번째 수가 더 큽니다.");
		}
		if(num == num2) {
			System.out.println(num+"="+num2);
			System.out.println("두 수가 같습니다.");
		}
		if(num < num2) {
			System.out.println(num+"<"+num2);
			System.out.println("두번째 수가 더 큽니다.");
		}
	}
	public void test4( ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=====계산기 프로그램=====");
		System.out.print("연산자를 입력하세요 (+,-,*,/) : ");
		String str = sc.next();
		char oper = str.charAt(0);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수를 입력 하세요 : ");
		int num2 = sc.nextInt();
		if(oper == '+') {
			System.out.printf("%d%c%d=%d" ,num,oper,num2,num+num2);
			
		}
		
	}	
	public void exam33() {
			
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자를 입력하세요(+,-,*,/) : ");
		String oper = sc.next();
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		// "+".equalse(oper)
		if(oper.equals("+")) {	
			System.out.println(num1+oper+num2+"="+(num1+num2));
		}
		if(oper.equals("-")) {
			System.out.println(num1+oper+num2+"="+(num1-num2));
		}
		if(oper.equals("*")) {
		System.out.println(num1+oper+num2+"="+(num1*num2));			
		}
		if(oper.equals("/")) {
			System.out.println(num1+oper+num2+"="+(num1/num2));
		System.out.println("끝!!!");
		}
	
	}
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.print("짝수");
		//입력 받은 수가 홀수면 홀수! 출력, 짝수면 짝수! if문사용
		//짝수 : 2로 나눴을때 나누어 떨어지는 수
		//짝수 : 2로 나눈 나머지가 0
		}else {
			System.out.println("홀수");
		}
	
	}
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>1000) {
			System.out.print("1000보다 큰 수 입니다.");
		}else if(num>10) {
			System.out.print("10보다 큰 수 입니다.");
		}else {
			System.out.print("10 이하 입니다.");
		}
	}
	public void ifph() {
		Scanner sc = new Scanner(System.in);
		// adultPay = 15000;
		// kidspay = 5000; 금액 변수 지정하면 수정 용이
		System.out.println("====놀이공원 프로그램====");
		System.out.print("입장하실 총 인원은 몇명입니까? : ");
		int total=sc.nextInt();
		System.out.print("어른은 몇명입니까?(1인당 15000원 : ");
		int adult=sc.nextInt();
		System.out.print("아이는 몇명입니까?");
		int kids =sc.nextInt();
		if(total == adult+kids) {
			System.out.print("지불하실 총 금액은 "+((adult*15000)+(kids*5000))+"원입니다.");
		}else {
			System.out.println("인원수가 맞지 않습니다.");
		}
	}
	public void ifph1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====대/소문자 변환 프로그램====");
		System.out.print("문자입력 : ");
		char char1 = sc.next().charAt(0);
		char cha = (char)(char1-32); //(char)(cha^32)도 가능
		char cha1 = (char)(char1+32);
		System.out.println("=====결 과=====");
		if(char1>96 && char1<123) {
			System.out.println("소문자를 입력 하였습니다.");
			System.out.println("대문자로 변환 : "+cha);
		}else if(char1>64 && char1<91) {
			System.out.println("대문자를 입력 하였습니다.");
			System.out.println("소문자로 변환 : "+cha1);
		}else {
			System.out.println("잘못입력하셨습니다. 영문자를 입력해주세요.");
		}
		
		
	}
	public void ifph2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int number34=sc.nextInt();
		System.out.println("=====결과=====");
		if(number34%12==0) { // 조건이 만족되면 만족 되는 곳에서 나옴
			System.out.println("["+number34+"]은(는) 3의 배수면서 4의 배수입니다." );	
		}else if(number34%3==0) {
			System.out.println("["+number34+"]은(는) 3의 배수입니다."); //더 큰 조건이 제일 위 ex)12
 		}else if(number34%4==0) {
			System.out.println("["+number34+"]은(는) 4의 배수입니다.");
		}else if(number34%12!=0) {
			System.out.println("["+number34+"]은(는) 3의 배수도 4의 배수도 아닙니다.");
		}else if(number34==0) { 
			System.out.println("[0]은(는) 3의 배수도 4의 배수도 아닙니다.");
			/* 0을 제일 앞에 빼면 편함 
			 if(num)==0 3의배수아닌거,4의배수아닌거하고 
			 else { 
			 if{ 
			 else if{
			 }
			  } 
			   } */
		
		}
		
	}
			
}