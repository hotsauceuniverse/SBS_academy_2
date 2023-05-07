package GUI;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

//	AWT : 자바 첫 GUI 라이브러리
//	Swing : AWT를 기반으로 순수 자바언어로 만들어진 라이브러리

//	컴포넌트 : 버튼, 체크박스 보조도구
//	컨테이너 : 컴포넌트를 올릴 수 있는 판
public class GUI_Ex01 extends JFrame {

	public GUI_Ex01() {
		setTitle("First run");	//	넣어준 이름의 형태로 제목을 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//	종료버튼을 누를 경우, 프로세스도 종료
		
		Container contentPane = getContentPane();	//	판의 기능을 얻어옴
		contentPane.setBackground(Color.BLUE);		//	판의 색을 파란색으로 설정
		contentPane.setLayout(new FlowLayout());	//	판에 대한 레이아웃 설정 진행
		
		contentPane.add(new JButton("가위"));
		contentPane.add(new JButton("바위"));
		contentPane.add(new JButton("보"));
		setSize(500,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
//		Swing Frame
		System.out.println("프로그램 실행");
		new GUI_Ex01();
	}
	
}
