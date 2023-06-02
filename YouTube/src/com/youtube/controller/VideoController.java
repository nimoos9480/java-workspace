package com.youtube.controller;

import com.youtube.model.Video;

public class VideoController  {
	
	/*
	 * 기능뽑기 : CRUD
		Create : 추가
		Read : 읽기(1개, 목록) 
		Update : 수정 
		Delete : 삭제
	 * */	
		
	
	Video[] videoList = new Video[5];
	int index = 0;
	

	public void upload(Video video) { // 영상 업로드
		videoList[index++] = video; // 인덱스를 하나씩 추가할때마다 비디오를 담는다
	}

	
	public Video[] videoList() {  // 동영상 목록
		return videoList;
	}

	
	public Video viewVideo(int index) { // 동영상 1개 보기
		return videoList[index];
	}

	
	public void updateVideo(int index, Video video) {
		videoList[index] = video;
		
	}

	
	public boolean deleteVideo() {
		return false;
	}
	
	
	
	


}
