package Day04;

import java.util.Scanner;
import java.util.Stack;

//	StackImplements
//	스택을 배열을 이용해 구현

class Array_Stack {
	int[] stack;
	int index;
	int size;
	
	public Array_Stack(int size) {
		this.size = size;
		stack = new int[size];	//size크기만큼 배열 할당
		index = -1;	//index는 0부터 시작 => 배열의 값이 없다는 것을 의미
	}
	
	public void StackInfo() {
		if(index == -1)
			return;
		
		for(int i=0; i<stack.length; i++) {
			System.out.print(stack[i] + " ");
		}
	}
	
//	스택이 가득 차있는지 판단하는 코드
	public boolean IsFull() {
		return index == size-1;
//		맨 앞에 있는 index번호와 배열의 크기가 같은 수치를 가지고 있다면 true
	}
	
	public boolean IsEmpty() {
		return index == -1;
	}
	
	public int Size() {
		return size;
	}
	
	public boolean contains(int element) {
		for(int i=0; i<stack.length; i++) {
			if(element == stack[i]) {
				return true;
			}
		}
		return false;
	}
	
//	요소를 넣고 값을 스택에 추가하는 기능
	public void push(int element) {
		
		if(IsFull()) {
			System.out.println("[Stack is Full]");
		}
		stack[++index] = element;
	}
	
//	멘 마기작 위치의 값을 제거하는 기능
	public void pop() {
//		데이터가 더이상 지울 값이 없다면 작업을 할 필요가 없음
		if(IsEmpty()) {
			System.out.println("[Stack is Empty]");
			return; 
		}
		
		System.out.println(peek());
		stack[index--] = 0;
//		해당 위치의 값을 0으로 설정
	}
	
	public int peek() {
		return stack[index];
	}
}

public class Ex13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int value;
		System.out.println("스택의 길이를 입력해주세요 >> ");
		int number = sc.nextInt();
		Array_Stack as = new Array_Stack(number);

		while(true) {
		
			if(as.IsEmpty()) {
				System.out.println("현재 스택의 상태 : 비어있음");
			} else {
				System.out.println("현재 스특의 상태 : 데이터 존재함");
			}
		
		System.out.println("1. 스택추가 2. 스택값 제거 3. 스택 내 데이터 확인 4. 스택 전체 출력 5. 종료");
		int select = sc.nextInt();
		
			switch(select) {
			case 1:
				System.out.println("스택에 추가할 값을 입력해주세요 >>");
				value = sc.nextInt();
				as.push(value);
				break;
			case 2:
				System.out.println("스택에 마지막 데이터를 제거합니다.");
				as.pop();
				break;
			case 3: 
				System.out.println("스택에 검색할 값을 입력해주세요 >>");
				value = sc.nextInt();
				if(as.contains(value)) {
					System.out.printf("%d는 스택 안에 존재합니다.%n", value);
				} else {
					System.out.printf("%d는 스택 안에 없습니다.%n", value);
				}
				break;
			case 4:
				as.StackInfo();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}
}
