package Day01;
//	추상클래스
//	하나 이상의 추상메소드를 포함하는 클래스
//	해당 클래스를 상속할 경우, 이 클래스를 상속받는 모든 클래스는 추상메소드에 대해 반드시 오버라이딩 작업이 진행되어야 함

//	객체지향 프로그래밍 설계 기법
//	1. 캡슐화 : 연관된 속성과 기능을 하나의 형태로 만들어 데이터를 외부로부터 보호 (필드를 private, 메소드를 public)
//	2. 상속 : 기존의 클래스의 모든 기능을 물려받아 새 클래스를 만드는 것 / 클래스 간의 상하 관계, 계층구조 등을 표현 (extends로 구현)
//	3. 다형성 : 객체의 속성이나 기능이 상황에 따라 여러가지 형태로 표현되는 성질 (부모클래스 타입의 변수로 자식클래스를 생성하는 식으로 구현)
//	4. 추상화 : 불필요한 세부사항들은 제거하고, 가장 본질적이고 동통적인 부분만 추출하여 표현 (추상클래스 또는 인터페이스를 통해 구현 / 메소드에 대한 구현이 아닌 선언을 처리)

// 	추상클래스 장점
//	1. 각각의 클래스에서 다르게 작동할 메소드(오버라이딩 할 것으로 보이는 메소드)를 제약조건으로 걸어 반드시 구현하게 함으로써, 상위 클래스에서 다형성 설계가 가능해짐
//	2. 설계 입장에서 abstract method 이외의 method는 완성된, 검증된 코드로 판단하여 따로 작업하지 않고 abstract method에 대한 구현 + 추가 개발만 진행하면 되기에 부모쪽에서 잡아준 틀로 구현해 개발속도 증가
//	3. 기존의 오버라이딩의 경우, 부모의 기능을 안쓰고 아예 새롭게 구현하는 경우가 있는데, 추상메소드는 구현을 안하고 선언만 하기 떄문에 불필요한 작업을 할 필요가 줄어듬
//	4. 선언만 진행하기 떄문에, 부모측은 관리, 호출의 역할 자식측은 독립적인 개발을 보장받을 수 있음

abstract class Animal {
	abstract void cry();	// abstract 키워드가 붙은 메소드는 선언하는 것이 가능
	public void AnimalInfo() {
		System.out.println("동물의 정보");
	}
}

class Tiger extends Animal {
//	cry가 구현이 아닌 선언이 되어있기 때문에, 물려받아도 사용이 불가
//	사용하기 위해 cry를 구현해서 사용해야 한다(cry에 대한 재정의)
	
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Cat extends Animal {

	@Override
	void cry() {
		System.out.println("야용");
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
//		Animal animal = new Animal();	// 추상클래스는 미구현 코드가 존재하기 때문에 생성할 수 없음 / 생성하려면 자식클래스의 형태로 생성을 진행해야 함
		Animal animal = new Tiger();
		animal.cry();
		animal = new Cat();
		animal.cry();
		
		
	}
	
}
