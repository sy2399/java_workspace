package step4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileService {
	public void copyAndPasteFile(String orgPath, String destPath) throws IOException {
			new File(destPath).getParentFile().mkdirs();
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










