package com.kh.example.practice2;

import com.kh.example.practice2.model.Circle;

public class Run {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		System.out.println("원의 둘레 : " + c.r());
		// System.out.println(2*c.radius*Cicle.PI);
		System.out.println("원의 넓이 : " + c.a());
		// System.out.println(c.radius*c.radius*Cicle.PI);

		System.out.println();
		
		c.incrementRadius();
		{
			System.out.println("원의 둘레 : " + c.r());
			System.out.println("원의 넓이 : " + c.a());	
		}
			
			

	}


}
