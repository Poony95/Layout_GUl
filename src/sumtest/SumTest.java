package sumtest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
// 사용자한테 n 값을 받아 그 수만큼 계속 합산하여 결과값을 나타내보자.
public class SumTest extends JFrame {

	JTextField jtf;
	JLabel jlb;
	JButton btn;
	public SumTest() {
		jtf = new JTextField(10);
		jlb = new JLabel();
		btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = Integer.parseInt(jtf.getText());
				int sum = 0;
				for (int i = 1; i <=n; i++) {
					sum += i;
				}
				jlb.setText("결과 : " + sum + "");
			}
		});
		setLayout(new FlowLayout());
		add(new JLabel("어디까지 더할까요?"));
		add(jtf);
		add(btn);
		add(jlb);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new SumTest();
		
	}

}
