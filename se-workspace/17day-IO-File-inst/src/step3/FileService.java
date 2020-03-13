package step3;

import java.io.File;

public class FileService {
	/* 매개변수에 전달된 filePath의 파일과 동일한 위치의 
	 *  파일(디렉토리 및 자신을 제외)명을 출력하는 메서드 
	 */
	public void printFileName(String filePath) {
		File file=new File(filePath);
		File dir=file.getParentFile();
		File fa[]=dir.listFiles();
		for(int i=0;i<fa.length;i++){
			if(fa[i].isFile()&&filePath.equals(fa[i].getPath())==false){
				System.out.println(fa[i].getName());
			}
		}
	}
}








