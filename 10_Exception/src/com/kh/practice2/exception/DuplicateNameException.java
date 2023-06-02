package com.kh.practice2.exception;

public class DuplicateNameException extends Exception {
	
	public DuplicateNameException() {
		this("This is DuplicateNameException...");  // 아래 메서드 호출
		
	} 
	
	public DuplicateNameException(String message) { // Exception 호출
		super(message);
		}
	

}
