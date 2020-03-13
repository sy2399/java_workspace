package step6;

import java.util.ArrayList;

public class TestSerialSerivce4 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\FoodList.obj";
		SerialListService service=new SerialListService(path);
		try{
			ArrayList<FoodVO> list=service.inputList();
			for(int i=0;i<list.size();i++)
				System.out.println(
						list.get(i).getName()+" "+list.get(i).getPrice());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}





