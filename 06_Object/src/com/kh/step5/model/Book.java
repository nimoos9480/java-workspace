package com.kh.step5.model;

public class Book {
	
	/*
	 * 캡슐화(Encapsulation) ★ 면접 때 묻는내용
	 * - ★ 정보은닉 : 외부에서 객체 접근하는데 있어서 정보를 숨기고 객체의 연산을 통해서만 접근이 가능하게 하는 것
	 * 
	 * - 외부에서 특정 객체의 데이터 및 함수를 직접 접근을 막음으로써 변경을 못하게 하고 유지보수나 확장 시 오류의 범위를 최소화 할 수 있고
	 * - 객체 내 정보손상, 오용을 방지하고, 조작법이 바뀌어도 사용방법 자체는 바뀌지 않고, 데이터가 변경되어도 다른 객체에 영향을 주지 않기 때문에 독립성이 좋고,
	 * - 처리된 결과 사용으로 이식성이 좋고, 객체를 모듈화할 수 있어 새로운 시스템의 구성에 하나의 모듈처럼 사용이 가능
	 * 
	 * */
	
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book() {}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	
// setter / getter 
	// 객체 내부의 데이터에 접근하고 조작하는 것을 캡슐화하여 객체의 무결성과 보안을 보장하며,
	// 외부에서 객체의 상태를 변경하거나 가져올 때에도 특정 규칙을 적용할 수 있어 객체의 일관성을 유지
	public String getTitle() {
		return title;
		// get 메서드는 보통 해당 변수의 값을 반환하는 역할, 클래스 외부에서 객체의 내부 상태에 접근할 때 사용
	}
	
	public void setTitle(String title) { // 매개변수(String title)를 받아 title 변수에 넣는 것
		this.title = title;
		// set 메서드는 일반적으로 매개변수를 받아서 해당 변수에 값을 할당하는 기능을 수행
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public double getDiscountRate() {
		return discountRate;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	public String toString() {
		return "title : " + title + ", price " + price + ", dircountRate : " + discountRate + ", author : " + author;
	}
	
	/*
	 * 
	 * 생성자임에도 private으로 쓰는 경우가 있다
	 * 
	 * [싱글톤] : 특정 클래스의 인스턴스가 오직 하나만 생성되는 것을 보장(전역적으로 접근 가능 : 여러 개의 객체가 동일한 자원에 접근해야 하는 경우 사용) 
	 * 
	 * private static Book singleton = new Book();
	 * private Book() {}
	 * public static Book getInstance() {
	 *  if(singleton == null) singleton = new Book();
	 *  return singleton; 
	 * }
	 * 
	 * 
	 * 
	 * */
	
	
}
