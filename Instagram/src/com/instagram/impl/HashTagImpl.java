package com.instagram.impl;

import java.util.List;

import com.instagram.model.HashTag;

public interface HashTagImpl {
	
	// 해시태그 생성
	public void createHashtag(HashTag newHashtag);
    
    // 해시태그 삭제
    public void deleteHashtag(int index);
    
    // 해시태그 수정
    public void updateHashtag(int index, HashTag hashtag);
    
    // 인기 해시태그 조회
    public List<HashTag> getPopularHashtags(List<HashTag> hashtags);


}