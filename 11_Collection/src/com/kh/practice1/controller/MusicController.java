package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList();
	
	public boolean addList(Music music) {
		return list.add(music); 
		//add의 반환타입이 불리언, 추가에 성공하면 true, 실패하면 false 알아서 출력됨
		
	}
	
	public boolean addAtZero(Music music) {
		try {
			list.add(0, music);
			return true;
			
		} catch(Exception e) {
			 return false;
		}
	}
	
	public ArrayList<Music> printAll(){
		
		return list;
		
	}
	
	public Music searchMusic(String title) {
			for(Music music : list) {
				if(music.getTitle().contains(title)) {  // 한 글자라도 포함될 때는 equals아니고 contain! 
					return music;
				}
			} return null;
	}
	
	public Music removeMusic(String title){
		/*for(Music m : list) {
			if(m.getTitle().equals(title)) { // 정확하게 일치할 때 equals!
				list.remove(m) // 반환타입이 boolean이라서 return 값 바로 받지 못함
				return m;
			}
			*/
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i); // 반환타입이 Object(Music)이어서 반환값이 바로 객체로 나오니까 return으로 바로 출력 
			}
		} return null;
		} 

	
	public Music setMusic(String title, Music music) { // 곡명과 아티스트 명 수정
		for (Music m : list) {
			if (m.getTitle().equals(title)) {
				return list.set(list.indexOf(m), music);  // list.set의 반환타입이 Music 이니까 바로 return으로 받기
			}	
		} return null;
}
	
	public ArrayList<Music> ascTitle() {
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone(); // 깊은 복사 & 형변환
		// 오름차순
		Collections.sort(list, new TitleAscending());
		return list;
		
	}
	
	public ArrayList<Music> descArtist() {
		ArrayList<Music> list = (ArrayList<Music>) this.list.clone();
		// 내림차순
		Collections.sort(list, new ArtistAscending().reversed());
		return list;
		
	}


}
