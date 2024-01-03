package JF1일예제;
import java.util.Scanner;

public class JavaFestival_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		
		int time = sc.nextInt();
		
		int timepay = 5000;
		int pay = 0;
		
		if(time > 8) {
			pay = (int) (timepay * 8 + timepay * (time - 8) * 1.5);
		} else { 
			pay = timepay * time;
		}
		
		System.out.println("총 임금은" + pay + "원 입니다.");
		
	
		
		
		
		
		
		
		
		
	}

}
