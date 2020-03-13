package step7;

public class TestSwitch1 {
	public static void main(String[] args) {
		int grade=3;
		switch(grade){
		case 1: System.out.println("하버드");
		break; // 해당 수행문을 벗어나기 위해 사용하는 키워드
		case 2: System.out.println("옥스퍼드");
		break;
		case 3: System.out.println("북경대");
		break;
		default: System.out.println("판교대");
		}
	}
}









