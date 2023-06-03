package Day08;

import java.util.Calendar;

public class Ex28 {

	private static Ex28 instance;
	
	private Ex28() {}
	
	public static Ex28 getInstance() {
		
		if(instance == null) {
			instance = new Ex28();
		}	
		return instance;
	}
	void View(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		
//		만년 달력(윤년까지 처리)
//		년/월/일에 대한 설정을 진행
		
//		1. 일은 1일에서 출발하기 때문에 설정에서 고정으로 처리
//		2. 월을 0~11이기 때문에 입력받은 값에서 1을 제거
		calendar.set(year, month-1 ,1);
		
//		마지막 일에 대한 처리
		int D_day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
//		DAY_OF_MONTH : 월 기준으로 일로 표현
//		getActualMacimum : ()안에 넣어준 값 중 가장 높은 수치를 표현
		
//		요일에 대한 처리(일요일 : 1 ~ 토요일 : 7)
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
//		달력의 헤더 부분
		System.out.printf("==================%4d년 %2d월 달력==================%n", year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("==================================================");

//		공백에 대한 처리(지난 달에 있던 숫자 대신)
		for(int blank=1; blank<week; blank++ ) {
			System.out.print("\t");
		}
		
//		일에 대한 출력
		for(int i=1; i<=D_day; i++) {
			System.out.printf("%2d\t", i);
		
			if((i + week-1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n==================================================");
		
	}
}





