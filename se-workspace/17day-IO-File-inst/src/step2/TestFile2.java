package step2;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		String dir
		="C:\\java-kosta\\util\\eclipse-jee-neon-2-win32-x86_64\\eclipse";
		// 위 dir 디렉토리에 있는 파일명을 출력한다 ( 디렉토리는 제외 ) 
		File dirObj=new File(dir);
		File fa[]=dirObj.listFiles();
		for(int i=0;i<fa.length;i++){
			if(fa[i].isFile())
				System.out.println(fa[i].getName());
		}
	}
}





