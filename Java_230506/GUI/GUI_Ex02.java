package GUI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class GUI_Ex02 extends JFrame {

	public GUI_Ex02() {
		setTitle("Second run");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 패널 추가
		JPanel jpanel = new JPanel();
		
		// 버튼 추가
		JButton btn = new JButton("버튼 이름 작성");
		JRadioButton jrbtn = new JRadioButton();
		JToggleButton jtbtn = new JToggleButton();
		
		jpanel.add(btn);
		jpanel.add(jrbtn);
		jpanel.add(jtbtn);
		
		JLabel jlabel = new JLabel("정보");
		jpanel.add(jlabel);
		
		add(jpanel);
		
		setSize(500,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI_Ex02();
		
	}
}
