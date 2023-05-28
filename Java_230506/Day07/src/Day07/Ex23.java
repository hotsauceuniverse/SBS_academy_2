package Day07;

class MultiThread implements Runnable {

	int number = 0;
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			if(Thread.currentThread().getName().equals("A")) {
				System.out.println("===========================================");
				number++;
			}
			System.out.println("[Thread]" + Thread.currentThread().getName() + "Value : " + number);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}



public class Ex23 {

	public static void main(String[] args) {
		
//		멀티Thread 사용방법
//		1. 사용할 thread를 생성
		MultiThread mt01 = new MultiThread();
		MultiThread mt02 = new MultiThread();
				
		Thread th01 = new Thread(mt01, "A");
		Thread th02 = new Thread(mt02, "B");
		
		th01.start();
		th02.start();
		
		Thread.currentThread().getName();
	}
	
}
