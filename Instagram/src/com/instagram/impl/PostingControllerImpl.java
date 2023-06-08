package com.instagram.impl;

import com.instagram.model.Posting;

public interface PostingControllerImpl {
	
	public Posting upload(); // 게시물 업로드	
	
	public Posting[] postingList(); // 게시물 목록	
		
	public Posting viewPosting(); // 게시물 1개 보기	
	
	public Posting updatePosting();  // 포스팅 수정	
	
	public boolean deletePosting(); // 포스팅 삭제

}
