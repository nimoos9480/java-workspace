package com.instagram.model;

public class Comment {
	
	private String id;
	private String comment;	
	private User user;
	
	public Comment() {
	}
	public Comment(String id, String comment, User user) {
		this.id = id;
		this.comment = comment;
		this.user = user;
		
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
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", user=" + user + "]";
	}
	
	
	

}
