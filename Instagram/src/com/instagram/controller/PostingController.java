package com.instagram.controller;

import java.util.ArrayList;
import java.util.List;

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
	

	public int getPostingCount() { // 게시물 개수 확인
	    return postingList.size();
	}
	
	public void likePosting(int index) {  // 게시물 좋아요
	    Posting posting = postingList.get(index);
	    int likes = posting.getLikes();
	    posting.setLikes(likes + 1);
	}
	
	public void sharePosting(int index) { // 공유하기
		Posting posting = postingList.get(index);
		int shares = posting.getShares();
		posting.setShares(shares + 1);
	}

}
