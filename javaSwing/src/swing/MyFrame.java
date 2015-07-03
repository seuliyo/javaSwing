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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������� â�ݱ� ��ư
		setTitle("��������");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // ��Ŷ�� ��ü�� ����
		Dimension dim = toolkit.getScreenSize(); // ������ü�� �������� ��ġ ����
		
		/*�г� ����*/
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		/*�г� ���� ����*/
		panel.setBackground(Color.GREEN);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.YELLOW);
		
		/*���̺� ��ü ����*/
		JLabel label = new JLabel("MVC ����");
		panel.add(label);
		
	}
	
}
