package step2;

public class TestImageService {
	public static void main(String[] args) {
		String orgPath="C:\\java-kosta\\test\\��濵.jpg";
		String destPath="C:\\java-kosta\\test\\img\\��濵.jpg";
		ImageService service=new ImageService();
		try{
		service.copyAndPaste(orgPath,destPath);
		System.out.println("�̹��� ���ٿϷ�");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}




