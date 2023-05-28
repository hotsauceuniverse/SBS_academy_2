package Day07;

import javax.swing.JOptionPane;

//	Thread + swing

//	Thread 프로그래밍 구현
class RSP_Timer extends Thread {
	
//	10부터 0초까지 순차적으로 감소하면서 시간을 체크하는 기능
	@Override
	public void run() {
		for(int i=10; i>=1; i--) {
			if(Ex24.Check) {
				return;
			} System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		System.out.println("Time Over");
		System.exit(0);
	}
	
}

//	GUI 프로그래밍 구현
public class Ex24 {

	public static boolean Check = false;
	
	public static void main(String[] args) {
	
//		타이머 연결
		RSP_Timer rsp_timer = new RSP_Timer();
		
//		AI만들기(컴퓨터는 가위, 바위, 보 중 하나의 값을 랜덤으로 선택해야 한다.)
		String[] computer_value = {"가위", "바위", "보"};
		int random = (int)(Math.random() * 3); 	// 0~2까지의 랜덤에 대한 처리
		String computer = computer_value[random];
		
//		플레이어 (가위, 바위, 보에 대한 입력을 받음)
		String player = null;
		
//		입력 동안 카운트 체크(카운트 다운)
		rsp_timer.start();
		
		do {
			player = JOptionPane.showInputDialog("가위 바위 보");
		} while (!player.equals("가위") && !player.equals("바위") && !player.equals("보"));
		
		Check = true;	// 입력이 완료되었습니다.(while문 탈출 시)
		
		String result = null; // 결과에 대한 값
		
		if(player.equals(computer)) {
			result = "무승부";
		} else if((player.equals("가위"))) {
			if(computer.equals("바위")) {
				result = "패배";
			} else {
				result = "승리";
			}
		} else if((player.equals("바위"))) {
			if(computer.equals("보")) {
				result = "패배";
			} else {
				result = "승리";
			}
		} else if((player.equals("보"))) {
			if(computer.equals("가위")) {
				result = "패배";
			} else {
				result = "승리";
			}
		} 
		
//		결과처리
		System.out.printf("Computer : %s Player : %s 결과 : %s%n", computer, player, result);

		
		
	}
	
}
