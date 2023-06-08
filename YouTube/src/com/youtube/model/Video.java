package com.youtube.model;

import java.util.Date;
import java.util.List;
import java.util.Locale.Category;

public class Video {
	
	private String title;
	private String comment;
	private Date uploadAt;
	private int views; 
	private String imgUrl;
	private String fileUrl;
	private String desc;    // 영상에 대한 설명
	private char kind;		// shorts & video 둘 중 하나!

	private List<Comment> comments;
	private Category category;
	
	

}
