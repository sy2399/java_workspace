package step1;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInput {
	public static void main(String[] args) {
		//1byte 단위 입력스트림 
		try {
			FileInputStream fis
			=new FileInputStream("C:\\java-kosta\\test\\output.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			//bis.read(); // int 형으로 반환 , 더 읽을 내용이 없으면 -1을 반환 
			int data=-1;
			while((data=bis.read())!=-1){
				System.out.println((char)data);
			}
			bis.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}





