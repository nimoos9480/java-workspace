package com.kh.loop;

import java.util.Scanner;

public class D_While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * while문
	 * 
	 * [표현법]
	 * 
	 * while(조건식) {
	 * 		..실행 코드..
	 *}
	 * */
	
	public void method1() {
	
		for (int i = 1; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println();

		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
	}
	
	/*
	 * break문
	 * -switch, 반목문의 실행을 중지하고 빠져나갈 때 사용
	 * - 반복문이 중첩되는 경우 break문이 포함되어 있는 반복문에서만 빠져나간다.
	 * */

	// for문 무한루프 = 무한반복
	public void method2() {
		for(int i=1; i<5; ) {
			System.out.println(i);
			i++;
		}
		

		for(int i=1; ; )	{
			if(i<=5) {
				System.out.println(i);
			} else {
				break;
			}
			i++;
		}
		
		int i=1;
		for(;;) {
			if(i<=5) {
				System.out.println(i);
			} else {
				break;
			}
			i++;
		}
	}
	
	// while문 무한루프
	public void method3() {
		int input = 0;
		while(true) {
			System.out.println("숫자 입력 > ");
			input = sc.nextInt();
			System.out.println(input);
		}
		
	}
	
	/*
	 * do-while문 // 사용빈도는 거의 없음
	 * 
	 * [표현법]
	 * 
	 * do {
	 *  	.. 실행 코드 ..
	 * } while(조건식);
	 * 
	 * - 조건과 상관없이 무조건 한 번은 실행
	 * 
	 * */
	
	public void method4() {
		
		int number = 1;
		
		while(number == 0) {
			System.out.println("while문");
		}
		
		do {
			System.out.println("do-while문");	
		} while(number == 0);
	}
		
	// 반복문 + 조건문
	/*
	 * 숫자 맞히기 게임!
	 * 1과 100 사이의 값을 입력해서 임의로 지정한(Random)값을 맞히면 게임 끝!
	 * 게임이 끝나면 몇 번만에 숫자를 맞혔는지 출력해라!
	 * 
	 * (예 : 57)
	 * 1과 100 사이의 값 입력 > 35
	 * 더 큰 수를 입력하세요.
	 * 1과 100 사이의 값 입력 > 70
	 * 더 작은 수를 입력하세요.
	 * 1과 100 사이의 값 입력 > 70
	 * 3번 만에 맞췄습니다.
	 * */
	public void method5() {
		
//		double random = Math.random();
//		random = Math.random() * 100 + 1;
//		int num = (int) random;
		
		double answer = (int) Math.random() * 100 + 1;
		int input = 0;
		int count = 0;
	
//		int k = 0;
		
		while(true) {
			count++;
			
			System.out.print("1과 100 사이의 값 입력 > ");
			input = sc.nextInt();

			if(answer > input) {
				System.out.println("더 작은 수를 입력하세요.");	
			} else if(answer < input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println(count + "번 만에 맞췄습니다.");
				break;
					}
			}
		}
	/*
	 * ------------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 1
	 * 예금액 > 5000
	 * 
	 * ------------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 2
	 * 출금액 > 2000
	 * 
	 * ------------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 3
	 * 잔고 > 3000
	 * 
	 * ------------------------------------
	 * 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료
	 * ------------------------------------
	 * 선택 > 4
	 * 프로그램 종료
	 * */
	public void method6() {
		
		int balance = 0;
		boolean run = true; // 브레이크로 반복문 못 벗어날 때 사용
		
		while(run) {
			System.out.println(" ------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println(" ------------------------------------");
			
			System.out.print("선택 > ");
			int menu = Integer.parseInt(sc.nextLine()); 
			// Integer.parseInt " Integer클래스의 parseInt 메소드 값이 String -> int값으로 변경해주는 메소드
			// 문자열을 숫자로 변경해주는 메소드 = 문자도 그대로 숫자로 인식함
	
			switch (menu){
			
			case 1: 
				System.out.print("예금액 > " );
				balance += Integer.parseInt(sc.nextLine());
				break; // 스위치 안에 있는 브레이크 = > 반복문에서 벗어날 수 없음
			case 2: 
				System.out.print("출금액 > " ); 
				balance -= Integer.parseInt(sc.nextLine());
				break;
			case 3: 
				System.out.print("잔고 > " ); 
				System.out.println(balance); 	
				break;
			case 4: 
				run = false; // 반복문에서 벗어나기 위함
				break;
			} 
		} System.out.println("프로그램 종료");
	}
	

	public static void main(String[] args) {
		D_While d = new D_While();
//		d.method1();
//		d.method2();
//		d.method3();
//		d.method4();
//		d.method5();
		d.method6();
		

	}

}
