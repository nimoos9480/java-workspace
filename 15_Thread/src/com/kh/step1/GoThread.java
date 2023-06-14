package com.kh.step1;

public class GoThread extends Thread {
	
	public GoThread(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i=0; i<20; i++) {
			try {
				Thread.sleep(1000);  // 1초마다
			} catch (InterruptedException e) {
		} 
			String name = Thread.currentThread().getName();
			System.out.println("CurrentThread :: " + name + ", " + i);
		}
	}

}
