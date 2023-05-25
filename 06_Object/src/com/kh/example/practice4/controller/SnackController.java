package com.kh.example.practice4.controller;

import com.kh.example.practice4.model.Snack;

/*
 * controller : 사용자가 화면에서 요청한 부분을 처리하는 기능 담당
 * 이때 처리 후의 결과를 여기서 출력하는게 아니라 결과값을 다시 view(*Run 클래스)에 반환하여 view에서 처리하도록 해야 함
 * */

public class SnackController {
	
	private Snack s = new Snack(); // 이 안에서만 쓰기 때문에 private 필드 추가
	
	public SnackController() {
		
	}
	
	//  데이터를 setter를 이용해 저장하고 저장되었다는 결과를 반환하는 메서드
	public boolean saveData(Snack s) { //()안에 객체로 가져온다
		
		this.s.setKind(s.getkind()); // s의 색깔을 잘 보기
		this.s.setName(s.getname());
		this.s.setFlavor(s.getflavor());
		this.s.setNumOf(s.getnumOf());
		this.s.setPrice(s.getprice());
		
		return true;
	}

	
	// 저장된 데이터를 반환하는 메서드
	public Snack confirmData() {
		return this.s;
		
	}
}
