package com.instagram.controller;

import com.instagram.model.User;

public class UserController {
	
	User user = null;

	
	public boolean login(String id, String password) { // 로그인
		if (user != null && user.getId().equals(id) && user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	
	public void signUp(User user) { // 회원가입
		this.user = user;
	}


	public User viewProfile() { // 프로필 보기(로그인 된 경우)
		
		if(login(user.getId(), user.getPassword())) {
			return user;
		}
		return null;
	}
	
	public User updateProfile(User user) { // 프로필 수정(로그인 된 경우)
		if(login(this.user.getId(), this.user.getPassword())) { // this.user로 변수와 구별
			this.user =  user;
		}
		return this.user;
	}


	public void deleteProfile(String id) { // 계정 삭제
		if(user.getId().equals(id)) {
			user = null;
		}
	}
	
	
	public void updateProfileImageUrl(int id, String imageUrl) {
		 if (user != null) {
			 user.setProfileImageUrl(imageUrl);
		 }
	            
	}
	
	public void increasefollowersCount(int id) {
		if(user != null) {
            user.setFollowersCount(user.getFollowersCount() + 1);
        }
	}
	
	public void increasefollowingsCount(int id) {
		if (user != null) {
            user.setFollowingCount(user.getFollowingCount()+ 1);

        }
	}


}
