package com.kh.practice;
import java.util.Scanner;
public class CastingPractice {
	
	public static void main(String[] args) {
		
		CastingPractice cp = new CastingPractice();
	//	cp.method1();
		cp.method2();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String str = sc.next();
		
		int num = 'A'; 
		int num2 = 'B';
		System.out.println("A unicode : " + num);
		System.out.println("B unicode : " + num2);

	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int x = sc.nextInt();
		
		System.out.print("영어 : ");
		int y = sc.nextInt();
		
		System.out.print("수학 : ");
		int z = sc.nextInt();
		
		int sum = (x + y + z);
		double avg = sum/3.0;
		
		System.out.printf("총점 : %d\n평균 : %.2f", sum, avg); 


		// 37 45 33
	}


}
