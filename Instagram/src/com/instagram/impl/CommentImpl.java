package com.instagram.impl;

import com.instagram.model.Comment;

public interface CommentImpl {
	

	// C : 댓글 작성  -->  로그인된 회원만 가능!
	public void addComment(String id, String password, Comment comment);	
	
	// R : 댓글 1개 보기 
	public Comment viewComment(int index);
	
	// U : 댓글 수정
	public void updateComment(int index, Comment comment);
	
	// D : 댓글 삭제
	public void deleteComment(int index);


}
