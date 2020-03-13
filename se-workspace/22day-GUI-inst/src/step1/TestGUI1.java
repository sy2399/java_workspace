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
		f.setLayout(new FlowLayout());//배치속성을 변경 
		b=new Button("버튼 눌러봐");
		b.addActionListener(new ButtonHandler());
		f.add(b);
		f.addWindowListener(new FrameHandler());
		f.setBackground(Color.yellow);
		f.setSize(400, 200);
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	// Inner class로 이벤트 처리한다 
	class FrameHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	//버튼 이벤트 처리하는 Inner class 
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("버튼 눌렀구나..");
		}		
	}
	public static void main(String[] args) {
		new TestGUI1().go();
	}
}










