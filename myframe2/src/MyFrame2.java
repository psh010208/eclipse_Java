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
			
			JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
			panelA.add(label1);
			
			JButton button1 = new JButton("�޺�����");
			JButton button2 = new JButton("������������");
			JButton button3 = new JButton("�Ұ������");
			panelB.add(button1);
			panelB.add(button2);
			panelB.add(button3);
			
			JLabel label2 = new JLabel("����");
			JTextField field1 = new JTextField(10);
			panelB.add(label2);
			panelB.add(field1);
			
			panel.add(panelA);
			panel.add(panelB);
			add(panel);
			setVisible(true);
			
		}
	
}
