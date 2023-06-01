package com.instagram.controller;

import com.instagram.model.User;

public class UserController implements UserControllerImpl {

	@Override
	public boolean login() {
		return false;
	}

	@Override
	public boolean signUp() {
		return false;
	}

	@Override
	public User viewProfile() {
		return null;
	}

	@Override
	public User updateProfile() {
		return null;
	}

	@Override
	public boolean deleteProfile() {
		return false;
	}
	
	//기능뽑기 : CRUD(Create Read Update Delete)


}
