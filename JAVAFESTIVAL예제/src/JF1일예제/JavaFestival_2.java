package JF1일예제;

import java.util.Scanner;

public class JavaFestival_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 :");
		
		int money = sc.nextInt();
		
		System.out.println("잔돈 : " + money + "원");
		
		int tt = money / 10000;
		int ft = money % 10000 / 5000;
		int t = money % 5000 / 1000;
		int f = money % 1000 / 500;
		int h = money % 500 / 100;
		
		System.out.println("10000원 : " + tt + "개");
		System.out.println("5000원 : " + ft + "개");
		System.out.println("1000원 : " + t + "개");
		System.out.println("500원 : " + f + "개");
		System.out.println("100원 : " + h + "개");
		
		
		
		
		
		
		
		
		
		
	}
}
