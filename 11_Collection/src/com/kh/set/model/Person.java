package com.kh.set.model;

import java.util.Objects;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) { 
//		return this.age == o.age ? 0 : this.age > o.age ? 1 : -1;   // 나이 순 오름차순 정렬
		// 내가 가져온 age가 받아온 매개변수(o)의 age와 같으면 0, 크면 양수, 작으면 음수		
		
//		return this.age - o.age; // 위와 동일한 의미
		
//		return (this.age - o.age) * -1; // 나이가 많은 순으로 내림차순 정렬할 때 '* -1' 해주면 됨
		
		return this.name.compareTo(o.name) * -1; // 이름 내림차순으로 정렬
	}
	
	
	

}
