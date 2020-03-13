package step6;

import java.io.File;

public class MoveService {
	/* orgDir에 있는 파일들 중 ext 확장자에 해당하는 파일들만 
	 * destDir 디렉토리로 이동시키는 메서드 
	 */
	public void execute(String orgDir, String destDir, String ext) {
		//이동할 디렉토리를 생성한다 
		new File(destDir).mkdirs();
		//디렉토리객체로부터 파일객체배열을 반환받는다  
		File orgFile[]=new File(orgDir).listFiles();
		for(int i=0;i<orgFile.length;i++){
			//파일이고 ext로 끝나면 
			if(orgFile[i].isFile()&&orgFile[i].getName().endsWith(ext)){
				//destDir로 이동시킨다 
				orgFile[i].renameTo(
						new File(destDir+File.separator+orgFile[i].getName()));
			}
		}
	}
}






