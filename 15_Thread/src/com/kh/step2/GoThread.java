package com.kh.step2;

public class GoThread implements Runnable  {

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
