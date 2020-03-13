package step3;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue=new LinkedList<String>();
		queue.add("규익오빠 나 설현이야");
		queue.add("어디야 뿌잉뿡잉");
		queue.add("대답안해!!!");
		queue.add("헤어져~");
		while(queue.isEmpty()==false)
			System.out.println(queue.poll());
		// Queue 선입선출 FIFO
	}
}











