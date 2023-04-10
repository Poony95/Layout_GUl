package layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest() {
		setLayout(new FlowLayout());
		
		for(int i=1; i<=10; i++) {
			add(new JButton("버튼"+i	));
		}
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
