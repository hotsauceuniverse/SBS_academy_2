package Day02;

import Day02.A.C;
//	인스턴스는 클래스의 형태로 생성된 것 -> 객체 
//	멤버는 클래스 안에 있는 것을 의미. 필드 / 메소드 / 내부클래스 등..
//	정적은 클래스의 객체 생성 없이 클래스 그 자체의 값을 사용할 수 있게 해주는 키워드
//	정적 필드, 정적 메소드는 객체를 생성하지 않고 접근하는 개념
//	인스턴스 필드, 인스턴스 메소드는 객체를 생성해야 접근하는 개념

class A {
	public class B {
		public B() {
			System.out.println("b객체생성 완료");
		}
	}
	public void onCreate() {
		B b = new B();
	}
	static class C {
		public C() {
			System.out.println("c객체생성 완료");
		}
	}
} 

public class Ex07 {

	public static void main(String[] args) {
		A a = new A(); // 이때 A큻래스의 형태로 만들어진 a는 인스턴스 
		a.onCreate();
		C c = new C();
		
	}
	
}
