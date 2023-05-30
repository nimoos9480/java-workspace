package com.kh.loop;

import java.util.Scanner;

class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
    /*
        사용자로부터 숫자(1~100) 1개가 입력되었을 때 카운트다운 출력하시오.
        사용자 입력 : 5
        5
        4
        3
        2
        1
     */
    public void method1() {

    	System.out.print("숫자(1~100) 1개를 입력하세요 > ");
		int num = sc.nextInt();
    	
    	for(int i=num; i>=1; i--) {
			System.out.println(i);
			}
    }

    // 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100 이상 되는지 출력하시오.
	public void method2() {

		int sum = 0;
		int i = 0;

		while (sum<100) {
			++i;
			if (i % 2 == 0) { 
			sum -= i;
			} else sum += i;
		} System.out.println(i + "까지 더해야 총합이 " + sum + "이상 된다.");
			
		}
		  


    /*
        사용자로부터 문자열을 입력 받고 문자열에서 검색될 문자를 입력 받아 해당 문자열에 그 문자가 몇 개 있는지 개수를 출력하세요. 

        문자열 : banana
        문자 : a
        banana 안에 포함된 a 개수 : 3

    */
	public void method3() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
	}
    
		
   

    /*
        0이 나올 때까지 숫자를 출력하시오. (random 사용!) 범위 (1~10)
        7
        3
        4
        2
        3
        4
        0
     */

    public void method4() {
    	// 범위가 1~10이라고 하셔서 1 나올때까지 출력하는 걸로 구했습니다
    	int num = 0;
    	
    	do {
    		num = (int)((Math.random() * 10)+1);
    		System.out.println(num);
    	} while (num!=1);
   
    }

		

    /*
        주사위를 10번 굴렸을 때 각 눈의 수가 몇 번 나왔는지 출력하세요. (random 사용!)

        1 : 3
        2 : 2
        3 : 1
        4 : 0
        5 : 4
        6 : 0

     */
    public void method5() {

    		int count1 = 0; // 1 눈의 수 카운트 변수
    		int count2  = 0;
    		int count3 = 0;
    		int count4 = 0;
    		int count5 = 0;
    		int count6 = 0;
    		
    		for(int i=0; i<10; i++) { 
    			int num = (int)((Math.random()*6) + 1);
//        		System.out.print(num + " ");
    			
    			if(num==1) {
    				count1++;
    			} else if(num==2) {
    				count2++;
    			} else if(num==3) {
    				count3++;	
    			} else if(num==4) {
    				count4++;
    			} else if(num==5) {
    				count5++;
    			} else {
    				count6++;
    			}
    		}
    		
    		System.out.println("1 : "+ count1);
			System.out.println("2 : "+ count2);
			System.out.println("3 : "+ count3);
			System.out.println("4 : "+ count4);
			System.out.println("5 : "+ count5);
			System.out.println("6 : "+ count6);

 }	
		
    				

    /*
        사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 
        컴퓨터가 가위인지 보인지 주먹인지는 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
        사용자가 이겼을 때 반복을 멈추고 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.


        당신의 이름을 입력해주세요 : 
        가위바위보 : 가위
        컴퓨터 : 가위
        박신우 : 가위
        비겼습니다.

        가위바위보 : 가위 
        컴퓨터 : 바위
        박신우 : 가위
        졌습니다 ㅠㅠ

        가위바위보 : 보
        컴퓨터 : 바위
        박신우 : 보
        이겼습니다 !
    */
	public void method6() {

		int com = (int) ((Math.random() * 3) + 1);
		boolean run = true;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();

		while (run) {

			System.out.print("가위바위보 : ");
			String user = sc.nextLine();

			System.out.print("컴퓨터 : ");

			if (com == 1) {
				System.out.println("가위");
			} else if (com == 2) {
				System.out.println("바위");
			} else if (com == 3) {
				System.out.println("보");
			}

			System.out.println(name + " : " + user);

			if (com == 1) {
				if ("가위".equals(user)) {
					System.out.println("비겼습니다."); count1++;
				} else if ("보".equals(user)) {
					System.out.println("졌습니다ㅠㅠ"); count2++;
				} else if ("바위".equals(user)) {
					System.out.println("이겼습니다!"); count3++;
					break;

				}
			}

			if (com == 2) { // 컴퓨터 바위
				if ("가위".equals(user)) {
					System.out.println("졌습니다ㅠ"); count2++;
				} else if ("바위".equals(user)) {
					System.out.println("비겼습니다."); count1++;
				} else if ("보".equals(user)) {
					System.out.println("이겼습니다!"); count3++;
					break;

				}
			}

			if (com == 3) { // 컴퓨터 보
				if ("바위".equals(user)) {
					System.out.println("졌습니다ㅠ"); count2++;
				} else if ("보".equals(user)) {
					System.out.println("비겼습니다."); count1++;
				} else if ("가위".equals(user)) {
					System.out.println("이겼습니다!"); count3++;
					break;
				} 
				
			} 
		} System.out.println(count1 +"번 비기고 "+ count2 + "번 지고 " + count3 + "번 이겼다");  // 멈춘뒤 출력이니까 while문 바깥으로 빼기
	}


//			switch (com) {
//			case 1: // 컴퓨터 가위
//				if ("가위".equals(user)) {
//					System.out.println("비겼습니다.");
//				} else if ("보".equals(user)) {
//					System.out.println("졌습니다ㅠㅠ");
//				} else if ("바위".equals(user)) {
//					System.out.println("이겼습니다!");
//					run = false;
//
//				}
//				
//			case 2: // 컴퓨터 바위
//				if ("가위".equals(user)) {
//					System.out.println("졌습니다ㅠ");
//				} else if ("바위".equals(user)) {
//					System.out.println("비겼습니다.");
//				} else if ("보".equals(user)) {
//					System.out.println("이겼습니다!");
//					run = false;
//
//				}
//				
//			case 3: // 컴퓨터 보
//				if ("바위".equals(user)) {
//					System.out.println("졌습니다ㅠ");
//				} else if ("보".equals(user)) {
//					System.out.println("비겼습니다.");
//				} else if ("가위".equals(user)) {
//					System.out.println("이겼습니다!");
//					run = false;
//				}
//			}
//		}

//	}
    		




    public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
//		lp.method1();
//		lp.method2();
//		lp.method3();
//		lp.method4();
//		lp.method5();
		lp.method6();

}
}
