package checkBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest extends JFrame implements ActionListener{
	
	String []str = {"사과","포도","감","오렌지","귤"};
	JCheckBox []jcb = new JCheckBox[str.length];
	JLabel result;
	
	public CheckBoxTest() {
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < jcb.length; i++) {
			jcb[i] = new JCheckBox(str[i]);
			add(jcb[i]);
			jcb[i].addActionListener(this);
		}
		
		result = new JLabel();
		
		
		
		add(result);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new CheckBoxTest();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String data="";
		for (int i = 0; i < jcb.length; i++) {
			if(jcb[i].isSelected()==true) {
				data += jcb[i].getText() + ",";
				
			}
		}
		if (data.equals("")) {	// 입력글자가 없으면,
			result.setText(data);// settext로 data의 값을 다시 지정해라.(초기화값)
		}else {
			data = data.substring(0,data.length()-1);
			result.setText(data+"를 선택했습니다.");
		}
		
		
	}

}
