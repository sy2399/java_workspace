package step2;

public class TestImageService {
	public static void main(String[] args) {
		String orgPath="C:\\java-kosta\\test\\허경영.jpg";
		String destPath="C:\\java-kosta\\test\\img\\허경영.jpg";
		ImageService service=new ImageService();
		try{
		service.copyAndPaste(orgPath,destPath);
		System.out.println("이미지 복붙완료");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}




