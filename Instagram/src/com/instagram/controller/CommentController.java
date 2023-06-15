package com.instagram.controller;

import java.util.ArrayList;
import java.util.List;

import com.instagram.model.Comment;
import com.instagram.model.Posting;
import com.instagram.model.User;

// 개인 과제는 이런 방식으로
public class CommentController {
	
	ArrayList<Comment> commentList = new ArrayList<>();
	UserController uc = new UserController();
	
	// C : 댓글 작성 
	public void addComment(String id, String password, Comment comment) {
		
		if(uc.login(id, password)) {
			commentList.add(comment);  // comment 객체로 넣음
		} 
	}
	
	// R : 댓글 1개 보기 
	
	public Comment viewComment(int index) {  
		return commentList.get(index);  
	}
	
	
	// U : 댓글 수정  
	public void updateComment(int index, Comment comment) {
		commentList.set(index, comment);
	}
	
	
	// D : 댓글 삭제  
	public void deleteComment(int index) {
		commentList.remove(index);
	}
	
	// 좋아요 기능
	public void likeComment(int index) {
	    Comment comment = commentList.get(index);
	    int likes = comment.getLikes();
	    comment.setLikes(likes + 1);
	}
	
	// 좋아요 취소
	public void likeCommentCancel (int index) {
	    Comment comment = commentList.get(index);
	    int likes = comment.getLikes();
	    comment.setLikes(likes - 1);
	}
	
	// 태그하기	
	public void tagUserInComment(int index, String id) {
        Comment comment = commentList.get(index);
        comment.getTaggedUsers().add(id);
       
    
    }

 

}
