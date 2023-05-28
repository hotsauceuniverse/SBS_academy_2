package Day07;

//	thread : 프로세스 내에서 실제로 작업을 수행하고 있는 주체

//	thread의 특징 : .JVM(자바 가상머신 : 자바 내부에서 프로그램을 실행 전에 확인하는 도구)에 의해 하나의 프로세스가 발생하며, main()안에 있는 실행문이 하나의 thread
//	main이외의 다른 thread를 만들 경우 Thread클래스를 상속하거나, Runnable 인터페이스를 구현하는 식으로 진행(멀티thread)
//	멀티thread 작업 시, 각 thread끼리 정보를 주고받을 수 있음

//	thread의 생성 주기
//	New -> Start() -> Runnable -> Run() -> Running -> Dead

//	New : 생성
//	Runnable : 준비상태(thread가 실행되기 위한 준비 단계)
//	Running : 실행상태
//	Dead : 종료상태

public class Ex21 extends Thread {
	
//	Thread에 대한 작업을 위해 run 메소드를 구현
	@Override
	public void run() {
		System.out.println("thread run...");
	}

	public static void main(String[] args) {
		
		Ex21 ex = new Ex21();
		ex.start();	// thread의 스타트 기능을 통해 thread를 실행
		
	}
	
}
