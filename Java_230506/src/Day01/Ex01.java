package Day01;
//	메소드 오버라이딩
//	상속관계에 있는 부모 클래스에서 이미 정의된 메소드를 자식클래스에서 같은 시그니쳐를 갖고 있는 메소드로 다시 정의하는것
//	시그니쳐 : 메소드가 가지고있는 매개변수의 리스트를 의미
//	public static void Swap(int a, int b)와 같은 메소드가 존재한다고 가정할 때, 시그니쳐는 ()안에 작성된 int a, int b를 의미
//	다른 메소드끼리의 유형, 순서가 같다면 그 메소드는 시그니쳐가 같다 라고 표현한다

//	자바에서 메소드 오버라이딩을 사용하는 이유
//	자식클래스에서 부모클래스의 기능을 그대로 사용하지 않고, 기능을 추가해서 사용하기 위해

//	메소드 오버로딩
//	하나의 이름을 가진 메소드에 시그니쳐를 바꾸는 것으로, 같은 이름의 다른 용도의 메소드를 사용하는 것을 의미
//	public static void attack()이 존재할 때, public static void attack(Item item)과 같이 아이템에 대한 정보를 요구하는 attack의 기능 같이, 비슷한 기능을 구현하기 위해 사용

//	메소드 오버라이딩의 조건
//	1. 오버라이딩은 메소드의 내용을 재정의하는 개념으로, 기존 메소드와 형태가 동일해야 함
//	2. 부모클래스의 메소드보다 더 좁은 범위의 접근제어자로 변경할 수 없음
//	3. 부모클래스의 메소드보다 더 큰 범위의 예외를 선언할 수 없음


class Coffee{
	public void taste() {
		System.out.println("맛이 쓰다");
	}
}

class Latte extends Coffee{
//	어노테이션 : 코드 사이에 주석처럼 쓰여 특별한 의미, 기능을 수행하도록 할 수 있는 메타 데이터
//	@Override : 오버라이딩을 바르게 했는지에 대한 여부를 컴파일러에서 체크함
//	@Deprecated : 앞으로 사용하지 않을 것을 권한하는 필드 / 메소드에 붙이는것은 가능
//	@SuppressWarnings : 컴파일러의 경고 메세지가 뜨지 않게 해주는 기능 (단, 함수형 인터페이스에서만 사용가능)
	
	@Override
	public void taste() {
//		super.taste();  // super는 부모의 기능을 의미
		System.out.println("맛이 달다");
		
	}
	
}


public class Ex01 {

	public static void main(String[] args) {

		Coffee coffee = new Coffee();
		Latte latte = new Latte();
		
		coffee.taste();
		latte.taste();
		
	}
	
}
