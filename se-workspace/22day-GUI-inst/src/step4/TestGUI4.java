package step4;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestGUI4 {
	private Frame f;
	private TextField tf;
	private Panel p;
	private Button b1,b2,b3;
	public void go(){
		f=new Frame("�̺�Ʈ����");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		tf=new TextField();
		p=new Panel();
		p.setBackground(Color.yellow);
		b1=new Button("�����");
		b1.addActionListener(new ButtonHandler());
		b2=new Button("��ȣ��");
		b2.addActionListener(new ButtonHandler());
		b3=new Button("Ȳ����");
		b3.addActionListener(new ButtonHandler());
		f.add(tf, BorderLayout.SOUTH);
		p.add(b1);p.add(b2);p.add(b3);
		f.add(p,BorderLayout.CENTER);
		f.pack();
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	//��ư �̺�Ʈ ó��  
	// ����� ��ư ������ �Ʒ� TextField�� setText("����");
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("�����")){
				tf.setText("����");
			}else if(e.getActionCommand().equals("��ȣ��")){
				tf.setText("����");
			}else if(e.getActionCommand().equals("Ȳ����")){
				tf.setText("�⽺");
			}
		}		
	}
	public static void main(String[] args) {
		new TestGUI4().go();
	}
}









