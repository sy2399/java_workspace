package step3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IOService {
	private String path;
	public IOService(String path) {
		this.path=path;
		new File(path).getParentFile().mkdirs();//디렉토리 생성 
	}
	public void writeList(ArrayList<String> list) throws IOException {
		 PrintWriter pw=new PrintWriter(new FileWriter(path));
		 for(int i=0;i<list.size();i++)
			 pw.println(list.get(i));
		 pw.close();
	}
	public ArrayList<String> readList() throws IOException {
		ArrayList<String> list=new ArrayList<String>();
		BufferedReader br=new BufferedReader(new FileReader(path));
		String data=br.readLine();
		while(data!=null){
			list.add(data);
			data=br.readLine();
		}
		br.close();
		return list;
	}
}


















