package step4;

public class TestCopyAndPaste {
	public static void main(String[] args) {
		FileService service=new FileService();
		String orgPath="C:\\java-kosta\\test\\진달래꽃.txt";
		String destPath="C:\\java-kosta\\test\\iotest\\document\\진달래꽃.txt";
		try{
		service.copyAndPasteFile(orgPath,destPath);
		System.out.println("copyAndPaste 완료");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
