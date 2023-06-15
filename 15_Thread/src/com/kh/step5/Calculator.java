package com.kh.step5;

public class Calculator { // 공유자원으로 쓸 클래스
	
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {  // synchronized로 동기화처리해 줘야 정상 작동
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
		
	}
	

}
