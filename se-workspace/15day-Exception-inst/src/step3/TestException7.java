package step3;

import java.util.Scanner;

public class TestException7 {
	public static void main(String[] args) {
		System.out.println("���̸� �Է��ϼ���(���ڷ�!)");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		try{
		int age=Integer.parseInt(str);
		age=age+1;
		System.out.println("����� ���̴� �� "+age+"���Դϴ�");
		}catch(NumberFormatException ne){
			System.out.println("���ڷ� �־��� ���ܾ� ¥~~");
		}finally{
			scan.close();
		}
	}
}









