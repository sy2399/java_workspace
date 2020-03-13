package review;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderService {
	public ArrayList<String> getMenuList(String filePath2) throws IOException {
		BufferedReader br=null;
		ArrayList<String> list=new ArrayList<String>();
		try{
			br=new BufferedReader(new FileReader(filePath2));
			String menu=null;
			while((menu=br.readLine())!=null){
				list.add(menu);
			}
		}finally{
			if(br!=null)
				br.close();
		}
		return list;
	}
}











