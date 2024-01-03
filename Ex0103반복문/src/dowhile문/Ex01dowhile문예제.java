package dowhile문;

import java.util.Scanner;

public class Ex01dowhile문예제 {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	
	System.out.print("현재몸무게 : ");
	
	int nowkg = sc.nextInt();
	
	System.out.print("목표몸무게 : ");
	
	int wantkg = sc.nextInt();
	int week = 0;
	int loss = 0;
//	do {
//		week++;
//		System.out.print(week + "주차 감량 몸무게 : ");
//		loss = sc.nextInt();
//		nowkg = nowkg - loss;
//	}while(nowkg > wantkg);
//	
//	System.out.println(nowkg + "kg" + "달성!! 축하드립니다!!");
	
	while(true) {
		week++;
		System.out.print(week + "주차 감량 몸무게 : ");
		loss = sc.nextInt();
		nowkg = nowkg - loss;
		if(nowkg < wantkg) {
			System.out.println(nowkg + "kg" + "달성!! 축하드립니다!!");
			break;
		}
		
	}
	
	// 1. 입력도구 가져오기
	// 2. 현재몸무게 입력하기
	// 3. 목표몸무게 입력하기
	// 4. 주차와 감량 몸무게 변수 선언
	// 5. 주차 자동으로 늘리기
	// 6. 현재 몸무게 목표 몸무게보다 클때까지 진행
	// 7 . kg달성!! 축하드립니다!! 문구 출력
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
