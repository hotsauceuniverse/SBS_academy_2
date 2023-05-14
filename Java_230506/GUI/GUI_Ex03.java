package GUI;

import java.awt.event.*;

import javax.swing.*;

public class GUI_Ex03 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		
		ImageIcon icon01 = new ImageIcon("images/icon.png");
		
//		컴포넌트 생성
		JCheckBoxMenuItem jcb01 = new JCheckBoxMenuItem("아이템 1",icon01);
		JCheckBoxMenuItem jcb02 = new JCheckBoxMenuItem("아이템 2");
		JCheckBoxMenuItem jcb03 = new JCheckBoxMenuItem("아이템 3");
		
		JButton jbtn01 = new JButton("확인");
		jbtn01.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton)e.getSource();
				
				if(btn.getText().equals("확인")) {
					String message = null;
					if(jcb01.isSelected()) {
						message = jcb01.getText();
					} else if(jcb02.isSelected()) {
						message = jcb02.getText();
					} else if(jcb03.isSelected()) {
						message = jcb03.getText();
					}
					
					
					JOptionPane jp = new JOptionPane();
					jp.showMessageDialog(null, message);
					
					// 설명을 보여주는 다음 창 생성 및 표시
                    JFrame descriptionFrame = new JFrame();
                    JLabel descriptionLabel = new JLabel("선택된 아이템: " + message);
                    descriptionFrame.getContentPane().add(descriptionLabel);
                    descriptionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    descriptionFrame.pack();
                    descriptionFrame.setVisible(true);
				}
			}
			
		});
		
		
//		컴포넌트를 패널에 추가
		jpanel.add(jcb01);
		jpanel.add(jcb02);
		jpanel.add(jcb03);
		jpanel.add(jbtn01);
		
		jframe.add(jpanel);
		jframe.setBounds(500, 200, 300, 600);
		jframe.pack();
		jframe.setResizable(false);
		
		jframe.setTitle("체크박스 예제");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		
		
		
	}
}
