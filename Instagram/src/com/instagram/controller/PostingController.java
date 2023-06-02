package com.instagram.controller;

import com.instagram.model.Posting;

public class PostingController  {

	Posting[] postingList = new Posting[5];
	int index = 0;

	
	public void upload(Posting posting) {
		postingList[index++] = posting;
	}

	
	public Posting[] postingList() {
		return postingList;
	}

	
	public Posting viewPosting(int index) {
		return postingList[index];
	}

	
	public void updatePosting(int index, Posting posting) {
		postingList[index] = posting;
	}

	
	public boolean deletePosting() {
		return false;
	}
	
	/*
	 * 기능뽑기 : CRUD
		Create : 추가
		Read : 읽기(1개, 목록) 
		Update : 수정 
		Delete : 삭제
	 * */	
		
	


}
