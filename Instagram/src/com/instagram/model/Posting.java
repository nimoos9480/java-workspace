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
	
	private String language; 
	private int likesCount;
	private boolean isPublic; 
	private boolean isFeatured; 
	
	private List<String> hashtags;
    private double location;
    private List<String> comments;
    private List<User> likes;
    private List<String> shares;
	
    public Posting() {
	}

	public Posting(String title, String comment, Date uploadAt, int count, String imgUrl, String fileUrl,
			String language, int likesCount, boolean isPublic, boolean isFeatured, List<String> hashtags,
			double location, List<String> comments, List<User> likes, List<String> shares) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.language = language;
		this.likesCount = likesCount;
		this.isPublic = isPublic;
		this.isFeatured = isFeatured;
		this.hashtags = hashtags;
		this.location = location;
		this.comments = comments;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getLikesCount() {
		return likesCount;
	}

	public void setLikesCount(int likesCount) {
		this.likesCount = likesCount;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean isFeatured() {
		return isFeatured;
	}

	public void setFeatured(boolean isFeatured) {
		this.isFeatured = isFeatured;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}

	public double getLocation() {
		return location;
	}

	public void setLocation(double location) {
		this.location = location;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<User> getLikes() {
		return likes;
	}

	public void setLikes(List<User> likes) {
		this.likes = likes;
	}

	public List<String> getShares() {
		return shares;
	}

	public void setShares(List<String> shares) {
		this.shares = shares;
	}

	@Override
	public String toString() {
		return "Posting [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + ", language=" + language + ", likesCount="
				+ likesCount + ", isPublic=" + isPublic + ", isFeatured=" + isFeatured + ", hashtags=" + hashtags
				+ ", location=" + location + ", comments=" + comments + ", likes=" + likes + ", shares=" + shares + "]";
	}
    
	
	

}
