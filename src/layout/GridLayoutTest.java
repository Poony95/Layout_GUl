package layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {

	JButton jbn;
	public GridLayoutTest() {
		setLayout(new GridLayout(3,5));
		
		for (int i = 1; i <= 15; i++) {
			jbn = new JButton("버튼" + i);
			add(jbn);
			jbn.setBackground(Color.pink);
		}
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GridLayoutTest();
	}

}
