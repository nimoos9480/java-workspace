package com.instagram.model;

import java.util.List;

public class User {	
	
	private String email;
	private String phone;
	private String id;
	private String password;
	private String nickName;
	private char gender;
	
	private String profileImageUrl;
	private int followersCount;  //팔로워수
	private int followingCount;  // 팔로잉 수
	
	Posting posting;
	
	public User() {
	}

	public User(String email, String phone, String id, String password, String nickName, char gender,
			String profileImageUrl, int followersCount, int followingCount, Posting posting) {
		super();
		this.email = email;
		this.phone = phone;
		this.id = id;
		this.password = password;
		this.nickName = nickName;
		this.gender = gender;
		this.profileImageUrl = profileImageUrl;
		this.followersCount = followersCount;
		this.followingCount = followingCount;
		this.posting = posting;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public int getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(int followersCount) {
		this.followersCount = followersCount;
	}

	public int getFollowingCount() {
		return followingCount;
	}

	public void setFollowingCount(int followingCount) {
		this.followingCount = followingCount;
	}

	public Posting getPosting() {
		return posting;
	}

	public void setPosting(Posting posting) {
		this.posting = posting;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", phone=" + phone + ", id=" + id + ", password=" + password + ", nickName="
				+ nickName + ", gender=" + gender + ", profileImageUrl=" + profileImageUrl + ", followersCount="
				+ followersCount + ", followingCount=" + followingCount + ", posting=" + posting + "]";
	}



}
