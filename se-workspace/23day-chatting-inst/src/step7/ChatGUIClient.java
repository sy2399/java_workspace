package step7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.DefaultCaret;

public class ChatGUIClient {
	private JFrame frame;
	private JTextArea textArea;
	private JPanel panel;
	private JTextField textField;
	private JButton button;

	private Socket socket;
	private PrintWriter pw;
	private BufferedReader br;

	public void closeAll() {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (pw != null)
			pw.close();
		if (socket != null) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void startUI() {
		frame = new JFrame("chatting");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("종료");
				System.exit(0);
			}
		});
		textArea = new JTextArea();
		textArea.setBackground(Color.yellow);
		frame.add(textArea, "Center");
		// 스크롤바 - 업데이트
		DefaultCaret caret = (DefaultCaret) textArea.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		JScrollPane sp = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		frame.add(sp, BorderLayout.CENTER);// 스크롤적용 JTextArea 갱신

		panel = new JPanel();
		textField = new JTextField(25);
		textField.addKeyListener(new KeyHandler());
		panel.add(textField);
		button = new JButton("전송");
		button.addActionListener(new ButtonHandler());
		panel.add(button);
		frame.add(panel, "South");
		frame.setSize(400, 400);
		frame.setLocation(200, 200);
		frame.setVisible(true);
		textArea.setEditable(false);// 직접 편집 안되도록 설정
		textField.requestFocus();// 포커스 준다
	}

	// 전송버튼 이벤트 처리 내부 클래스
	class ButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sendMessage();
		}
	}

	// 서버로 메세지 전송하는 메서드
	public void sendMessage() {
		pw.println(textField.getText());
		textField.setText("");
		textField.requestFocus();
	}

	// Enter key 눌렀을 때 이벤트 처리를 위한 클래스
	class KeyHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				sendMessage();
			}
		}
	}

	/*
	 * Socket 생성 입,출력 스트림 생성 ServerWorker Thread 생성 후 start startUI()
	 */
	public void go() throws UnknownHostException, IOException {
		socket = new Socket("192.168.0.35", 5432);
		pw = new PrintWriter(socket.getOutputStream(), true);// autoflush
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		Thread t = new Thread(new ClientWorker());
		startUI();
		t.start();
	}

	class ClientWorker implements Runnable {
		@Override
		public void run() {
			try {
				while (true) {
					String message = br.readLine();
					if (message == null)
						break;
					textArea.append(message + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeAll();
			}
		}
	}

	public static void main(String[] args) {
		ChatGUIClient c = new ChatGUIClient();
		try {
			c.go();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}