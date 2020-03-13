package step3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 *   heap memory 영역에 저장된 
 *   객체를 직렬화하여 외부 파일에 저장 
 *   
 *   nodeStream :  FileOutputStream 
 *   processStream : ObjectOutputStream 의 writeObject() 
 *   
 *   java.io.NotSerializableException: step3.Person
 *   위와 같은 Exception은 직렬화되어 출력될 Person class가 
 *   java.io.Serializable 인터페이스를 implements 하지 않아 
 *   직렬화되어 외부로 전송될 수 없음을 알리는 예외. 
 *   즉 직렬화되어 외부로 전송되기 위해서는 반드시 
 *   java.io.Serializable interface를 implements 해야 한다 
 */
public class TestSerializable1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos
			=new FileOutputStream(
					"C:\\java-kosta\\test\\serial\\person.obj");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			Person p=new Person("아이유","판교","abcd");
			oos.writeObject(p);
			System.out.println("객체 직렬화하여 파일에 출력");
			oos.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}










