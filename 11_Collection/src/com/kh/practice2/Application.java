package com.kh.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {


	public static void main(String[] args) {
		// HashSet 또는 TreeSet(정렬) 사용!
		// 로또번호 : 1번만 6개 무작위
		// 내 번호 : 랜덤으로 6개 번호 랜덤 계속
		// 로또번호랑 일치할 때 까지 --> equals() 사용
		
		Application a = new Application();
//		a.method1();
		a.method2();
	}

	public void method1() {

		// TreeSet 사용, size()메소드 사용
		Set<Integer> lotto = new TreeSet<>();
		
		for (int i = 0; lotto.size() < 6; i++) {  // lotto.size() < 6
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
	
		}
		
		int count = 0;
		
		// 내 번호는 계속 랜덤으로 뽑혀야 하니까 반복문 안에 반복문
		while(true) {
			TreeSet<Integer> myLotto = new TreeSet<>();
			
			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호랑 로또 번호가 일치한 지 : equals()
			// 횟수
			
			
			while(myLotto.size() < 6) {
				int choose = (int)(Math.random() * 45) + 1;
				myLotto.add(choose);
			}
			
//			for(int i = 0; myLotto.size() < 6; i++) {
//			int num2 = (int)(Math.random() * 45) + 1;
//			myLotto.add(num2);
//			}
			
			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			count++;
			
			if(lotto.equals(myLotto)) {
				System.out.println("횟수 : " + count);
				break;
				
			}
			
		} 
			

	}

	public void method2() {
		// HashSet 사용, size()메소드 사용
		HashSet<Integer> lotto = new HashSet<>();

		for (int i = 0; lotto.size() < 6; i++) { // lotto.size() < 6
			int num = (int) (Math.random() * 45) + 1;
			lotto.add(num);

		}

		List lottoList = new ArrayList(lotto);
		Collections.sort(lottoList);

		int count = 0;

		// 내 번호는 계속 랜덤으로 뽑혀야 하니까 반복문 안에 반복문
		while (true) {
			HashSet<Integer> myLotto = new HashSet<>();

			// 내 번호가 랜덤 6개 숫자 추출
			// 내 번호랑 로또 번호가 일치한 지 : equals()
			// 횟수

			while (myLotto.size() < 6) {
				int choose = (int) (Math.random() * 45) + 1;
				myLotto.add(choose);
			}

			List myLottoList = new ArrayList(myLotto);
			Collections.sort(myLottoList);

			System.out.println("로또 번호 : " + lotto);
			System.out.println("내 번호 : " + myLotto);
			count++;

			if (lotto.equals(myLotto)) {
				System.out.println("횟수 : " + count);
				break;

			}

		}

	}
}