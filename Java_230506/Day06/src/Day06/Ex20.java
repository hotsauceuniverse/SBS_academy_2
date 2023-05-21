package Day06;

import java.util.Scanner;

enum Menu {
	Start,
	Set,
	Exit
}

interface WashingMachine {
		
	void SetSpeed(int speed);
	void SetMenu(Menu m);	// Menu는 Enum으로 구현
	
//	Enum Menu에는 Start, Set, Exit 존재
	void OnStartEnter();
	void OnSpeedEnter();
	void OnExitEnter();
}

//	해당 인터페이스를 활용해 TestMachine 클래스를 만들어 세탁기의 기능을 코드로 구현합니다.

class TestMachine implements WashingMachine {
	
	private Menu menu;
	private int speed;
	
	@Override
	public void OnStartEnter() {
		System.out.println("시작버튼을 누르세요");
	}
	@Override
	public void OnSpeedEnter() {
		System.out.println("스피드를 설정하세요");
	}
	@Override
	public void OnExitEnter() {
		System.out.println("종료버튼을 누르세요");
	}

	@Override
	public void SetSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void SetMenu(Menu m) {
		this.menu = menu;
	}
}

public class Ex20 {

	public static void main(String[] args) {
		TestMachine machine = new TestMachine();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴를 선택하세요 : Start, Set, Speed");
			String input = sc.next();
			
			if (input.equals("Start")) {
                machine.SetMenu(Menu.Start);
                machine.OnStartEnter();
                break;
            } else if (input.equals("Set")) {
                machine.SetMenu(Menu.Set);
                System.out.println("속도를 설정하세요:");
                int speed = sc.nextInt();
                machine.SetSpeed(speed);
                machine.OnSpeedEnter();
            } else if (input.equals("Exit")) {
                machine.SetMenu(Menu.Exit);
                machine.OnExitEnter();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
		}
		
	}
	
}
