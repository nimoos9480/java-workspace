package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	
	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름
	
		public static void main(String[] args) {
			
			VariablePractice vp = new VariablePractice();
			// vp.method1(); // 메소드 호출
			// vp.method2();
			// vp.method3();
			vp.method4();
			
				/* 과제) 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
				  * 첫 번째 정수를 입력하세요 : 23
				  * 두 번째 정수를 입력하세요 : 7
				  * 더하기 결과 :
				  * 빼기 결과 :
				  * 곱하기 결과 :
				  * 나누기 몫 결과 :
				 * */
	
			
		}
		
		public void method1() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수를 입력하세요 : ");
			int num1 = sc.nextInt();
					
			System.out.print("두 번째 정수를 입력하세요 : ");
			int num2 = sc.nextInt();
			
			System.out.println("더하기 결과 :" + (num1 + num2));
			System.out.println("빼기 결과 :" + (num1 - num2));
			System.out.println("곱하기 결과 :" + (num1 * num2));
			System.out.println("나누기 몫 결과 :" + (num1 / num2));
			
			System.out.println("------------");
			
			/*System.out.printf("더하기 결과 : %d\n", num1 + num2);  
			System.out.printf("빼기 결과 : %d\n", num1 - num2);
			System.out.printf("곱하기 결과 : %d\n", num1 * num2);
			System.out.printf("나누기 몫 결과 : %d\n", num1 / num2);
			*/
			
			
		}
	
		public void method2() {

			int adult = 10000;
			int youth = 7000;
			
			System.out.println("성인 2 명 : " + (adult*2) + "원");				
			System.out.println("청소년 3명 : " + (youth *3) + "원");
			System.out.println();
			System.out.println("총 금액 :" + (adult*2 + youth *3) + "원");
			
		}
		
		public void method3() {
			int x = 5;
			int y = 7;
			int z = 9;
			
			int tmp = x;
			x = y;
			y = z;
			z = tmp;
		
			System.out.println("x=" + x);
			System.out.println("y=" + y);
			System.out.println("z=" + z);
			
		}
		
		public void method4() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열을 입력하세요 > ");
			String str = sc.next();
			
			
			System.out.println("첫번째 문자 : " + str.charAt(0) );
			System.out.println("마지막 문자 : " + str.charAt(str.length()-1));

		}

		}
		
