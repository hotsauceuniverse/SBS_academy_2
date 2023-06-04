package Day09;

import java.util.*;

public class Ex32 {

//	공통으로 사용할 필드 값
	Scanner sc = new Scanner(System.in);
	
	int[] number = new int[3];
	int[] user;
	
	int strike;
	int ball;

//	랜덤숫자 생성 후 배열에 저장기능
	public void Init() {
		Set<Integer> numberSet = new HashSet<Integer>();
//		자료구조 Set를 이용해 데이터를 표현
//		Set은 중복값을 허용하지 않는 자료구조
//		Set안에 들어간 데이터가 3개가 될 때까지 반복 진행
	
		while(numberSet.size() < 3) {
			numberSet.add((int)(Math.random() * 9+1));
		}
//		반복자를 이용해서 numberSet이 가지고 있는 데이터를 배열에 추가
//		반복자는 자료구조에서 공통적으로 사용할 수 있는 요소를 순차적으로 반복하는 도구
		Iterator<Integer> iter = numberSet.iterator();
//		numberSet이 가지고 있는 데이터가 순서대로 저장
		
//		배열의 인덱스를 표현
		int index = 0;
//		반복자가 값을 가지고 있는 동안 반복
		while(iter.hasNext()) {
//			반복자가 가지고 있는 값을 전달하고, 반복자는 다음 값으로 처리
			number[index++] = iter.next().intValue();
		}
	}
	
//	3개의 정수를 입력받아서 배열에 저장하는 기능
	public void Input() {
		int first, second, last;
		
		do {
			System.out.println("중복되지 않는 정수 3개를 순서대로 입력하세요 : ");
			first = sc.nextInt();
			second = sc.nextInt();
			last = sc.nextInt();
			
			if(first == second || first == last || second == last) {
				System.out.println("중복되는 숫자는 입력할 수 없습니다.");
			}
			
		} while(first == second || first == last || second == last);
		
//		사용자 배열에 대한 재 할당을 진행
		user = new int[] {first, second, last};
	}
	
//	작성한 값에 대한 판정
	public void Check() {
//		시작 시, 스트라이크, 볼 등에 대한 체크를 초기화
		strike = 0;
		ball = 0;
		
//		랜덤값에서 사용자가 입력한 값을 반복시켜 조사
		for(int i=0; i<number.length; i++) {
//			사용자가 입력한 값을 반복시켜 조사
			for(int j=0; j<user.length; j++) {
//				i와 j가 위치마저 같다면 스트라이크 증가
				if(number[i] == user[j]) {
					if(i==j) {
						strike++;
//						값만 같다면 볼증가
					} else {
						ball++;
					}
				}
			}	
		}
		
//		결과에 대한 출력 코드
		if(strike == 0 && ball == 0) {
			System.out.println("아웃");
		} else {
			System.out.printf("%d %d %d %dS %dB%n", user[0], user[1], user[2], strike, ball);
		}
	}
	
//	게임이 시작 할 시, 실행될 메소드
	public void Update() {
//		난수생성
		Init();
		
		int count = 0;	// 몇회차에 맞췄는지 체크
		do {
			count++;	// 기회 1추가
			Input();	// 입력
			Check();	// 상태 체크
		} while(strike != 3);	// 스트라이크 3이 나올때 까지 반복
		
		System.out.printf("%d 회차 클리어 성공%n", count);
	}
	
	public static void main(String[] args) {
	
		Ex32 sol = new Ex32();
		sol.Update();
		
	}
	
}
