package step2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageService {
	/*  입력 :  FileInputStream < BufferedInputStream 
	 * 										  read():int      -->  없으면 -1을 반환 
	 *   출력 : FileOutputStream < BufferedOutputStream 
	 *   										write(int)    
	 *   close  
	 */
	public void copyAndPaste(String orgPath, String destPath) 
			throws IOException{
		    new File(destPath).getParentFile().mkdirs();
			BufferedInputStream bis
			=new BufferedInputStream(new FileInputStream(orgPath));
			BufferedOutputStream bos
			=new BufferedOutputStream(new FileOutputStream(destPath));
			int data=bis.read();
			while(data!=-1){
				bos.write(data);
				data=bis.read();
			}
			bos.close();
			bis.close();
	}
}











