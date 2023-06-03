package Day08;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
//		1. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램 작성
		
		for (int i=1; i<7; i++) {
			for(int j=1; j<7; j++) {
				if(i+j == 6) {
					System.out.println(i + "+" + j + " = 6");
				}
			}
		}
		
		
//		2. 회문수를 구하는 프로그램 구현
//		회문수 : 12321, 14341, 111
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 : ");
		int palindrom = sc.nextInt();
		
//		회문수를 계산하는 로직구현
		int result = 0;			// 결과를 담을 변수
		int temp = palindrom;	// 회문수를 계산하기 위한 용도
		
//		자리수에 대한 분배 
//		회문수 계산을 위한 값이 없을 때 까지 반복
		while(temp != 0) {
			result = result*10 + temp%10;
			temp /= 10;
			System.out.println("값 계산 : " + result);
			System.out.println("계산 처리 : " + temp);
		}
		
		if(result == palindrom) {
			System.out.println("회문수 입니다.");
		} else {
			System.out.println("회문수가 아닙니다.");
		}
		
		
//		3.
		
		
	}
	
}
