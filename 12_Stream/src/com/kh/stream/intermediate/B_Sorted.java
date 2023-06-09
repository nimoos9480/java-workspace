package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.kh.model.Student;

/*
 * 정렬
 * - 스트림은 최종 처리가 되기 전 중간 단계에서 요소들을 정렬해서 최종 처리 순서를 변경할 수 있다.
 * - Stream<T>은 요소 객체가 Comparable 인터페이스를 구현해야 정렬할 수 있다.
 * - IntStream, DoubleStream, LongStream은 요소를 오름차순으로 정렬한다.
 * 
 * */

public class B_Sorted {

	public static void main(String[] args) {
		
		B_Sorted b = new B_Sorted();
//		b.method1();
		b.method2();

	}
	
	
	// 요소가 기본 자료형일 때
	public void method1() {
		// 오름차순 정렬
		Arrays.stream(new int[] {3, 5, 1, 2, 4}).sorted().forEach(value -> System.out.print(value + " "));   		// 출력 : 1 2 3 4 5 
																// 정렬
		System.out.println();	
	
		// 내림차순 정렬																// 내림차순일 때
		Arrays.stream(new int[] {3, 5, 1, 2, 4}).boxed().sorted(Comparator.reverseOrder()).forEach(value -> System.out.print(value + " "));
														// boxed()추가해줘야 컴파일 에러 해결됨  	
		
	}
	
	
	// 요소가 객체일 때
	public void method2() {
		List<String> names = Arrays.asList("김민수", "구관원", "임지우", "박승환");
		
		
		// Comparable 인터페이스 구현 내용에 따라서 오름차순 정렬
		names.stream().sorted().forEach(name -> System.out.print(name + " "));   				// 출력 : 구관원 김민수 박승환 임지우 
		
		System.out.println();	
		
		// Comparable 인터페이스 구현 내용에 반대로 정렬 (내림차순 정렬)
		names.stream().sorted(Comparator.reverseOrder()).forEach(name -> System.out.print(name + " "));   	 // 출력 : 임지우 박승환 김민수 구관원 
					// boxed()추가할 필요 없음
		
		
		System.out.println();	
		
		// Student 정렬
		List<Student> students = Arrays.asList(
				new Student("김민수", 18, "남자", 80, 70),
				new Student("구관원", 12, "남자", 90, 50),
				new Student("임지우", 16, "여자", 80, 90),
				new Student("박승환", 11, "남자", 70, 100)
				);
		
		// 나이순 정렬(오름차순)
		students.stream().sorted().forEach(student -> System.out.print(student));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
