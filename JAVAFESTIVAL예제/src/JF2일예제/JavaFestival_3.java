package JF2일예제;

import java.util.Random;
import java.util.Scanner;

public class JavaFestival_3 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int ranNum1 = ran.nextInt(10);
		int ranNum2 = ran.nextInt(10);
		System.out.println(ranNum1 + "+" + ranNum2 + "=");
		int right = ranNum1 + ranNum2;
		int answer = sc.nextInt();
		
		if(answer == right) {
			System.out.println("SUCCESS!");
		} else {
			System.out.println("Fail...");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
