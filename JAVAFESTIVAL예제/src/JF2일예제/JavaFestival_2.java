package JF2일예제;

import java.util.Scanner;

public class JavaFestival_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numA = 0;
		int numB = 0;
		int result = 0;

		while (true) {
			System.out.print("A 입력 >> ");
			numA = sc.nextInt();
			System.out.print("B 입력 >> ");
			numB = sc.nextInt();
			result = numA - numB;

			if (numA == 0 && numB == 0) {
				System.out.println();
				break;
			}
			System.out.println("결과 >>" + result);
		}

	}
}
