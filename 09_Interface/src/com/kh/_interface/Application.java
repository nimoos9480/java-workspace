package com.kh._interface;

import com.kh._interface.step1.Bus;
import com.kh._interface.step1.Taxi;
import com.kh._interface.step1.Vehicle;
import com.kh._interface.step2.Advanced;
import com.kh._interface.step2.Beginner;
import com.kh._interface.step2.Player;
import com.kh._interface.step2.Super;
import com.kh._interface.step3.Audio;
import com.kh._interface.step3.Television;

/*
 * 추상 클래스 : 미완성 설계도
 * 인터페이스 : 기본 설계도
 * 
 * 
 * */
public class Application {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle(); <-- 인터페이스 객체 생성 X
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();
		
		bus.run();
		taxi.run(); // 메서드 호출
		
		
		Player[] players = {new Beginner(), new Advanced(), new Super()};
		
		for(Player player : players) {
			
			player.showLevelMessage();
			player.run();
			player.jump();
			player.turn();
			
		}
		
		System.out.println();
		
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(-1);
		tv.turnOff();
		
		Audio audio = new Audio();
		audio.turnOn();
		audio.setVolume(20);
		audio.turnOff();
		
	}

}
