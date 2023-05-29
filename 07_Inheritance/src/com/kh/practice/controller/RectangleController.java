package com.kh.practice.controller;

import com.kh.practice.model.Rectangle;

public class RectangleController {
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 면적 : 너비 * 높이
		return  r.draw() + " / " + width*height; // ""+ 하면 숫자가 문자열로 인식됨
	
		
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		// 둘레 : 2 * (너비 + 높이)
		return r.draw() + " / " + 2*(width+height);
	}
	
}

	
	
