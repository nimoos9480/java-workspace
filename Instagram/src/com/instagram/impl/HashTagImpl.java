package com.instagram.impl;

import java.util.List;

import com.instagram.model.HashTag;
import com.instagram.model.Posting;

public interface HashTagImpl {
    
	// 해시태그 생성
	public void createHashtag(HashTag newHashtag);
	
	public HashTag viewHashtag(int index);
    
    // 해시태그 삭제
    public void deleteHashtag(int index);
    
    // 해시태그 수정
    public void updateHashtag(int index, HashTag hashtag);
    
    // 해쉬태그 검색
    public Posting searchByHashtag(String hashtag);
    
    

}