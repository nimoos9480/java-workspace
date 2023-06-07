package com.kh.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.kh.set.model.Person;

/*
 * Set의 특징		(-> list와 비교해보기)
 * - 중복 없음
 * - 순서 없음
 * 
 * HashSet
 * - Set 인터페이스를 구현한 대표적인 컬렉션 클래스
 * 
 * */

public class A_HashSet {

	public static void main(String[] args) {
		A_HashSet a = new A_HashSet();
//		a. method1();
		a. method2();
		

	}
	
	public void method1() {
		Set<String> set = new HashSet<>();
		
		set.add("마동석"); 
		set.add("이준혁");
		set.add("아오키 무네타카");
		set.add("김민재");
		set.add("마동석");
		set.add("마동석");
		
		System.out.println(set); // 순서는 무작위, 반복해서 넣어도 1번만 출력
		System.out.println(set.size()); // 몇 개 들어있는지 확인
		System.out.println(set.contains("마동석")); // "마동석" 들어있는지 확인 = true
		
		set.remove("아오키 무네타카"); // 삭제할 때
		System.out.println(set);
		
		set.clear(); // 데이터 전부 삭제
		System.out.println("비었는지? " + set.isEmpty());  // <비었는지? true> 출력
		System.out.println(set);  // [] 출력
	}
	

	public void method2() {
		
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("마동석", 52)); // 나이 추가
		set.add(new Person("이준혁", 39));
		set.add(new Person("아오키 무네타카", 43));
		set.add(new Person("김민재", 44));
		set.add(new Person("마동석", 52)); 
		set.add(new Person("이준혁", 39));
		
		
		/*
		 * 객체의 주소값을 가지고 비교하기 때문에 모두 다른 객체로 인식해서 중복 제거되지 않음
		 * --> Person 클래스에서 hashCode(), equals() 메서드 재정의하면 됨
		 * */
		System.out.println(set);  //  중복제거 안되고 추가됨(객체는 생성될때마다 주소값이 달라지니 실제로는 같더라도 다르게 인식한 것)
		System.out.println(set.size()); 
		
		/*
		 * Iterator
		 * - 컬렉션에 저장된 요소를 접근하는데 사용하는 인터페이스
		 * - iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용함 
		 */
		
		Iterator<Person> it = set.iterator(); // 반환타입이 Iterator<Person>
		while(it.hasNext()) {  // .hasNext() : 읽어올 요소가 있는지 확인하는 메서드
			System.out.println(it.next());  // 반환타입이 Person .. 다음 요소를 읽어오는 역할
			// hasNext()로 읽어올 요소가 있으면 .next()를 만나 하나씩 하나씩 출력
		}
	}
	
	
	
	
	
	
	
	
}
