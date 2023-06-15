package com.kh.step5;

public class SharedMemoryTest {
	
	/*
	 * 동기화(Synchronized)
	 * - 스레드가 사용 중인 객체의 작업이 끝날 때까지 사용 중인 객체에 잠금을 걸어서 다른 스레드가 접근할 수 없도록 하는 것
	 * - 동기화 처리는 무거워서 해당하는 기능에만 처리해야 함
	 * */
	
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
		
		
		 
//		CalculatorUser2 : 50
//		CalculatorUser1 : 50 (100으로 설정했는데 50 출력  -> 공유자원 생성해서 발생한 문제)
		
	}

}
