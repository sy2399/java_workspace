package step4;

import java.io.File;
import java.io.IOException;

public class FileService {
	public void makeDirAndFile(String movieFilePath) throws IOException  {
		File file=new File(movieFilePath);
		file.getParentFile().mkdirs();
		file.createNewFile();
	}
	public void makeDirAndFiles(String dir, String info) throws IOException {
		new File(dir).mkdirs();
		String names[]=info.split(",");
		for(int i=0;i<names.length;i++){
			new File(dir+File.separator+names[i]).createNewFile();
		}
	}
}









