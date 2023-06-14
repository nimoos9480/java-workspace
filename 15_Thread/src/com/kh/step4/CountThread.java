package com.kh.step4;

public class CountThread implements Runnable {
	

	@Override
	public void run() {
		
		// 2. 카운팅 작업
		for(int i=10; i>0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			System.out.println(i);
		}
		
	}
}
