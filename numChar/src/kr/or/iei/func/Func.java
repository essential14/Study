package kr.or.iei.func;

public class Func {
	public void print1() {
		System.out.println(1); //정수 1 출력
		System.out.println(1.0);//실수 1 출력
		System.out.println('1');//문자 '' 안에 있는것 / 문자 1 출력
		System.out.println("1");//문자열 "" 안에 있는 것 / 문자열 1출력
	}
	public void print2() {
		System.out.println(1+1);//2
		System.out.println(1.0+1.0);//2.0
		System.out.println('1'+'1');//98
		//아스키 코드에 의해 문자 1은 숫자로 49고 더해져서 98 나옴
		System.out.println("1"+"1");//11
		//문자열은 숫자 연산이 아니므로 +이외에는 불가능
	}	
	public void print3() { 
		//자바는 서로 다른 데이터를 연산 불가능
		//서로 다른 데이터 연산 시 작은 범위 데이터를 큰 범위 데이터로 변환 후 연산
		System.out.println(1+1.1);
		//1.0+1.1 = 2.1 -> 범위가 좁은 정수를 실수로 변환 후 연산
		System.out.println(1+'1');//50
		//1+49 = 50 ->범위가 좁은 문자를 정수로 변환 후 연산
		System.out.println(1.0+'1');//50.0
		//1.0+49.0 = 50.0 ->범위가 좁은 문자를 숫자>실수로 변환 후 연산	
	}
	public void print4() {
		//문자열을 다른 자료형과 더하기 연산하는 경우 
		//->다른 자료형을 문자열로 변환 후 더하기 연산
		System.out.println(1+"1");//11
		//"1"+"1"="11"
		System.out.println(1.0+"1");//1.01
		//"1.0"+"1"="1.01"
		System.out.println('1'+"1");//11
		//"1"+"1"="11"
	}
	public void print5() {
		System.out.println("Hello"+10);//Hello10
		//"Hello"+"10" ="Hello10"
		System.out.println(10+"Hello");//10Hello
		//"10"+"Hello" = "10Hello"
		System.out.println(10+20+"Hello");//30Hello
		//30+"Hello"->"30"+"Hello" = "30Hello"
		System.out.println(10+(20+"Hello"));//1020Hello
		//10+("20"+"Hello")  -> 10+"20Hello"
		//-> "10"+"20Hello" = "1020Hello"
	}
}
