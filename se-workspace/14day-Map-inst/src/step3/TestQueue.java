package step3;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("���Ϳ��� �� �����̾�");
		queue.add("���� ���׻���");
		queue.add("������!!!");
		queue.add("�����~");
		while(queue.isEmpty()==false)
			System.out.println(queue.poll());
		// Queue ���Լ��� FIFO
	}
}











