package Day07;

// Thread상속
class Thread01 extends Thread {

	private int[] temp;
	public Thread01(String name) {
		super(name);	// 부모클래스의 현태대로 name을 처리
		temp = new int[5];
	}
	
	@Override
	public void run() {
		for(int start : temp) {		// temp의 값을 각각 처리 -> 배열for
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();	// 해당상황 발생 시, 스택을 추적한 값 출력
			}
			System.out.println("Thread : " + currentThread().getName());
			System.out.println("value : " + start);
		}
	}
}

//	Thread Runnable 인터페이스 구현 : 인터페이싀 경우 run 오버라이딩을 진행해야 만들 수 있게 처리되어있음
class Thread02 implements Runnable {

	private int[] temp;
	public Thread02() {
		temp = new int[10];
		
//		각각에 데이터 추가
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
	}
	
	@Override
	public void run() {
		
		for(int start : temp) {		// temp의 값을 각각 처리 -> 배열for
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();	// 해당상황 발생 시, 스택을 추적한 값 출력
			}
			System.out.println("Thread : " + Thread.currentThread().getName());
			System.out.println("value : " + start);
		}
	}
}

public class Ex22 {

	public static void main(String[] args) {
		
//		Thread01 th01 = new Thread01("First");
		
		Thread02 th02 = new Thread02();	//	Runnable로 만든 경우는 다르게 사용
		Thread t = new Thread(th02, "Second");
		
//		th01.start();
//		th02.start();
		t.start();
		
	}
	
}
