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
		f=new Frame("이벤트연습");
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		tf=new TextField();
		p=new Panel();
		p.setBackground(Color.yellow);
		b1=new Button("김규익");
		b1.addActionListener(new ButtonHandler());
		b2=new Button("김호겸");
		b2.addActionListener(new ButtonHandler());
		b3=new Button("황윤상");
		b3.addActionListener(new ButtonHandler());
		f.add(tf, BorderLayout.SOUTH);
		p.add(b1);p.add(b2);p.add(b3);
		f.add(p,BorderLayout.CENTER);
		f.pack();
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	//버튼 이벤트 처리  
	// 김규익 버튼 누르면 아래 TextField에 setText("반장");
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("김규익")){
				tf.setText("반장");
			}else if(e.getActionCommand().equals("김호겸")){
				tf.setText("간디");
			}else if(e.getActionCommand().equals("황윤상")){
				tf.setText("잡스");
			}
		}		
	}
	public static void main(String[] args) {
		new TestGUI4().go();
	}
}









