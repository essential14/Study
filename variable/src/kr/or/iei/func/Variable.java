package kr.or.iei.func;

public class Variable {
	public void var1() {
		//변수 선언 방법 -> 자료형 변수이름;
		//1. 논리형 변수 선언(1byte)
		boolean bool;
		//2. 문자형 변수 선언(2byte) 
		char ch;
		//3. 정수형 변수 선언(byte,shot,int,long) -> 기본 자료형 int
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		//4.실수열 변수 선언 (float, double) -> 기본 자료형 double
		float fNum;
		double dNum;
		//변수를 선언만 하는 경우 쓰레기 값이 들어있어서 바로 사용 불가능
		//-> 변수를 한 번 초기화(값을 한 번은 대입)한 후 사용 가능
		// a = b -> = 은 대입 연산자 기준으로 오른쪽에 있는 값을 왼쪽에 대입 
		iNum = 100;
		System.out.println("iNum : "+iNum);
		dNum = 100.1;
		System.out.println("dNum : "+dNum);
		ch = 'a';
		System.out.println("ch : "+ch);
		bool = true;
		bool = false;
		System.out.println("bool : "+bool);
		//덮어쓰기 돼서 false 출력
		bNum = 100;
		sNum = 200;
		lNum = 10000000000000l;
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("lNum : "+lNum);
		//정수인데 롱타입이야 하고 알려주는게 숫자뒤에 l(L)
		fNum = 3.14f;
		System.out.println("fNum : "+fNum);
		//문자열 변수 선언
		String str = "abcd";
		System.out.println("str : "+str);
		
		//상수형 변수 keyword : final /상수:변하지 않는 값
		//상수형변수의 이름은 모두 대문자로
		//한 번 초기화 된  후 값 변경이 불가능
		final double PI = 3.14;
		
	}
	public void var2() {
		int num = 2147483647;
		long result = (long)num+1;
		System.out.println("result : "+result);
		//데이터 오버플로우 *(개념확인)\
	}
	public void print() {
		System.out.print("메세지 출력1"); //()안의 내용을 출력 
		System.out.println("메세지 출력2");// ()안의 내용을 출력하고 다음줄로 이동
		System.out.printf("메세지 출력3");//print와 유사 %s,%d 기타 등등으로 변수 표시 ("내용",변수)
		System.out.println("안녕하세요 제 이름은 홍길동이고 나이는 20살입니다.");
		String name = "홍길동";
		int age = 20;
		System.out.println("안녕하세요 제 이름은 "+name+"이고 나이는 "+age+"살입니다.");
		System.out.print("안녕하세요 제 이름은 ");
		System.out.print(name);
		System.out.print("이고 나이는 ");
		System.out.print(age);
		System.out.println("살입니다.");
		System.out.printf("안녕하세요 제 이름은 %s이고 나이는 %d살입니다.",name,age);
		double dNum = 1.125456;
		System.out.println("dNun : "+dNum);
		System.out.printf("dNum : %.3f\n",dNum);//%.뒤에 숫자가 소숫점뒤에 자릿수 나타내고 반올림 / \n은 엔터 : escape 문자
		System.out.println("hi");
	}
	
}
