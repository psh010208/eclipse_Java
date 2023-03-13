import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Image;

public class MyFrame extends JFrame{

	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		setSize(500, 400);
		setLocation(screenSize.width / 2, screenSize.height / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		Image img = kit.getImage("./icon.gif");
		setIconImage(img);
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
	
}
