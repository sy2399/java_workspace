package step4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import step3.Person;

public class TestSerializable2 {
	/*
	 *   FileInputStream < ObjectInputStream 
	 *   								readObject() : Object 
	 *   객체 역직렬화하여 
	 *   아이유 판교 를 출력한다 
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis
			=new FileInputStream("C:\\java-kosta\\test\\serial\\person.obj");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Person p=(Person)ois.readObject();
			//password 는 null 이 출력된다
			//이유는 transient 명시되어 직렬화 되지 않았기 때문이다 
			System.out.println(p.getName()+" "+p.getAddress()+" "+p.getPassword());
			ois.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
}
















