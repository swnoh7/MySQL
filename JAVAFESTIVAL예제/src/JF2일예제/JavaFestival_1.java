package JF2일예제;

import java.util.Scanner;

public class JavaFestival_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int nowkg = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int wantkg = sc.nextInt();
		int week = 0;
		int loss = 0;
		
		do {
			week++;
			System.out.print(week + "주차 감량 몸무게 : ");
			loss = sc.nextInt();
			nowkg = nowkg - loss;
		}while(nowkg > wantkg);
		
		System.out.println(nowkg + "kg달성!! 축하합니다!!");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
