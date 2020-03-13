package step6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerialListService {
	private String path;
	public SerialListService(String path){
		this.path=path;
	}
	public void outputList(ArrayList<FoodVO> list) throws FileNotFoundException, IOException {
		ObjectOutputStream oos
			=new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(list);
		oos.close();
	}
	public ArrayList<FoodVO> inputList() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois
				=new ObjectInputStream(new FileInputStream(path));
		@SuppressWarnings("unchecked")
		ArrayList<FoodVO> list=(ArrayList<FoodVO>)ois.readObject();
		ois.close();
		return list;
	}
}











