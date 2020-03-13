package step2;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGUI2 {
	private Frame f;
	private Button b1,b2;
	public void go(){
		f=new Frame("event ����");
		f.setLayout(new FlowLayout());
		//�͸�Ŭ������ Frame �����̺�Ʈ ó�� 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		b1=new Button("Ȧ");
		b1.addActionListener(new ButtonHandler());
		b2=new Button("¦");
		b2.addActionListener(new ButtonHandler());
		f.add(b1);
		f.add(b2);
		//f.setSize(300, 100);
		f.setBackground(Color.pink);
		f.pack();
		f.setLocation(400, 100);
		f.setVisible(true);
	}
	class ButtonHandler implements ActionListener{		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());			
		}
	}
	public static void main(String[] args) {
		new TestGUI2().go();
	}
}








