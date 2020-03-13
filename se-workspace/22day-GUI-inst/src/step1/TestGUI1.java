package step1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGUI1 {
	private Frame f;
	private Button b;
	public void go(){
		f=new Frame("gui");
		f.setLayout(new FlowLayout());//��ġ�Ӽ��� ���� 
		b=new Button("��ư ������");
		b.addActionListener(new ButtonHandler());
		f.add(b);
		f.addWindowListener(new FrameHandler());
		f.setBackground(Color.yellow);
		f.setSize(400, 200);
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	// Inner class�� �̺�Ʈ ó���Ѵ� 
	class FrameHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	//��ư �̺�Ʈ ó���ϴ� Inner class 
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("��ư ��������..");
		}		
	}
	public static void main(String[] args) {
		new TestGUI1().go();
	}
}










