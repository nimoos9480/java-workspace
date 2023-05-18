package com.kh.condition;

import java.util.Scanner;

public class A_If {
	
	Scanner sc = new Scanner(System.in); // 인스턴스 변수 (바깥에 두면 매번 메소드 추가할 필요없이 언제든 사용 가능)
	
	/*
	 * if문
	 * 
	 * [표현법] 
	 * 
	 * if(조건식) {
	 * 		.. 조건식이 참(true)일 때 실행할 코드 ..
	 * }
	 * 
	 * - 보통 조건식에는 비교연산자, 논리연산자를 주로 사용(결과값이 true, false로 나온다)
	 * 
	 * */
	
	public void method1() {
		
		int score = 50; // 지역변수 (해당 메소드 안에서만 사용하는 변수)
		
		// 60점 이상이어야 합격!
//		만약 (60점 이상) { 합격! } // 의사 코드(슈도코드, pseudocode) : 한글로 작성 후 코드 변환
		
		if (score >= 60) { // 중괄호 사용 권장!
			
			System.out.println("합격!");
		}
		
//		if (score >= 60) 
//			System.out.println("합격!");
//			System.out.println("축하드려요!");
//			
		
		if(score >= 60) System.out.println("합격!"); // 한 줄 정도는 중괄호 없이도 가능

		// 불합격! 출력
		if(score < 60) System.out.println("불합격!");
		
		}
	
	/*
	 * if-esle문
	 * 
	 * [표현법]
	 * 
	 * if(조건식) {
	 * 		... 조건식이 참(true)일 때 실행할 코드 ...
	 * } esle {
	 * 		... 조건식이 거짓(false)일 때 실행할 코드 ...
	 * }
	 * 
	 * */
	
	public void method2() {
		int score = 0;
		
		System.out.print("점수 입력 > ");
		score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격!");
		} else {			
			System.out.println("불합격!");
		}
		
		// 삼항연산자
		System.out.println((score >= 60) ? "합격!" : "불합격!");
		
		
	}
	
	public void method3() {
		String name = "";
		
		System.out.print("이름을 입력해주세요 > ");
		name = sc.nextLine();
		
		// 신수민 입력 시 일치하는 지 판단
		
		System.out.println("신수민" == name); // 결과값 false 나온다
		System.out.println("신수민".equals(name)); // true, String 클래스의 equals() 메소드
		System.out.println("신수민".charAt(0)); // String 클래스의 charAt(0)메소드
		
		// 본인이면 "본인이다.", 본인이 아니라면 "본인이 아니다."
		
		if("신수민".equals(name)) {
			System.out.println("본인이다.");
		} else {			
			System.out.println("본인이 아니다.");
		}

	}
	
	public void method4() {
		
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		// 0보다 크면 "양수", 아니면 "음수"
		// 중첩 if문 : if문 중첩해서 사용 가능!
		if(number > 0) {
			System.out.println("양수");	
		} else {
//			System.out.println("음수"); 
			
			if(number == 0) {
				System.out.println("0입니다");	
			} else {
				System.out.println("음수"); 
			}
		}
		
	}
	
	/*
	 * if-else if-esle문 
	 * 
	 * [표현법] 
	 * 
	 * if(조건식1) {
	 * 	... 조건식1이 참(true)일 때 실행할 코드...
	 * } else if(조건식2) {
	 * 	... 조건식2가 참(true)일 때 실행할 코드...
	 * } else {
	 * 	... 위의 어느 조건식에도 만족하지 않을 때 실행할 코드 ...
	 * }
	 * 
	 * - else if 수는 제한이 없다.
	 * - else는 생략 가능하다.
	 * */
	public void method5() {
		int number = 0;
		
		System.out.print("숫자 입력 > ");
		number = sc.nextInt();
		
		if(number > 0) {
			System.out.println("양수");
		} else if(number < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0입니다.");
		}
		
	}
	/*
	 * 사용자에게 점수(0~100)을 입력받아서 점수별로 등급을 출력하라
	 * - 90점 이상은 A등급
	 * - 90점 미만 80점 이상은 B등급
	 * - 80점 미만 70점 이상은 C등급
	 * - 70점 미만 60점 이상은 D등급
	 * - 60점 미만 F등급
	 * */
	
	public void method6() {
		int score = 0;
		
		System.out.print("점수를 입력하세요. > ");
		score = sc.nextInt();
		
		if(score >= 90) { // 불필요한 코드 중복이 많다
			System.out.println("A등급");
		} else if(score >= 80) { 
			System.out.println("B등급");
		} else if(score >= 70) {
			System.out.println("C등급");
		} else if(score >= 60) {
			System.out.println("D등급");
		} else {
			System.out.println("F등급");
		}
		
		// 두번째 코드
		char grade = '\u0000'; // char 초기화
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) { 
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}
	/*
	 * 세 정수를 입력했을 때 짝수만 출력
	 * 
	 * num1 입력 > 3
	 * num2 입력 > 4
	 * num3 입력 > 6
	 * 
	 * 4
	 * 6
	 * */
	
	public void practice1() {
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.print("num1 입력 > ");
		num1 = sc.nextInt();
		
		System.out.print("num2 입력 > ");
		num2 = sc.nextInt();
		
		System.out.print("num3 입력 > ");
		num3 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1);	
		} if(num2 % 2 == 0) {
			System.out.println(num2); 	
		} if(num3 % 2 == 0) {
			System.out.println(num3);
		} else {System.out.println("");	}
		
	// 더 간단하게! 
		if(num1 % 2 == 0) System.out.println(num1);	
		if(num2 % 2 == 0) System.out.println(num2); 	
		if(num3 % 2 == 0) System.out.println(num3);
		else System.out.println("");	
		
//		} else {
//			System.out.println("");	
//		}
//		if(num2 % 2 == 0) {
//			System.out.println(num2); 
//		} else {
//			System.out.println("");	
//		} if(num3 % 2 == 0) {
//			System.out.println(num3);
//		} else {
//			System.out.println("");	
//		}
		
	} 
	
	/*
	 * 정수 1개를 입력했을 때 음(minus)/양(plus)/0(zero), 
	 *                    짝(even)/홀(odd) 출력
	 *                    
	 * 정수 입력 > -3
	 * minus
	 * odd
	 * */
		
	public void practice2() {
//		int num = 0; // 아래에서 한번에 정의
		
		System.out.print("정수 입력 > : ");
		int num = sc.nextInt();
		
		if(num < 0) System.out.println("minus");
		else if(num > 0) System.out.println("plus");
		else System.out.println("zero");
		
		if(num % 2 == 0) System.out.println("even");
		else System.out.println("odd");
		
		// 두 번째 방법
		if (num < 0) {
			System.out.println("minus");
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else if (num > 0) {
			System.out.println("plus");
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("zero");
			if (num % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

	}
	
	public static void main(String[] args) {
		
		A_If a = new A_If();
//		a.method1();
//		a.method2();
		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();

//		a.practice1();
//		a.practice2();
	}

}
// 자동 줄바꿈 : ctrl + shift + f
