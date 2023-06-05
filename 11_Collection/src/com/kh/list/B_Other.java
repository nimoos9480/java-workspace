package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class B_Other {
	public static void main(String[] args) {
		B_Other b  = new B_Other();
//		b.method1();
//		b.method2();
		b.method3();
	}
	
	
	// Vector
	// - 동기화된(synchronized) 메서드로 구성
	public void method1() {
		Vector v = new Vector();
		v.add(0);
		v.add(1);
		
		v.trimToSize(); // 공간을 사이즈에 맞추게 해줌
		v.add(3);
		v.add(4);
		
		v.ensureCapacity(5); // capacity : 8로 변경 ==> 남아있는 공간의 2배로 늘려줌

		v.setSize(10); // size  : 나머지가 null로 채워[0, 1, 3, 4, null, null, null, null, null, null]
		
		v.clear(); // capacity는 그대로 남아있음
		v.trimToSize();  // 여기까지 해줘야 capacity 까지 지워짐
		
	
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity : " + v.capacity()); // 기본 : 10, 공간의 크기
		
		
	}
	
	
	// 스택(Stack) : (스택은 클래스)
	// - 마지막에 저장한 것을 제일 먼저 꺼내는 LIFO(Last In First Out) 구조 
	public void method2() {
		
		Stack s  = new Stack();
		s.push(0); // 더할 때
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.pop(); // 빼낼 때  -> 3이 빠짐
		s.push(4);
		s.pop(); // -> 4 빠짐
		
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop(); // -> 7 빠짐
		
		System.out.println(s); // [0, 1, 2, 5, 6]
		
	}
	
	// 큐(Queue) : 처음에 저장한 것을 제일 먼저 꺼내는 FIFO(First In First Out) 구조  
	// (큐는  인터페이스)
	public void method3() {
		Queue q = new LinkedList();
		
		q.offer(0); // Queue 더할 때
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		q.poll(); // Queue 뺄 때 -- > 0 빠짐
		q.add(4); // LinkedList 더할 때
		
		q.remove(); // LinkedList 뺄 때 --> 1 빠짐
		
		q.add(5);
		q.add(6);
		q.add(7);
		q.remove(); // --> 2 빠짐
		
		System.out.println(q); // [3, 4, 5, 6, 7] 출력

		
	}

}
