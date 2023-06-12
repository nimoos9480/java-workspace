package com.kh.stream.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.kh.model.Student;

/*
 * 수집
 * - 최종 처리 기능으로 필터링 또는 매핑한 요소들을 새로운 컬렉션으로 담아서 리턴하는 collect()를 제공
 * 
 * */ 

public class C_Collect {

	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student("김종인", 17, "남자", 90, 100),
				new Student("박승환", 16, "남자", 70, 80),
				new Student("박진실", 15, "여자", 80, 90),
				new Student("김민수", 14, "남자", 100, 70),
				new Student("문병철", 18, "남자", 90, 60)
				);
		
		// List 컬렉션으로 수집 -> 수학점수가 90점 이상인 사람들만
		ArrayList<Student> list = students.stream().filter(student -> student.getMath() >= 90)
//													.collect(Collectors.toList());   //  ==> List로 반환
													.collect(Collectors.toCollection(()-> new ArrayList<>()));   // ==> ArrayList로 반환
		System.out.println(list);
		
		
		// Set 컬렉션으로 수집
		Set<Student> set =  students.stream()
											.filter(student -> student.getAge() <= 16)
//											.collect(Collectors.toSet());
											.collect(Collectors.toCollection( () -> new HashSet<>()));
		System.out.println(set);
		
		// Map 컬렉션으로 수집
		Map<String, Integer> map = students.stream()
														.collect(Collectors.toMap(student -> student.getName(), student -> student.getAge()));
		HashMap<String, Integer> hMap = (HashMap<String, Integer>) map;
												
		System.out.println(hMap);

	}

}
