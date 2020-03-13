package step5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialService {
	private String path;
	public SerialService(String path) {
		this.path=path;
	}
	public void registerMember(MemberVO memberVO) throws FileNotFoundException, IOException {
		ObjectOutputStream oos
			=new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(memberVO);
		oos.close();
	}
	public MemberVO readMemberVO() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois
		=new ObjectInputStream(new FileInputStream(path));
		MemberVO vo=(MemberVO)ois.readObject();
		ois.close();
		return vo;
	}
}
















