package step5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	public void copyAndPasteDir(String orgDir, String destDir) throws IOException {		
		new File(destDir).mkdirs();
		File list[]=new File(orgDir).listFiles();
		for(int i=0;i<list.length;i++){
			copyAndPasteFile(list[i].getPath(), destDir+File.separator+list[i].getName());
		}			
	}
	public void copyAndPasteFile(String orgPath, String destPath) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader(orgPath));
		PrintWriter pw=new PrintWriter(new FileWriter(destPath));
		String line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}
		pw.close();
		br.close();
}
}
