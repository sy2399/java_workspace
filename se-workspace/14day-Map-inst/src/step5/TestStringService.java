package step5;

public class TestStringService {
	public static void main(String[] args) {
		StringService service=new StringService();
		service.addFile("너의 이름은.mp4");
		service.addFile("컨택트.mp4");
		service.addFile("첫눈처럼 너에게 가겠다.mp3");
		service.addFile("라라랜드.mp4");
		service.addFile("행복한 척.mp3");
		String ext="mp3";
		service.printName(ext);
		/* 첫눈처럼 너에게 가겠다
		 * 행복한 척 
		 */
		System.out.println("****************");
		ext="mp4";
		service.printName(ext);
		/* 너의 이름은 
		 *  컨택트 
		 *  라라랜드
		 */
	}
}










