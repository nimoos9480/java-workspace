package com.kh.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class A_Date {

	public static void main(String[] args) {
		A_Date a = new A_Date();
//		a.method1();
//		a.method2();
//		a.method3();
		a.practice();
	}
	
	/*
	 * Date
	 * - java.util 패키지에 속한 날짜와 시간을 다룰 목적으로 만들어진 클래스 (JDK 1.0)
	 * - Date의 메서드는 대부분 deprecated(비권장) 되어 있지만 여전히 사용
	 * */
	
	public void method1() {
		
		// 기본 생성자로 객체를 생성하면 현재 시스템의 시간에 대한 정보를 가지고 객체 생성
		Date today = new Date();
		System.out.println(today);
		
		
		// 1970년 1월 1일 00시  -> 한국 표준 시간(KST)로 출력될 땐 그리니치 평균시(GMT)보다 +9 증가된 시간으로 표시됨
		Date when = new Date(0);
		System.out.println(when);   // Thu Jan 01 09:00:00 KST 1970  (기본 설정)
		
		System.out.println();
		
//		System.out.println("getYear : " + (today.getYear()));		//  getYear : 123		
		System.out.println("getYear : " + (today.getYear()+1900)+ "년");		//  getYear : 2023년
		
//		System.out.println("getMonth : " + (today.getMonth()));		// getMonth : 5 (0부터 시작하기 때문)	
		System.out.println("getMonth : " + (today.getMonth()+ 1) + "월");		// getMonth : 6월
		
		System.out.println("getDate : " + (today.getDate()) + "일");		// getDate : 13일
		System.out.println("getHours : " + (today.getHours()) + "시");		// getHours : 14시
		System.out.println("getMinutes : " + (today.getMinutes()) + "분");		// getMinutes : 13분
		System.out.println("getSeconds : " + (today.getSeconds()) + "초");		// getSeconds : 18초
		
		
		System.out.println();
		
		
		/*
		 * SimpleDateFormat 클래스 : 날짜 데이터를 원하는 형태로 출력할 수 있도록 하는 클래스(대소문자 구분)
		 * - y : 년도
		 * - M : 월
		 * - D : 년의 몇 번째 일
		 * - d : 월의 몇 번째 일
		 * - E : 요일
		 * - a : 오전/오후
		 * - H : 시간 (0~23)
		 * - h : 시간 (1~12)
		 * - m : 분
		 * - s : 초 
		 * 
		 * */
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(today);
		System.out.println(formatDate);			// 23-06-13 14:20:46
		
		// 2023년 6월 13일 (화) 오후 2시 21분 10초
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 dd일 (E) a h시 mm분 ss초");
		String formatDate2= sdf2.format(today);
		System.out.println(formatDate2);	
		
		// 더 간단한 방법
		sdf = new SimpleDateFormat("yyyy년 M월 dd일 (E) a h시 mm분 ss초");
		formatDate = sdf.format(today);
		System.out.println(formatDate);
	
	}
	
	/*
	 * Calendar
	 * - Date 클래스를 개선한 추상 클래스  (JDK 1.1)
	 * - 여전히 단점이 존재함
	 * */
	
	public void method2() {
//		Calendar cal = new Calendar();  ==> 추상 클래스는 객체 생성X (import 불가)
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		
		today = new GregorianCalendar();		// 태국은 BuddhistCalendar
		System.out.println(today);		// 현재 날짜
		
		System.out.println();
		
		System.out.println("YEAR : " + today.get(Calendar.YEAR) + "년");
		System.out.println("MONTH: " + ( today.get(Calendar.MONTH) + 1 ) + "월");   // 0부터 시작하기 때문에 1을 더해줘야 함(0~11, 0==1월)
		System.out.println("DATE : " + today.get(Calendar.DATE) + "일");
		
		System.out.println("HOUR : " + today.get(Calendar.HOUR) + "시");										//  HOUR : 2시   ( 0 ~ 11)
		System.out.println("HOUR_OF_DAY : " + today.get(Calendar.HOUR_OF_DAY) + "시");		//HOUR_OF_DAY : 14시  (0 ~ 23)
		
		System.out.println("MINUTE : " + today.get(Calendar.MINUTE) + "분");
		System.out.println("SECOND : " + today.get(Calendar.SECOND) + "초");
		
		System.out.println();
		
		// 날짜 지정을 해보자
		Calendar date = Calendar.getInstance();
		date.set(2023, 5, 15);
	
		System.out.println(date);
		System.out.println(date.getTime().toString());		// Thu Jun 15 14:47:28 KST 2023  (6월로 나옴)
		
		
		date.set(2023, Calendar.MAY, 15, 9, 0, 0 );
		System.out.println(date.getTime().toString());		// Mon May 15 09:00:00 KST 2023
		
		System.out.println();
		
		long timeInMillis = date.getTimeInMillis();
		System.out.println("1000분의 1초 : " + timeInMillis);		// 1970년 1월 1일부터~지금까지가(1000분의 1초 : 1684108800651)
		
		long second = timeInMillis / 1000;
		System.out.println("초 : " + second); 		// 초 : 1684108800
		
		long minute = second/60;							// 분 : 28068480
		System.out.println("분 : " + minute);
		
		long hour = minute/60;								// 시간 : 467808
		System.out.println("시간 : " + hour);
		
		long day = hour / 24;								// 일 : 19492
		System.out.println("일 : " + day);
		
		long year = day / 365;								// 년 : 53
		System.out.println("년 : " + year);
		
	
		System.out.println();
		
		// SimpleDateFormat 클래스 사용 가능!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = sdf.format(date.getTime());
		System.out.println(formatDate);					// 2023-05-15 09:00:00

		
	}
	
	// Date와 Calendar 간의 변환
	public void method3() {
		
		// 1. Calendar를 Date로 변환하기
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());	
		System.out.println(d);									// Tue Jun 13 15:19:30 KST 2023
		
		
		// 2. Date를 Calendar로 변환하기
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		System.out.println(cal2.getTime().toString());									// Tue Jun 13 15:19:30 KST 2023
	
		
	}
	
	
	// 자신이 태어난 날을 yyyy/MM/dd 형태로 입력받아 해당 날짜가 무슨 요일이었는지, 지금까지 며칠이 지났는지 계산
	// 입력된 형식이 잘못된 경우 다시 입력받기
	public void practice() {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date result = null;
		while (true) {
			System.out.print("날짜를 yyyy/MM/dd 형태로 작성 : ");
			String data = sc.nextLine();

			try {
				result = sdf.parse(data); // 지정된 형태를 입력한 경우 break;
				break;
			} catch (ParseException e) {

			}

		}

		Calendar inputDate = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		inputDate.setTime(result);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd은 E요일입니다.");
		System.out.println(sdf2.format(result));

		long day = (today.getTimeInMillis() - inputDate.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println("태어난 날부터 지금까지 " + day + "일 지났습니다.");

	}

	//	String[] arr = bd.split("/");
	//
	//	int y = Integer.parseInt(arr[0]);
	//	int m = Integer.parseInt(arr[1]);
	//	int d = Integer.parseInt(arr[2]);
	//
	//	Calendar date = Calendar.getInstance();
	//	date.set(y, m - 1, d);
//
	//	switch (date.get(Calendar.DAY_OF_WEEK)) {
	//	case 1:
	//		System.out.println("태어난 날 : 일요일");
	//		break;
	//	case 2:
	//		System.out.println("태어난 날 : 월요일");
	//		break;
//	case 3:
//		System.out.println("태어난 날 : 화요일");
//		break;
//	case 4:
//		System.out.println("태어난 날 : 수요일");
//		break;
//	case 5:
//		System.out.println("태어난 날 : 목요일");
//		break;
//	case 6:
//		System.out.println("태어난 날 : 금요일");
//		break;
//	case 7:
//		System.out.println("태어난 날 : 토요일");
//		break;
//	}
//
//	Calendar today = Calendar.getInstance(); 																		
//	long day = (today.getTimeInMillis() - date.getTimeInMillis()) / 1000 / 60 / 60 / 24;
//
//	System.out.println("태어난 지 " + day + "일이 지남");
//	break;

}
