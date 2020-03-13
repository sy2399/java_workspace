package step2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestInput2 {
	public static void main(String[] args) {
		String file="C:\\java-kosta\\test\\트럼프.txt";
		//위 파일에 있는 내용을 모두 읽어서 콘솔에 출력한다 
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String data=br.readLine();
			while(data!=null){
				System.out.println(data);
				data=br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}
