package com.kh.variable;

public class C_Printf {

	public static void main(String[] args) {
		
		// System.out.print(출력하고자하는값); - 출력만 함(줄바꿈 발생X)
		// System.out.println(출력하고자하는값); - 출력 후 줄바꿈 발생O
		
		System.out.print("hello\n"); // \n : 엔터(줄바꿈) 표시(\: 엔터 위에 원표시)
		System.out.println("hello");
		
		// Sytem.out.printf("출력하고자하는형식(포맷)", 출력하고자하는값, 값, ...);
		// 출력하고자하는 값들이 제시한 형식에 맞춰서 출력만 진행 (줄바꿈 X)
		
		/*
		 * 포맷으로 쓰이는 키워드
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 * */
		
		int iNum1 = 10; 
		int iNum2 = 20;
		
		// Q. 10% 20%를 출력하라
		System.out.println(iNum1 + "% " + iNum2 + "%");
		System.out.printf("%d%% %d%%\n", iNum1, iNum2); 
		// 2번째 % : printf에서 ""안은 형식 지정이지 문자열이 아님, 3번째%가 문자다라는 것을 표현하기 위해 기호앞에 % 붙여줘야 에러 방지
		
		System.out.println("------------");
		
		// 5칸의 공간을 확보하고 오른쪽 정렬 (음수는 왼쪽 정렬)
		System.out.printf("%5d\n", iNum1);
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", -12);
		
		System.out.println("------------");
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		// 무조건 소수점 아래 6째자리까지 보여줌
		System.out.printf("%f\t%f\n", dNum1, dNum2);  // \t : 탭누른 것처럼 공간 확보
		System.out.printf("%.3f\t%.2f\n", dNum1, dNum2); // .n : 소수점 n째자리까지 출력(1.235	4.53)
	
		System.out.println("------------");
		
		char ch = 'a';
		String str = "Hello";
					
				// Q. a Hello a 출력하라
			
				System.out.printf("%c %s %c\n", ch, str, ch);
				
				// Q. A HELLO A 출력하라
				System.out.printf("%C %S %C", ch, str, ch); // 대문자로 바꾸기
	}
}
