package if_else문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {
		System.out.println("====에버렌드에 오신 걸 환영합니다!====");
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 나이 입력받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();		
		// 3. 인원수 입력받기
		System.out.print("인원수를 입력하세요 : ");
		int people = sc.nextInt();
		// 4. 입장료 계산하기		
		// money를 0으로 초기화 - if문 안쪽에 있기때문에
		// 지금 중괄호안에 있는데 money는 중괄호안에만 적용된다.
		int money = 0;
		// 지역변수(local variable)
		// ---> {}중괄호 영역 안에서 선언된 변수는 중괄오 영역 안쪽에서만 사용이 가능하다!
		// ---> {} : scope라고도 부른다.
		if(age<20) {
			money = (int) (5000 * people * 0.5);
		} else {
			money = 5000 * people;
		}
		// 5. 결과 출력하기
		System.out.println("총" + money + "원입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
