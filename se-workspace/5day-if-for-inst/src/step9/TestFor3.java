package step9;

public class TestFor3 {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++){
			if(i==20){
				System.out.println("치사량~");
				break; // 해당 반복문을 벗어난다 
			}
			System.out.println(i+"잔");
		}
	}
}
