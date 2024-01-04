package java복습;

import java.util.Scanner;

public class java연습장 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int jjack = 0;
		int hole = 0;

		while (true) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num % 2 == 0) {
				jjack++;
			} else if (num % 2 == 1) {
				hole++;
			} else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println("짝수개수 : " + jjack);
			System.out.println("홀수개수 : " + hole);
		}

	}
}
