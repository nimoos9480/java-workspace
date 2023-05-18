package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	
	/*
	 * 논리 연산자
	 * - 두 개의 논리값을 연산해주는 연산자
	 * - 논리연산한 결과마저도 논리값임!!
	 * 
	 * 논리값 && 논리값 : (and, 그리고) 
	 *                 왼쪽, 오른쪽 둘 다 true일 경우 결과값은 true
	 * 논리값 || 논리값 : (or, 또는) 
	 *                 왼쪽, 오른쪽 둘 중 하나라도 true일 경우 결과값은 true
	 * */
	
	public static void main(String[] args) {
		
		E_Logical e = new E_Logical();
//		e.method1();  // 주석처리 : ctrl + '/'
//		e.method2();
		e.method3();
	}
		
			
	public void method1() {
		
		int number = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = sc.nextInt();
		
		// 1 <= number <= 100
		result = (number >= 1) && (number <= 100);
		System.out.println(number + "는 1부터 100 사이의 값인가요? : " + result);
		 
	}
	
	public void method2() {
		
	// Short Cut Evaluation
		int number = 10;
		boolean result = false;
//		&& 연산자를 기준으로 앞에서 이미 false가 나오면 뒤의 연산은 수행하지 않는다.
		result = (number < 5) && (++number > 0);
		
		System.out.println(result); // false
		System.out.println(number); // 10
		
		// || 연산자를 기준으로 앞에서 이미 true가 나오면 뒤의 연산은 수행하지 않는다. (▶ 로그인처리 할 때 사용 多)
		result = (number < 20) || (++number > 0);
		System.out.println(result); // true
		System.out.println(number); // 10    
		
		
	}
	
	/*
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ "Z'까지가 코드값으로 65~90까지의 숫자로 나열
	 * */
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		boolean result = false;	// 결과 내려면 result 변수와 관련해 논리값 선언해줘야 함(초기화라 true, false 무관)
		
		System.out.print("문자를 입력해 주세요. > ");
		/*  
		 1) String str = sc.nextLine();
		 char ch = str.charAt(0);
		 int a = ch; 
		 
	
		2) char ch = sc.next().charAt(0); // '.' : 우선순위 연산자
		int i = (int)ch;
		*/
		
		/* result = (ch >= 65) && (ch <= 90); 
		System.out.println(ch + "는 대문자인가요? : " + result);*/ 
		
		char ch = sc.nextLine().charAt(0);
		System.out.println("사용자가 입력한 값이 대문자입니까? :" + ((ch >= 'A') && (ch <= 'Z'))); 

		
	}
		
}


