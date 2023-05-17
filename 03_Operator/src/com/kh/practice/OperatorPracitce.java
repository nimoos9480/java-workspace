package com.kh.practice;

import java.util.Scanner;

public class OperatorPracitce {
	
	public static void main(String[] args) {
		
		OperatorPracitce op = new OperatorPracitce();
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
		op.method6();
		
	}
	
	public void method1() {
		int num1 = 0;
		int num2 = 0;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수: ");
		num1 = sc.nextInt();
		
		System.out.print("연필 개수: ");
		num2 = sc.nextInt();
		

		System.out.println("1인당 연필 개수 : " + (num2 / num1));
		System.out.println("남는 연필 개수: " + (num2 % num1));
		
	}
	
	private void method2() {
//		키보드로 입력 받은 숫자를 산술 연산자만 사용해서 십의 자리 이하는 버리는 코드를 작성하세요.
//		만약 432이라면 400, 111이라면 100이 출력됩니다
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		num = sc.nextInt();
		
		System.out.println(num / 100 * 100);
		
		
	}
	
	private void method3() {
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		int num1 = 0;
		int num2 = 0;
		int num3 = 0; 
//		String result = "";
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		num2 = sc.nextInt();
		
		String result = ((num1 == num2) && (num2 == num3)) ? "true" : "False";  // 등위 표시 : == 
		System.out.println(result);
		
	}
	
	private void method4() {
//			키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요
		
		int num = 0;
//		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		String result = (num / 2 == 0) ? "짝수다" : "홀수다";  
		System.out.println(result);
		
	} 
	
	private void method5() {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		
		int num = 0;
//		String result = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		num = sc.nextInt();
		
		String result = (num <= 13) ? "어린이" : (num <= 19) ? "청소년" : "성인";  
		System.out.println(result);
	}
	
	private void method6() {
//		 키보드로 사과의 개수와 바구니의 크기(바구니 1개의 들어가는 사과의 개수)를 입력받아 필요한 바구니의 수를 출력하세요.
		
		int num1 = 0;
		int num2 = 0;
		boolean result = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		num2 = sc.nextInt();
	
		System.out.println("필요한 바구니의 수 : " + (((num1 % num2) == 0) ? (num1 / num2) : (num1 / num2) + 1));

	}

}
