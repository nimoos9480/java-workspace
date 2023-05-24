package com.kh.example.practice2.model;

public class Circle {

	
		public final static double PI = 3.14;  // PI는 상수 = 대문자, 앞에 final 붙이기
		public int radius=1;  // 상수는 여기저기 쓰이기 때문에 static 사용
		
		public double r() { // 원의 둘레
			return radius * 2 * PI;
		}
		
		public double a() { // 원의 넓이
			return radius * radius * PI;
		}
				
		public void incrementRadius() {
			++radius ;
		}
		

	}


