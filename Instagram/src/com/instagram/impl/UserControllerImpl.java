package com.instagram.impl;

import com.instagram.model.User;

public interface UserControllerImpl {
	
	public boolean login(String id, String password);
	
	public void signUp(User user);

	public User viewProfile();
	
	public User updateProfile(User user);
	
	public void deleteProfile(String id);
	
	public void updateProfileImageUrl(int id, String imageUrl);
	
	public void increasefollowersCount(int id);
	
	public void increasefollowingsCount(int id);



}
