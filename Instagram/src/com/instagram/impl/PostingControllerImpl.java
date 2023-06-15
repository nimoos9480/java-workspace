package com.instagram.impl;

import java.util.ArrayList;

import com.instagram.model.Posting;
import com.instagram.model.User;

public interface PostingControllerImpl {
	
	public Posting upload(Posting posting); // 게시물 업로드	
	
	public Posting[] postingList(); // 게시물 목록	
		
	public Posting viewPosting(int index); // 게시물 1개 보기	
	
	public Posting updatePosting(int index, Posting posting);  // 포스팅 수정	
	
	public boolean deletePosting(Posting posting); // 포스팅 삭제
	
	public int getPostingCount();
	
	public void likePosting(int index);
	
	public void sharePosting(int index);
	

}
