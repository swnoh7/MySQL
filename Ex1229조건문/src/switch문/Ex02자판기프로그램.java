package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("금액을 입력하세요.");
//		
//		int money = sc.nextInt();
//		
//		System.out.println("메뉴를 고르세요.");
//		
//		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
//		
//		int num = sc.nextInt();
//		int price = 0;
//		
//		switch(num) {
//		case 1 :
//			price = 700;
//			break;
//		case 2 :
//			price = 1000;
//			break;
//		case 3 :
//			price = 500;
//			break;
//		}
//		
//		System.out.println("잔돈 :" + (money - price) + "원");
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 금액을 입력하세요. 출력하기
		System.out.println("금액을 입력하세요 >> ");
		// 3. 입력금액 저장할 변수 선언하기
		int money = sc.nextInt();
		// 4. 메뉴판 출력하기
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >> ");
		// 5. 사용자가 선택한 메뉴 입력받기
		int menu = sc.nextInt();
		// 6. 사용자가 선택한 메뉴가 무엇인지 판단
		int change = 0;
		// 6-1 아우터(700원)을 골랐을 경우
//		if(menu == 1 && money >= 700) {
//			change = money-700;
//		// 6-2 이구동성(1000원)을 골랐을 경우
//		} else if (menu == 2 && money >= 1000) {
//			change = money-1000;
//		//6-3 에그몽(500원)을 골랐을 경우
//		} else if (menu == 3 && money >= 500) {
//			change = money-500;
//		} else if (menu == 1 && money < 700 ) {
//			change = money;
//			System.out.println("돈이 부족해요 ㅠㅠ");
//		} else if (menu == 2 && money < 1000 ) {
//			change = money;
//			System.out.println("돈이 부족해요 ㅠㅠ");
//		} else if (menu == 3 && money < 500 ) {
//			change = money;
//			System.out.println("돈이 부족해요 ㅠㅠ");
//		}
//		System.out.println("잔돈 " + change + "원 입니다.");
		
		//교수님 ver.
		// 6-1 아우터(700원)을 골랐을 경우
		// 입력한 금액이 선택한 메뉴의 금액보다 더 큰지 판단
		if(menu == 1) {
			if(money >= 700) {
				change = money-700;
			} else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		}else if (menu == 2) {
			// 6-2 이구동성(1000원)을 골랐을 경우
			if(money >= 1000) {
				change = money - 1000;
			} else {			
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		}else if (menu == 3) {
			if(money >= 500) {
				change = money - 500;
			} else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} else {
			System.out.println("메뉴를 다시 골라주세요.");
		}
			System.out.println("잔돈 " + change + "원 입니다.");
			
			int numT = change / 1000;
			int numF = (change - numT * 1000) / 500;
			int numH = (change - numT * 1000 - numF * 500) / 100;
			
			System.out.println(("천원 : " + numT + "개") + (", 오백원 : " + numF + "개") + (", 백원 : " + numH + "개"));
		}
	
	
	
}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	
