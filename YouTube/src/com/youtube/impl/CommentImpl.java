package com.youtube.impl;

import com.youtube.model.Comment;

// 팀 과제는 이 방식!
public interface CommentImpl {

	// C : 댓글 작성  -->  로그인된 회원만 가능!
	public void addComment(String id, String password, Comment comment);	
	
	// R : 댓글 1개 보기 
	public Comment viewComment(int index);
	
	// U : 댓글 수정  -->  로그인한 회원과 이 댓글을 작성한 작성자가 일치해야 가능
	public void updateComment(int index, Comment comment);
	
	// D : 댓글 삭제  -->  로그인한 회원과 이 댓글을 작성한 작성자가 일치해야 가능
	public void deleteComment(int index);

}
