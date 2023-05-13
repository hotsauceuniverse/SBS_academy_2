package Day03;

//	예외(Exception)
//	실행중인 프로그램을 비정상적으로 종료시키는 오류의 일종

//	try {
//		예외가 발생할 수 있는 명령문이 포함된 코드를 작성하는 위치
//	} catch(예외클래스 변수명) {
//		해당 예외가 발생했을 때, 실행할 명령문
//	} finally {
//		해당 구문을 넣었을 경우 위의 catch와 상관없이 무조건 실행될 코드에 대한 작업을 하는 위치
//	}

public class Ex10 {

	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 0;
		int result = 0;
		
		try {
			result = number1 / number2;
			System.out.println("result = " + result);
		} catch(ArithmeticException e) {
			System.out.println("Division Zero");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
}
