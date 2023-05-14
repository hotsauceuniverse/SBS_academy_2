package Day04;

import java.util.Stack;

//	자료구조 Stack
//	데이터를 쌓는 자료 구조
//	1. 그래프의 깊이 우선 탐색 구조에서 많이 활용되는 자료구조
//	2. 재귀적 함수에 대한 호출을 진행할 때 활용되는 자료구조
//	3. 해킹에서 공격 시도 시, 사용되는 영역

//	자료구조 공부 시, 필요한 개념
//	1. 래퍼 클래스(Wrapper Class) : 자료의 형태를 클래스화한 것
//		int -> Integer / float -> Float / char -> Character .... 
//	2. 제네릭(Generic) : 데이터 타입의 일반화
//		클래스<Type>의 형태 / Type에는 데이터의 형태를 작성(클래스)

public class Ex12 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack();
		Stack notGeneric = new Stack();
		
//		1. 스택의 값을 추가하는 기능
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		notGeneric.push(1);
		notGeneric.push("1");
		
//		2. 스택의 값을 삭제하는 기능
		stack.pop();	//	pop은 스택의 마지막값을 삭제하는 기능
		
//		3. 스택의 가장 위의 값을 출력하는 기능
		stack.peek();
		
		
	}
	
}
