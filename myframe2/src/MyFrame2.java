import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame2 extends JFrame{
	
		public MyFrame2() {
			setSize(500, 400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("MyFrame2");
			
			JPanel panel = new JPanel();
			JPanel panelA = new JPanel();
			JPanel panelB = new JPanel();
			
			JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
			panelA.add(label1);
			
			JButton button1 = new JButton("콤보피자");
			JButton button2 = new JButton("포테이토피자");
			JButton button3 = new JButton("불고기피자");
			panelB.add(button1);
			panelB.add(button2);
			panelB.add(button3);
			
			JLabel label2 = new JLabel("개수");
			JTextField field1 = new JTextField(10);
			panelB.add(label2);
			panelB.add(field1);
			
			panel.add(panelA);
			panel.add(panelB);
			add(panel);
			setVisible(true);
			
		}
	
}
