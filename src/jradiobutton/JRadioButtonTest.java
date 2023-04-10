package jradiobutton;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonTest extends JFrame implements ActionListener{

	JRadioButton btnMan;
	JRadioButton btnWoman;
	JLabel result;
	
	JRadioButton btnA;
	JRadioButton btnB;
	JRadioButton btnAB;
	JRadioButton btnO;
	JLabel result2;
	public JRadioButtonTest () {
		
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	setLayout(new GridLayout(2,1));
		
		ButtonGroup bg1 = new ButtonGroup();
		
		btnMan = new JRadioButton("남자");
		btnWoman = new JRadioButton("여자");
		
		btnMan.addActionListener(this);
		btnWoman.addActionListener(this);
		
		bg1.add(btnMan);
		bg1.add(btnWoman);
		
		result = new JLabel();
		
		p1.add(btnMan);
		p1.add(btnWoman);
		p1.add(result);
		
		btnA = new JRadioButton("A형");
		btnB = new JRadioButton("B형");
		btnAB = new JRadioButton("AB형");
		btnO = new JRadioButton("O형");
		
		btnA.addActionListener(this);
		btnB.addActionListener(this);
		btnAB.addActionListener(this);
		btnO.addActionListener(this);
		
		ButtonGroup bg2 = new ButtonGroup();
		
		bg2.add(btnA);
		bg2.add(btnB);
		bg2.add(btnAB);
		bg2.add(btnO);
		
		result2 = new JLabel();
		
		p2.add(btnA);
		p2.add(btnB);
		p2.add(btnAB);
		p2.add(btnO);
		p2.add(result2);
		
		add(p1);
		add(p2);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}
	
	public static void main(String[] args) {
		new JRadioButtonTest();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();
		if(a.equals("남자")|| a.equals("여자")) {
			result.setText("성별은" +a + "입니다");
			
		}else {
			result2.setText("혈액형은" +a +" 입니다.");
		}
		
	}

}
