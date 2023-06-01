package com.kh._interface.step3;

public interface Volume {
	
	// 인터페이스 = 추상 메서드 + 상수
	
	/*public static final이 숨겨짐*/ 
	int MAX_VOLUME = 10; //(상수는 대문자!)
	int MIN_VOLUME = 0; 
	
	// 인터페이스에서 메서드는 무조건 추상 메서드!
	/*public abstract가 숨겨짐*/ void setVolume(int volume);

}
