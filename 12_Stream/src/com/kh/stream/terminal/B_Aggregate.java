package com.kh.stream.terminal;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * 기본 집계
 * 		- 최종 처리 기능으로 요소들을 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할
 * 		- count() : 요소의 개수를 리턴
 * 		- sum() : 요소들의 합계를 리턴
 * 		- average() : 요소들의 평균을 리턴
 * 		- max() : 요소들의 최대 요소를 리턴
 * 		- min() : 요소들의 최소 요소를 리턴
 * 		- findFirst() : 첫 번째 요소를 리턴
 * 
 *  커스텀 집계
 *  	- 스트림에서 기본 집계 메서드를 제공하지만 다양한 집계 결과물을 만들 수 있도록 reduce() 메서드 제공
 * */

public class B_Aggregate {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6};
		long count = Arrays.stream(array).count(); 					// count의 반환타입이 long이라 long으로 받음
		System.out.println("개수 : " + count);
		
		int sum = Arrays.stream(array).sum();							// sum의 반환타입이 int이라 int로 받음
		System.out.println("합계 : " + sum);
		
		/*
		 * Optional 클래스
		 * - 스트림의 최종 결과 값을 저장하는 객체
		 * - 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 설정할 수 있는 객체
		 * - getXXX() : 저장되어 있는 값을 얻기 위해 사용
		 * - isPresent() : 값이 저장되어 있는지 검사
		 * - orElse() : get()과 동일하게 저장되어 있는 값을 얻어오는데 값이 저장되어 있지 않은 경우 디폴트 값을 지정
		 * */	
		OptionalDouble average = Arrays.stream(array).average();						
		System.out.println("평균 : " + average.getAsDouble());

		OptionalInt max = Arrays.stream(array).max();
		if(max.isPresent()) {
		System.out.println("최대값 : " + max.orElse(0));     // 최대값 없으면 0 출력
		}
		
		OptionalInt min = Arrays.stream(array).min();
		System.out.println("최소값 : " + min.getAsInt());
		
		OptionalInt first = Arrays.stream(array).findFirst();
		System.out.println("첫번째 값 : " + first.getAsInt());
		
		
		// 커스텀 집계
		// array : 1, 2, 3, 4, 5, 6, -> 2 * 4* 6 = ? 
		
		/* 첫번째 방법
		 Arrays.stream(array).filter(value ->value % 2 == 0)
		.reduce((x,y) -> x*y)   	// reduce는 Optional class
		.ifPresent(value -> System.out.println(value));    
		*/
		
		
		// 두번째 방법
		IntStream stream = Arrays.stream(array);
		IntStream filter = stream.filter(value -> value % 2 == 0);   // filter의 반환타입 =  IntStream이라 여기에 담는것

		OptionalInt reduce = filter.reduce((x,y) -> x*y);
		
		System.out.println(reduce.getAsInt());   
		
		// reduce 메소드는 주어진 연산을 사용하여 요소를 반복적으로 조합하여 최종 결과를 생성함
		// filter가 없다면 1*2*3*4*5*6 의 결과가 나올 것
		
		
		
		
	}

}
