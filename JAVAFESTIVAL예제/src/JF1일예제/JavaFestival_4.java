package JF1일예제;

import java.util.Scanner;

public class JavaFestival_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 >> ");
		
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 입력 >> ");
		
		int num2 = sc.nextInt();
		
		System.out.println(num1 * (num2 % 100 % 10 ));
		System.out.println(num1 * (num2 % 100 / 10 ));
		System.out.println(num1 * (num2 / 100));
		System.out.println(num1 * num2);
		
		
		
		
		
		
		
		
		
		
	}
}
