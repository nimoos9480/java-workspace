package com.instagram.controller;

import java.util.ArrayList;
import java.util.List;

import com.instagram.model.Comment;

// 개인 과제는 이런 방식으로
public class CommentController {
	
	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();
	
	// C : 댓글 작성  -->  로그인된 회원만 가능!
	public void addComment(String id, String password, Comment comment) {
		
		if(uc.login(id, password)) {
			comments.add(comment);  // comment 객체로 넣음
		} 
	}
	
	// R : 댓글 1개 보기 
	
	public Comment viewComment(int index) {  // 반환타입 Comment로 변경해줌
		return comments.get(index);  // 인덱스를 받아옴
	}
	
	
	// U : 댓글 수정  -->  로그인한 회원과 이 댓글을 작성한 작성자가 일치해야 가능
	public void updateComment(int index, Comment comment) {
		comments.set(index, comment);
	}
	
	
	// D : 댓글 삭제  -->  로그인한 회원과 이 댓글을 작성한 작성자가 일치해야 가능
	public void deleteComment(int index) {
		comments.remove(index);
	}
	

}
