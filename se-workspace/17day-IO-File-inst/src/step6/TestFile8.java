package step6;

public class TestFile8 {
	public static void main(String[] args) {
		MoveService service=new MoveService();
		String orgDir="C:\\java-kosta\\test\\media2";
		String destDir="C:\\java-kosta\\test\\music";
		String ext="mp3";
		service.execute(orgDir,destDir,ext);
		System.out.println("이동완료");
		// ext 즉 mp3 파일들만 music 디렉토리로 이동된다 
		// 5시 20분 풀이 
	}
}







