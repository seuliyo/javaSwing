package swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{	
	public MyFrame() {
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 우측상단 창닫기 버튼
		setTitle("스윙예제");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷의 객체를 생성
		Dimension dim = toolkit.getScreenSize(); // 스윙객체가 보여지는 위치 선정
		
		/*패널 생성*/
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		/*패널 색상 변경*/
		panel.setBackground(Color.GREEN);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.YELLOW);
		
		/*레이블 객체 생성*/
		JLabel label = new JLabel("MVC 패턴");
		panel.add(label);
		
	}
	
}
