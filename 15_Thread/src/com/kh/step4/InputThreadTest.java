package com.kh.step4;

import javax.swing.JOptionPane;

public class InputThreadTest {

	public static void main(String[] args) {

		Thread t = new Thread(new CountingThread());
		t.start();

		// 1. 데이터 입력
		String input = JOptionPane.showInputDialog("최종 로또 번호를 입력하세요...");
		System.out.println("입력하신 숫자는 " + input + " 입니다.");

//		CountThread ct = new CountThread();
//		CountPrintThread cpt = new CountPrintThread();
//				
//		Thread tct = new Thread(ct, "CountThread");
//		Thread tcpt =  new Thread(cpt,"CountPrintThread");
//		
//		tct.start();
//		tcpt.start();

	}

}

class CountingThread implements Runnable {

	@Override
	public void run() {

		// 2. 카운팅 작업
		for (int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(i);

		}

	}
}