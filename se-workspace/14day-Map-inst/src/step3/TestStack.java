package step3;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("�����");
		stack.push("����");
		stack.push("������");
		System.out.println(stack);
		/*System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());*/
		while(stack.isEmpty()==false){
			System.out.println(stack.pop());
		}
		// Stack ���� ���� 
		System.out.println(stack);
	}
}











