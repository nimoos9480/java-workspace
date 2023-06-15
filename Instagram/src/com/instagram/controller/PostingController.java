package com.instagram.controller;

import java.util.ArrayList;

import com.instagram.model.Posting;

public class PostingController  {
	
	

	ArrayList<Posting> postingList = new ArrayList<>();
	

	public void upload(Posting posting) {
		postingList.add(posting);
	}

	
	public ArrayList<Posting> postingList() {
		return postingList;
	}

	
	public Posting viewPosting(int index) {
		return postingList.get(index);
	}

	
	public void updatePosting(int index, Posting posting) {
		postingList.set(index, posting);
	}

	
	public boolean deletePosting(Posting posting) {
		return postingList.remove(posting);
	}
	
	/*
	 * 기능뽑기 : CRUD
		Create : 추가
		Read : 읽기(1개, 목록) 
		Update : 수정 
		Delete : 삭제
	 * */	
		
	


}
