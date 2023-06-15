package com.instagram.impl;

import java.util.ArrayList;

import com.instagram.controller.UserController;
import com.instagram.model.Comment;

public interface CommentImpl {
	
	// C : 댓글 작성 
	public void addComment(String id, String password, Comment comment);
	// R : 댓글 1개 보기 
	
	public Comment viewComment(int index);
	
	
	// U : 댓글 수정  
	public void updateComment(int index, Comment comment);
	
	// D : 댓글 삭제  
	public void deleteComment(int index);
	
	// 좋아요 기능
	public void likeComment(int index);
	// 좋아요 취소
	public void likeCommentCancel (int index);
	
	// 태그하기	
	public void tagUserInComment(int index, String id);
 


}
