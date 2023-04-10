package clactest;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

// 계산기를 만들어보자.
// 계산 값을 출력하고, c를 누르면 초기화 되도록 해보자.
public class ClacTest extends JFrame implements ActionListener{

	String info;
	int info1;
	int info2;
	
	JTextField jtf;
	JButton []btn = new JButton[16];
	String []strings = {"1","2","3","+",
						"4","5","6","-",
						"7","8","9","*",
						"C","0","=","/"};
	
	public ClacTest () {
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,4));
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(strings[i]);
			Font font = new Font("",Font.BOLD, 20);
			btn[i].setFont(font);
			btn[i].setBackground(Color.pink);
			p.add(btn[i]);
			btn[i].addActionListener(this);
		}
		jtf = new JTextField();
		Font font2 = new Font("",Font.BOLD, 50);
		jtf.setFont(font2);
		
		add(jtf, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		setTitle("동완이 계산기");
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ClacTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if(cmd.equals("+") || cmd.equals("-") || 
				cmd.equals("*") || cmd.equals("/") ) {
			info1 = Integer.parseInt(jtf.getText());
			info = cmd;
			jtf.setText("");
			
		}else if (cmd.equals("=")) {
			info2 = Integer.parseInt(jtf.getText());
			int r=0;
			switch(info) {
			case "+" : r=info1+info2; break;
			case "-" : r=info1-info2; break;
			case "*" : r=info1*info2; break;
			case "/" : r=info1/info2; break;
			}
			jtf.setText(r+"");
		}else if (cmd.equals("C")) {
			jtf.setText("");
			info ="";
			info1 =0;
			info2 =0;
		}else {
			jtf.setText(jtf.getText()+cmd);
		}
	}
}
