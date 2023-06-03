package Day08;

import java.util.Calendar;

//	캘린더 클래스 : 날짜와 시간에 관한 처리를 할 때 사용

//	singleton : 객체의 인스턴스가 프로그램 내에서 오직 1개만 생성되는 형태
//				하나의 인스턴스를 생성하고 난 뒤, 기존의 인스턴스를 호출하는 방식
class Singleton {
//	1. 클래스 변수를 만들어준다. -> 해당값은 외부에서 접근 불가
	private static Singleton instance;
	int value = 1;
	
//	2. 생성자는 외부에서 호출할 수 없음
	private Singleton() {
		
	}
	
//	3. 클래스 변수에 대한 return함수를 만듬
	public static Singleton getInstance() {
//		인스턴스가 비어있는 상태라면 생성을 진행
		if(instance == null) {
			instance = new Singleton();
		}
//		인스턴스를 return
		return instance;
	}
	
	public void Method() {
		System.out.println("싱글톤 인스턴스를 통해 접근 성공");
		System.out.println("현재 클래스가 가지욌는 값 : " + value);
	}
	
	public void Plus() {
		System.out.println("값이 1 증가했습니다");
		value++;
	}
}


public class Ex27 {

	public static void main(String[] args) {
		
		Singleton single = Singleton.getInstance();
		single.Plus();
		Singleton twice = Singleton.getInstance();
		twice.Method();
		
//		일반적인 클래스 생성이 아닌, 메소드를 통해 생성/호출 
		Calendar time = Calendar.getInstance();
		
		time.set(2023,6,3);
		System.out.println(time.getTime());
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.MINUTE);
		
	}
	
}
