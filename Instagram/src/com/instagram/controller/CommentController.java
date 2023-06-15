package com.instagram.controller;

import java.util.ArrayList;
import java.util.List;

import com.instagram.model.Comment;
import com.instagram.model.User;

// 개인 과제는 이런 방식으로
public class CommentController {
	
	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	// C : 댓글 작성 
	public void addComment(String id, String password, Comment comment) {
		
		if(uc.login(id, password)) {
			comments.add(comment);  // comment 객체로 넣음
		} 
	}
	
	// R : 댓글 1개 보기 
	
	public Comment viewComment(int index) {  
		return comments.get(index);  
	}
	
	
	// U : 댓글 수정  
	public void updateComment(int index, Comment comment) {
		comments.set(index, comment);
	}
	
	
	// D : 댓글 삭제  
	public void deleteComment(int index) {
		comments.remove(index);
	}
	
	   // 좋아요 기능
    public void likeComment(int Index) {
        Comment comment = comments.get(Index);
        comments.add(comment);
    }

  
 

}
