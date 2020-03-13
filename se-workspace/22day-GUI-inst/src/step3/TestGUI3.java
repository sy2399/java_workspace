package step3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/* Java GUI 
 * Frame �� �⺻ Layout : BorderLayout ( �� , �� , �� , �� , �߾� ) 
 * Panel �� �⺻ Layout : FlowLayout ( ������� ��ġ )
 */
public class TestGUI3 {
	private Frame f;
	private Button eastBtn,westBtn,southBtn,northBtn,centerBtn;
	public void go() {
		f = new Frame("���̾ƿ��׽�Ʈ");
		// �͸�Ŭ������ Frame �����̺�Ʈ ó��
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		eastBtn=new Button("��");
		westBtn=new Button("��");
		southBtn=new Button("��");
		northBtn=new Button("��");
		centerBtn=new Button("�߾�");
		//frame�� ��ư�� ���� ��ġ 
		f.add(eastBtn, BorderLayout.EAST);
		f.add(westBtn, BorderLayout.WEST);
		f.add(southBtn, BorderLayout.SOUTH);
		f.add(northBtn, BorderLayout.NORTH);
		f.add(centerBtn, BorderLayout.CENTER);
		f.setSize(300, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new TestGUI3().go();
	}
}


