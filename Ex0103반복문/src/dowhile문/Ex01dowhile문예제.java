package dowhile문;

import java.util.Scanner;

public class Ex01dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("현재몸무게 : ");

		int nowkg = sc.nextInt();

		System.out.print("목표몸무게 : ");

		int wantkg = sc.nextInt();
		int week = 1;
		int loss = 0;
//	do {
//		week++;
//		System.out.print(week + "주차 감량 몸무게 : ");
//		loss = sc.nextInt();
//		nowkg = nowkg - loss;
//	}while(nowkg > wantkg);
//	
//	System.out.println(nowkg + "kg" + "달성!! 축하드립니다!!");

		while (true) {
			System.out.print(week++ + "주차 감량 몸무게 : ");
			loss = sc.nextInt();
			nowkg = nowkg - loss;
			if (nowkg < wantkg) {
				System.out.println(nowkg + "kg" + "달성!! 축하드립니다!!");
				break;
			}

		}

//		// 교수님 ver.
//		// 1. 입력도구 꺼내오기
//		Scanner sc = new Scanner(System.in);
//		// 2. 현재몸무게 입력하기
//		System.out.print("현재 몸무게 : ");
//		int now = sc.nextInt();
//		// 3. 목표몸무게 입력하기
//		System.out.print("목표 몸무게 : ");
//		int goal = sc.nextInt();
//		// 4. 주차별 감량 몸무게 입력받기
//		// ---> 언제 다이어트를 성공하지 모름! 주차도 변수 선언하기
//		int week = 1;
//		do {
//			week++;
//			System.out.print("주차 감량 몸무게 : ");
//			int minus = sc.nextInt();
//			// 5. 현재 몸무게 = 원래 몸무게 - 감량 몸무게 (변수 더 만들필요X)
//			now -= minus;
//			// 6 . 현재 몸무게가 목표 몸무게에 도달했는지 조건을 판단
//			if (now <= goal) {
//				System.out.println(now + "kg달성!! 축하합니다!!");
//				break;
//			}
//		} while (true);

	}
}
