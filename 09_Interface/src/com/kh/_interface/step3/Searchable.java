package com.kh._interface.step3;

public interface Searchable {
	
	void search(String url);  
	void turnOn();  // 메소드가 중복으로 있어도 에러가 나지 않는다
	void turnOff();
	
	

}
