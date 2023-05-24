package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	int[] lotto = new int[6]; // 6개 뽑는 배열

	public String information() {
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			// 중복 제거!!
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--; // i번째 값이 j번째 값이랑 겹칠 때 i-1 후 첫번째 for문으로 돌아가 다시 (i-1)+1을 더해서(i번째로 만들어서) 돌림
					break;
				}
			}
		}
		return Arrays.toString(lotto);
	}

}

