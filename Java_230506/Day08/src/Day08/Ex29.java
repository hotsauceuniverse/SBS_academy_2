package Day08;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
//		해당 클래스에서는 년도, 월에 대한 입력을 받아 Calendar2023(Ex28) 클래스의 기능인 View의 인자값으로 넘겨준다.
		
		Scanner sc = new Scanner(System.in);
		Ex28 cal = Ex28.getInstance();
		
		
		System.out.println("년을 입력하세요.");
		int year = sc.nextInt();
		
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		cal.View(year, month);
		
		sc.close();
	}
	
}
