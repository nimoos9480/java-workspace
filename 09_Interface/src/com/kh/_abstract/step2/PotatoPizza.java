package com.kh._abstract.step2;

public class PotatoPizza extends Pizza {
	
	

	public PotatoPizza(int price, String storeName) {
//		super(price, storeName);  // 아래처럼 표현할 수도 있음
		this.price = price; 
		this.storeName = storeName;
		
	}

	@Override
	public void topping() {
		System.out.println("Potato Topping...");
	}

}
