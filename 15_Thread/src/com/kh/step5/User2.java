package com.kh.step5;

public class User2 extends Thread {
	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) { // 매개변수(갈색)로 가지고 온 걸 파란색에 넣기
		this.calculator = calculator;
		setName("CalculatorUser2");
	}
	
	public void run() {
		calculator.setMemory(50);
		
	}
	
	

}
