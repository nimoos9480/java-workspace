package com.instagram.controller;

import java.util.ArrayList;
import java.util.List;

import com.instagram.model.HashTag;
import com.instagram.model.Posting;

public class HashTagController {
	
	List<HashTag> hashtags = new ArrayList<>();

	// 해시태그 생성
	public void createHashtag(HashTag newHashtag) {
	    hashtags.add(newHashtag);
	}
	
	public HashTag viewHashtag(int index) {
		return hashtags.get(index);
	}
    
    // 해시태그 삭제
    public void deleteHashtag(int index) {
       hashtags.remove(index);
    }
    
    // 해시태그 수정
    public void updateHashtag(int index, HashTag hashtag) {
    	hashtags.set(index, hashtag);
    }
    
    // 인기 해시태그 조회
    public static List<HashTag> popularHashtags(List<HashTag> hashtags) {
        return hashtags;
    }

    
    }