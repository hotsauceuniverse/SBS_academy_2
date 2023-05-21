package Day06;

//	자바의 람다식 

//	해당 기능은 함수형 인터페이스를 체크하는 기능
//	함수형 인터페이스는 메소드를 2개 이상 가질 수 없음
@FunctionalInterface
interface Calculator {
//	람다식 구현을 위해서는 인터페이스의 메소드는 1개여야만 한다.
	int Add(int a, int b);
//	int Div(int a, int b);	// 2개 이상 존재 시, 사용 못함
}

class MyCalculator implements Calculator {
	
	@Override
	public int Add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface FI {
	void FI_method();
}

public class Ex17 {

	public static void main(String[] args) {
		
//		람다식의 기본형태
//		A a = (매개 값) -> {구현코드
		
		Calculator cal = (int a, int b) -> a + b;
		int result = cal.Add(5, 7);
		System.out.println(result);
		
//		인터페이스 선언
		FI fi;

//		기능에 맞게 인터페이스의 람다식 적용
		fi = () -> {
			System.out.println("Hello");
		};
		fi.FI_method();
		
		fi = () -> {
			System.out.println("JAVA");
		};
		fi.FI_method();
	}
	
}
