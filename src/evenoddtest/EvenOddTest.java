package evenoddtest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
// 사용자에게 n 값을 받아 짝수인지 홀수인지 판별하세요.
public class EvenOddTest extends JFrame{
	
	JTextField jtf;
	JLabel result;
	JButton btn;
	
	public EvenOddTest() {
		jtf = new JTextField(15);
		result = new JLabel("결과 : ");
		btn = new JButton("확인");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jtf.getText());
				String r = "홀수";
				if(n%2==0) {
					r = "짝수";
				}
				result.setText("결과 : "+r);
			}
		});
		setLayout(new FlowLayout());
		
		add(new JLabel("숫자를 입력하세요"));
		add(jtf);
		add(btn);
		
		add(result);
		
		setSize(350,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new EvenOddTest();
		
	}

	
}
