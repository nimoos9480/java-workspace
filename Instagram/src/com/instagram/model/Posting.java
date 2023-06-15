package com.instagram.model;

import java.util.Date;
import java.util.List;



public class Posting {
	
	private String title;
	private String comment;
	private Date uploadAt;
	private int count; // views
	private String imgUrl;
	private String fileUrl;
	
	private List<String> hashtags;
    private int likes;
    private int shares;
    
	public Posting() {
	}

	public Posting(String title, String comment, Date uploadAt, int count, String imgUrl, String fileUrl,
			List<String> hashtags, int likes, int shares) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.hashtags = hashtags;
		this.likes = likes;
		this.shares = shares;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getShares() {
		return shares;
	}

	public void setShares(int shares) {
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "Posting [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + ", hashtags=" + hashtags + ", likes=" + likes
				+ ", shares=" + shares + "]";
	}
	

	

	
}
