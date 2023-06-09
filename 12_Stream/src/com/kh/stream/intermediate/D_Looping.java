package com.kh.stream.intermediate;

import java.util.Arrays;

/*
 * 반복
 * - 요소 전체를 반복하는 역할
 * - peek() : 중간 처리 단계에서 전체 요소를 반복
 * - forEach() :  최종 처리 단계에서 전체 요소를 반복
 * */

public class D_Looping {

	public static void main(String[] args) {
		int sum = 0;
		int[] values = {1, 2, 3, 4, 5};
        				
		
		// 최종 처리 메서드가 호출되어야 동작(출력이 지연됨)
		sum = Arrays.stream(values).filter(i -> i % 2 == 0).peek(value -> System.out.println(value)).sum();  
												// 짝수인 것	           // 반복돌리기
		System.out.println("sum : " + sum);
		
		/* 출력 결과는
		 * 2
			4
			sum : 6
		 */
		
		
		// 최종 처리 메서드는 다른 최종 처리 메서드를 호출X
		sum = Arrays.stream(values).filter(i -> i %2 == 0)
//				.forEach(value -> System.out.println(value))    -> 있으면 실행 안됨
				.sum();  
		System.out.println("sum2 : " + sum);
		
		
	}

}
