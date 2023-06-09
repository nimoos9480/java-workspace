package com.kh.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림(stream)
 * - 다양한 데이터 소스를 표준화된 방법으로 다루기 위한 것
 * 
 * 스트림의 특징
 * - 데이터를 읽기만 할 뿐 변경하진 않음
 * - Iterator처럼 1회용(시점이 중요 -> 필요하면 다시 스트림 생성해야 함)
 * - 내부 반복 처리
 * 
 * 스트림의 종류
 * - java.util.stream 패키지에 존재하고 BaseStream 인터페이스를 부모로 해서 자식 인터페이스들이 상속 관계를 이루고 있음
 * 
 * Stream API
 * - 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열)의 저장 요소들을 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자
 * - 내부 반복자를 사용해서 중간 처리(intermediate), 최종 처리(terminal) 작업을 수행
 * 			- 중간 처리 : 반복, 매핑(타입변환), 필터링, 정렬 등
 * 			- 최종 처리 : 반복, 카운팅, 평균, 총합 등의 집계 처리
 * - 중간 처리와 최종 처리 메서드를 구분하는 방법은 리턴 타입을 확인하면 알 수 있음
 * 			- 리턴 타입이 Stream이면 중간 처리 메서드
 * 			- 리턴 타입이 기본 타입이거나, Optional 객체라면 최종 처리 메서드
 * - 지연된 연산 : 최종 연산이 수행되기 전까지는 중간 연산이 수행되지 않는다.
 * */

public class Create {

	public static void main(String[] args) {
		
		Create c = new Create();
//		c.method1();
//		c.method2();
		c.method3();

	}

	
	// 숫자 범위로 스트림을 생성하는 방법
	// - IntStream, LongStream, DoubleStream의 range(), rangeClosed() 메서드를 이용해서 생성
	public void method1() {
		// .range(1, 10) :  첫 번째 매개값 ~ 두 번째 매개 값 '이전'까지의 값을 요소로 가지는 스트림 객체를 생성하는 것
		IntStream stream = IntStream.range(1, 10);
		int sum = stream.sum();
		System.out.println("range의 sum : " + sum);   // 출력 -> range의 sum : 45 
		
		// 첫 번째 매개값 ~ 두 번째 '매개값 까지'의 값을 요소로 가지는 스트림 객체를 생성함
		stream = IntStream.rangeClosed(1, 10);
		sum = stream.sum();
		System.out.println("rangeClosed의 sum : " + sum); // 출력 -> rangeClosed의 sum : 55
	}
	
	
	/*
	 * 배열로부터 스트림을 생성하는 방법
	 * - Arrays.stream(배열) 메서드로 스트림을 생성함
	 * - or 각 스트림(Stream, IntStream,...)의 of(배열) 메서드로 스트림을 생성할 수도 있음
	 * */
	
	public void method2() {
		String[] names = {"노석우", "장미르", "금미리", "김준우"};
		
		// 1명씩 출력하기 위해서 기존에 for문 사용
		for(String name : names) {
			System.out.print(name + " ");       		// 출력 : 노석우 장미르 금미리 김준우 
		}
		
		System.out.println();
		
		// 스트림으로!
//		Stream<String> stream = Arrays.stream(names);
		Stream<String> stream = Stream.of(names);  // 같은 코드
		stream.forEach(name -> System.out.print(name + " "));
		
	
	}
	
	
	// 컬렉션으로부터 스트림을 생성하는 방법
	// - 컬렉션의 stream() 메서드를 이용해서 생성함
	public void method3() {
		List<String> names = Arrays.asList("김민소", "김종휘", "이지훈", "김지은");
		
		// 먼저 for문 사용해서 
		for(int i=0; i<names.size(); i++) {
			System.out.print(names.get(i)+ " ");    		// 출력 :  김민소 김종휘 이지훈 김지은 
		}
		
		System.out.println();
		
		// 스트림을 사용하여 출력
		Stream<String> stream = names.stream();
		stream.forEach(name -> System.out.print(name + " ")); // 출력 :  김민소 김종휘 이지훈 김지은 
		
	}
	
	
	
	
	

	
}