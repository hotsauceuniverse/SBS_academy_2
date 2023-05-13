package Day03;

import java.io.IOException;

//	정렬 알고리즘에 관한 구현을 Sort 인터페이스에 정의
//	정렬 알고리즘에서 공통적으로 사용될 메소드의 이름 : ascend(), descend(), description()
//	Sort인터페이스를 통해 정렬클래서 구현 : 
//		Bubble    :	인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘 
//		Quick     :	데이터 집합 내에 임의의 기준 값을 정해 부분집합으로 나눠 정렬하는 알고리즘
//		Selection : 선택된 값과 나머지 데이터를 비교해 자리를 이동시켜 정렬하는 알고리즘
//		Heap      : 트리를 기반으로 정렬을 진행하는 방법(내림 : 최대 / 오름 : 최소로 힙을 구섬)
//		Insertion : 데이터를 순회하면서 정렬이 필요한 값을 뽑아 적당한 위치에 삽입해 정렬하는 알고리즘
//	메인메소드를 가지고 있는 클래스를 Client Program으로 사용
//	사용자는 정렬 방식에 대한 입력을 받고, 입력한 값이 각 정렬 클래스의 맨 앞글자일 경우, 해당 정렬에 대한 클래스를 생성 후 선언된 메소드 호출

interface Sort {
	void ascend();
	void descend();
	void description();
}

class Bubble implements Sort {

	@Override
	public void ascend() {
		System.out.println("버블 정렬에 대한 오름차순 기능이 추가되었습니다.");
	}

	@Override
	public void descend() {
		System.out.println("버블 정렬에 대한 내림차순 기능이 추가되었습니다.");
	}

	@Override
	public void description() {
		System.out.println("버블 정렬에 대한 인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘");
	}
}

class Quick implements Sort {

	@Override
	public void ascend() {
		System.out.println("퀵 정렬에 대한 오름차순 기능이 추가되었습니다.");
	}

	@Override
	public void descend() {
		System.out.println("퀵 정렬에 대한 내림차순 기능이 추가되었습니다.");
	}

	@Override
	public void description() {
		System.out.println("퀵 정렬에 대한 인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘");
	}
}

class Selection implements Sort {

	@Override
	public void ascend() {
		System.out.println("선택 정렬에 대한 오름차순 기능이 추가되었습니다.");
	}

	@Override
	public void descend() {
		System.out.println("선택 정렬에 대한 내림차순 기능이 추가되었습니다.");
	}

	@Override
	public void description() {
		System.out.println("선택 정렬에 대한 인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘");
	}
}

class Heap implements Sort {

	@Override
	public void ascend() {
		System.out.println("힢 정렬에 대한 오름차순 기능이 추가되었습니다.");
	}

	@Override
	public void descend() {
		System.out.println("힢 정렬에 대한 내림차순 기능이 추가되었습니다.");
	}

	@Override
	public void description() {
		System.out.println("힢 정렬에 대한 인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘");
	}
}

class Insertion implements Sort {

	@Override
	public void ascend() {
		System.out.println("삽입 정렬에 대한 오름차순 기능이 추가되었습니다.");
	}

	@Override
	public void descend() {
		System.out.println("삽입 정렬에 대한 내림차순 기능이 추가되었습니다.");
	}

	@Override
	public void description() {
		System.out.println("삽입 정렬에 대한 인접한 두 수를 비교하여 오름차순 또는 내림차순으로 정렬하는 알고리즘");
	}
}

public class Ex09 {

	public static void main(String[] args) throws IOException {
//		throws IOException는 입출력에 대한 예외 상황을 잡아주는 코드
//		문자 하나만 입력하는 코드
		System.out.println("정렬 방식을 선택해주세요");
		System.out.println("Bubble, Quick, Selection, Heap, Insertion");
		int word = System.in.read();
		
//		다형성을 통해 인터페이스로 클래스 생성 진행
		Sort sort;	// 인터페이스 선언
		switch(word) {
		case 'B' : case 'b':
			sort = new Bubble();
			break;
		case 'Q' : case 'q':
			sort = new Quick();
			break;
		case 'S' : case 's':
			sort = new Selection();
			break;
		case 'H' : case 'h':
			sort = new Heap();
			break;
		case 'I' : case 'i':
			sort = new Insertion();
			break;
		default:
			System.out.println("해당 기능은 없습니다.");
			return;
		}
		sort.ascend();
		sort.descend();
		sort.description();
	}
}

//	인터페이스 사용이유
//	1. 일관되고 정형화된 개발 표준화가 가능
//		>> 틀을 작성하고, 그 틀에 대한 구현만 진행하면, 형태가 보장되기 때문
//	2. 독립적인 프로그래밍 설계가 가능
//		>> 인터페이스를 활용해 클래스 선언, 구현을 분리시킬 수 있음
//	3. 개발시간을 단축
