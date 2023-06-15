package com.instagram.model;

import java.util.List;

public class Comment {
	
	private String id;
	private String comment;	
	private User user;
	private int likes;
	private List<String> taggedUsers;
	
	public Comment() {
	}

	public Comment(String id, String comment, User user, int likes, List<String> taggedUsers) {
		super();
		this.id = id;
		this.comment = comment;
		this.user = user;
		this.likes = likes;
		this.taggedUsers = taggedUsers;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<String> getTaggedUsers() {
		return taggedUsers;
	}

	public void setTaggedUsers(List<String> taggedUsers) {
		this.taggedUsers = taggedUsers;
		
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", user=" + user + ", likes=" + likes + ", taggedUsers="
				+ taggedUsers + "]";
	}
	

}
