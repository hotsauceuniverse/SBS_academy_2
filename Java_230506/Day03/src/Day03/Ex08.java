package Day03;

//	인터페이스 : 자바에서 상속을 진행하고자 할 때, 다이아몬드 상속이라는 문제로 인해 여러 부모클래스를 상속받을 수 없다.
//			  다른 클래스를 작성할 때 기본이 되는 틀을 제공하고, 다른 클래스 사이의 중간 매개 역할을 담당한다.
//			  인터페이스 내부에는 추상 메소드와 상수만 포함된다.

//	인터페이스 작성 방법 : 
//	접근제어자 interface 인터페이스명 {
//		필드 : 인터페이스 내에서 만들어진 필드는 상수
//		메소드 : 인터페이스 내에서 만들어지는 메소드는 추상 메소드
//	};

//	다이아몬드 상속 : 다중 상속을 지원하게 되었을 경우 발생하는 문제
//	class Grand {void method01() {}}
//	class Parent1 extends Grand {method01() 값 Override진행}
// 	class Parent2 extends Grand {method01() 값 Override진행}
//	class Child extends Parent1, Parent2 {}

//	인터페이스가 다중 상속이 가능한 이유 : 메소드가 직접 구현이 된 것이 아니라 선언만 된 것 이므로
interface interface01 {
//	int a;	// 인터페이스 내부의 필드 값은 선언 할 수 없음
	int data = 5;
	void Method(); // 메소드는 선언을 진행
}

//	연결 방법 : 
//	접근제어자 class 클래스명 implements 인터페이스명 {
//		인터페이스 내부의 메소드를 오버라이딩 진행해야됨
//	}

//	클래스의 상속 + 인터페이스 연결
//	접근제어자 class 자식클래스 extends 부모클래스명 implements 인터페이스명 {}

public class Ex08 implements interface01 {

	public static void main(String[] args) {
		
	}
	
	@Override
	public void Method() {
		// TODO Auto-generated method stub
		
	}
}
