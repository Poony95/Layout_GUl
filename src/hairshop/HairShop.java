package hairshop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
// 버튼을 눌러 남, 여커트비용을 출력하세요.
public class HairShop extends JFrame implements ActionListener{

	
	JLabel jlb;
	int pay =0;
	
	public HairShop() {
		
		jlb = new JLabel();
		JButton jbt1 = new JButton("남자커트");
		JButton jbt2 = new JButton("여자커트");
		jbt1.addActionListener(this);
		jbt2.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(jbt1);
		add(jbt2);
		add(jlb);
		
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new HairShop();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String n = e.getActionCommand();
		
		if(n.equals("남자커트")) {
			pay = 25000;
		}else if (n.equals("여자커트")) {
			pay = 30000;
		}
		jlb.setText("커트비용은 "+ pay+ "입니다.");
	}

}
