package com.kh.example.practice3.model;

import java.util.Arrays;

public class Lotto {

	int[] lotto = new int[6]; // 6개 뽑는 배열

	public String information() {
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int) (Math.random() * 45 + 1);

			// 중복 제거!!
			for (int j = 0; j < i; j++) {  // 현재 생성된 로또 번호 lotto[i]와 이전에 생성된 번호 lotto[j]를 비교하기 위한 반복문
				if (lotto[i] == lotto[j]) {  // 중복된 번호가 있는지를 검사
					i--; // 중복된 번호가 있다면 i--를 수행하여 현재 번호를 다시 생성( i번째 값이 j번째 값이랑 겹칠 때 i-1 후 첫번째 for문으로 돌아가 다시 (i-1)+1을 더해서(i번째로 만들어서) 돌림)
						 // 다음 반복에서 현재 인덱스 i에 해당하는 번호가 새로 생성됨
					break;		// 중복된 번호가 발견되면 내부 반복문을 종료하고 바깥쪽 반복문의 다음 반복으로 이동(중복된 번호가 발견되면 내부 반복문을 종료하고 바깥쪽 반복문의 다음 반복으로 이동)
				}
			}
		}
		return Arrays.toString(lotto);
	}

}

