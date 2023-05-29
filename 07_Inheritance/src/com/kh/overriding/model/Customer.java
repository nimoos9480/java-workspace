package com.kh.overriding.model;

/*
 * 모든 클래스는 Object 클래스의 후손이다.
 * 즉, 최상위 클래스는 항상 Object이다.
 * Object 클래스에 있는 모든 메서드를 사용할 수 있다.
 * */

public class Customer extends Object {

	protected String name;		// 고객 이름
	protected String grade; 		// 고객 등급
	protected int bonusPoint;		// 보너스 포인트
	protected double bonusRatio;	// 보너스 적립 비율
	
	
	public Customer() {}


	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";	// 기본 등급
		this.bonusRatio = 0.01;	// 포인트 기본 적집 비율
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getBonusPoint() {
		return bonusPoint;
	}


	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	public double getBonusRatio() {
		return bonusRatio;
	}


	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override // (오버라이딩 명시) <-- 애노테이션! '이 메서드는 재정의된 메서드이다.' 라고 컴파일러에 명확히 알려주는 역할
	public boolean equals(Object obj) { 
		Customer c = (Customer) obj; // 객체를 (형)변환 시킨 것, '다형성'에서 다시 확인 가능
				return this.name == c.name; // 같은 이름일 때 같은 결과 나오도록 하고 싶을 때 equals 재정의
	}


//	@Override
//	public String toString() {
//		return "Customer [name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint + ", bonusRatio="
//				+ bonusRatio + "]";
//	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;		// 보너스 포인트 계산
		return price; 
	}
	
	
	
}
