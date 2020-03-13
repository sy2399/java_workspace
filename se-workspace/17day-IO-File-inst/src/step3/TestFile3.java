package step3;

public class TestFile3 {
	public static void main(String[] args) {
		FileService service=new FileService();
		String fileName
		="C:\\java-kosta\\util\\eclipse-jee-neon-2-win32-x86_64"
				+ "\\eclipse\\eclipse.exe";
		service.printFileName(fileName);
		// 해당 파일과 동일한 디렉토리에 있는 파일명만 출력하되 
		// 자신(eclipse.exe)은 제외한다
		// 2시 10분에 풀이 
		/*  .eclipseproduct
			artifacts.xml			
			eclipse.ini
			eclipsec.exe
		 * 
		 */
	}
}



