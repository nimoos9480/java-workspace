package com.kh.variable;

public class A_Variable {

	
	/*
	 * 변수(Variable)이란?
	 * - 하나의 값을 저장하는 "공간"
	 * */
	
	public static void main(String[] args) {
		
		// 실행할 메소드가 있는 클래스를 생성(new)해야 한다.
		A_Variable v = new A_Variable();
		
		// 생성한 클래스로 메소드 실행(호출)
		v.printValue();
		
	}
	
	public void printValue() {
		
		// 변수를 사용하지 않으면
		System.out.println(10 * 2 * 3.141592); // 원의 둘레 = 반지름 X 2 X 3.141592...
		System.out.println(10 * 10 * 3.141592); // 원의 넓이 = 반지름 X 반지름 X 3.141592...
		
		System.out.println("--------------");
		
		// 변수를 사용하면
		int r = 10; // 반지름
		double pi = 3.141592;
		
		System.out.println(r * 2 * pi);
		System.out.println(r * r * pi);

	}
	
	public void variableTest() {
		
		/*
		 * * 변수의 선언
		 * 
		 * [표현법] 자료형 변수명; 
		 * 
		 * - 자료형은 어떤 값을 저장할지, 어떤 크기의 메모리를 할당받을지에 대한 정보이다.
		 * - 변수명은 변수의 이름으로 값을 읽고, 쓰고, 지우는 작업을 할 때 사용한다.
		 * 
		 * * 변수의 초기화
		 * 
		 * [표현법] 변수명 = 값(리터럴); 
		 * 
		 * - 변수에 처음으로 값을 저장하는 것
		 * - '=' 오른쪽 데이터를 왼쪽의 변수에 대입(저장)하는 연산자이다.
		 * */
		
		//* 기본 자료형(Primitive type) 
		// - 실제 값을 메모리에 저장함
		// 논리형 : 1byte (true / false)
		boolean isTrue; 
		isTrue = true;
		
		boolean isFalse = false; // 한번에 선언한 것
//		isFalse = 1; // t/f외의 값 - 에러 발생
		
		// 문자형 : 2byte(1글자만 온다)
		char ch = 'a';
//		ch = 'ab'; // 2글자 - 에러 발생
		
		// 정수형(크기로 구분)
		byte bNum; // 1byte(8bit) : -128 ~ 127(2의 8제곱 = 256)
		short sNum; // 2byte
		int iNum; // 4byte (★기본)
		long lNum; // 8byte
		
//		bNum = 128; // 범위초과 - 에러 발생 => 오버플로우(Overflow)
		lNum = 92244297429250L; // 숫자 뒤에 L 또는 l을 입력해야 한다.
		
		// 실수형
		float fNum; // 4byte
		double dNum; // 8byte (★기본)

		fNum = 3.14F; // 숫자 뒤에 F 또는 f를 입력해야 한다.
		dNum = 3.14; // 그냥 작업해도 에러발생 안한다.
		
		// *참조 자료형 ; 4byte, 위의 7가지 기본형을 제외한 나머지(클래스)
		// - 주소값을 저장(실제값X)
		String name = "이한주"; // 클래스 명령 규칙 : 대문자로 시작
				
		// 변수의 명명 규칙
		// 1) 대소문자 구분된다.
		int number;
		int NUMBER;
		int Number;
//		String number; // 자료형이 달라도 변수명이 같으면 에러 발생
		
		// 2) 숫자로 시작하면 안 된다.
//		int 1age;
		int a3g5e2; // 중간이나 끝에 들어가는 건 가능
		
		// 3) 특수 문자는 '_'. '$'만 사용 가능하다.
		int _age; // 숫자랑 달리 앞에도 사용 가능
		int a_g_e;
		int age$;
//		int %age; 
		
		// 4) 예약어(Reserved word)를 사용하면 안 된다. (예약어 = 색깔이 나오는 것)
//		int public;
//		int void;
//		int int;
//		int class;
		
		// 5) (권장사항) 낙타표기법 (카멜케이스) : 오류가 나는 건 아니지만 개발자들의 권장사항
		// - 첫글자는 항상 소문자로 시작 
		// - 여러 단어가 올 때는 각 단어의 첫 글자를 대문자로 지정
//		int maxnumber;
//		int max_number; 
		int maxNumber; 
		
	}
	
	public void constant() {
		/*
		 * 상수
		 * 
		 * [표현법] final 자료형 변수명;
		 * 
		 * - 변하지 않는 값으로 특정 변수의 값이 변경되는 걸 원하지 않을 때 사용한다.
		 * - 초기화 이후에는 값을 변경할 수 없다.
		 * */
		int age;
		age = 20;
		age = 25; // 변수는 age 값 변경 가능
		
		final int AGE; // 상수는 무조건 대문자
		AGE = 30;
//		AGE = 35; // 값 변경하면 에러 발생
		
	
	
	}
}
