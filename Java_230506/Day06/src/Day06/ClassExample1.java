package Day06;

import java.util.Scanner;

enum Menu{ Start,Set,Exit }

interface WashingMachine
{
	void SetSpeed(int speed);
	void SetMenu(Menu m); //Menu는 Enum으로 구현합니다.
	//Enum Menu에는 Start, Set, Exit 세 가지 기능이 존재합니다.
	void OnStartEnter(); //시작 시 호출될 기능
	void OnSpeedEnter(); //스피드 설정 시 호출될 기능
	void OnExitEnter(); //종료 시 호출될 기능
}
class TestMachine implements WashingMachine
{
	private int speed; //속도에 대한 표현
	private Menu menu; //기능에 대한 표현
	private boolean isStart; //시작하고 있는지에 대한 여부
	
	
	public void Select()
	{
		Scanner sc = new Scanner(System.in);
		if(isStart)
			System.out.println("현재 상태 : ON");
		else
			System.out.println("현재 상태 : OFF");
		System.out.println("1. 시작 2. 속도 설정 3. 종료");
		int input_value = sc.nextInt();
		switch(input_value)
		{
		case 1 :
			OnStartEnter();break;
		case 2 :
			if(isStart)
				OnSpeedEnter();
			else
				System.out.println("기계가 작동 중이지 않습니다."); break;
		case 3 :
			OnExitEnter();break;
		default :
			System.out.println("해당 기능은 없습니다.");
		}		
	}
	
	
	@Override
	public void SetSpeed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}

	@Override
	public void SetMenu(Menu m) {
		// TODO Auto-generated method stub
		menu = m;
	}

	@Override
	public void OnStartEnter() {
		// TODO Auto-generated method stub
		isStart = true;
		System.out.println("테스트 머신이 가동됬습니다.");
	}

	@Override
	public void OnSpeedEnter() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("속도를 작성해주세요. (최대 10) "); //속도에 대한 안내 멘트를 작성합니다.(자유롭게)
		int input_value = sc.nextInt();
		if(input_value > 0 && input_value < 11)
		{
			SetSpeed(input_value);
			System.out.printf("속도가 설정됬습니다. 현재 속도는  %d입니다.%n", speed);
		}
		else
		{
			System.out.println("속도가 0보다 작거나, 10보다 큽니다. 다시 진행합니다.");
			OnSpeedEnter();
		}
	}

	@Override
	public void OnExitEnter() {
		// TODO Auto-generated method stub
		isStart = false;
		System.out.println("작업을 종료합니다.");
		System.exit(0);
	}
	
}


//해당 인터페이스를 활용해 TestMachine 클래스를 만들어 세탁기의 기능을 코드로 구현합니다.
//메인에서는 기능에 대한 선택을 통해 클래스를 사용합니다.

public class ClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMachine tm = new TestMachine();
		while(true)
		{
			tm.Select();
		}
	}

}
