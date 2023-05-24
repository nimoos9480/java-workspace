package com.instagram.model;

import java.util.Date;

public class Posting {
	
	public String title;
	public String comment;
	public Date uploadAt;
	public int count; // views
	public String imgUrl;
	public String fileUrl;
	
/*
 * 기능뽑기 : CRUD
	Create : 추가
	Read : 읽기(1개, 목록) 
	Update : 수정 
	Delete : 삭제
 * */	
	
	public Posting upload() { // 게시물 업로드	
		return null;
	}
	
	public Posting[] postingList() {// 게시물 목록	
		return null;
	}
	
	public Posting viewPosting(){// 게시물 1개 보기	
		return null;
	}
	
	public Posting updatePosting() {// 포스팅 수정	
		return null;
	}
	
	public boolean deletePosting() {// 포스팅 삭제
		return false;
	}

}
