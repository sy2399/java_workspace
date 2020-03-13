package school;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class SchoolService {
	private ArrayList<Person> list=new ArrayList<Person>();
	private String path="C:\\java-kosta\\test\\school\\personlist.obj";
	/**
	 * ���α׷� ���۽� ȣ��ȴ� 
	 * path �� �ش��ϴ� ������ �����ϸ� �� ���Ϸκ���
	 * ������ȭ�Ͽ� list�� �Ҵ��Ѵ�. 
	 * ���� ������ �������� ������ ���� �����̹Ƿ� ������ȭ���� �ʴ´�
	 * 
	 * ���� path ���� ���丮�� ���ٸ� ���丮�� �������ش� 
	 * 
	 *  �ֿ� API : FileInputStream < ObjectInputStream  
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public void loadData() throws  IOException, ClassNotFoundException{
		//���� ���丮�� �������� ������ �����Ѵ� 
		File saveDir=new File(path).getParentFile();
		if(saveDir.isDirectory()==false)
			saveDir.mkdirs();
		//����� ������ ���� ������ Ȯ���� ������ ������ȭ���� �ʰ�
		//�����ϸ� ������ȭ�Ͽ� list�� �Ҵ��Ѵ�. 
		File saveFile=new File(path);
		if(saveFile.isFile()){
			ObjectInputStream ois=new ObjectInputStream(
					new FileInputStream(path));
			list=(ArrayList<Person>)ois.readObject();
			ois.close();
		}
	}
	/**
	 * ���α׷� ����� ȣ��ȴ� 
	 * �б� ������ ������ path �� �ش��ϴ� ���Ͽ� ����Ѵ�(��ü ����ȭ)
	 * 
	 *  �ֿ� API : FileOutputStream < ObjectOutputStream 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void saveData() throws  IOException{
		ObjectOutputStream oos=new ObjectOutputStream(
				new FileOutputStream(path));
		oos.writeObject(list);
		oos.close();
	}
	/*
	 *  tel �� �ش��ϴ� list ���(������)�� �ε����� ��ȯ�ϴ� �޼��� 
	 *  ���� tel �� �ش��ϴ� ��Ұ� ���� ��� -1 �� ��ȯ 
	 *  �߰�,�˻�,����,���� �޼����� 
	 *  ���� ����� ������ �޼��忡�� ó���غ��� 
	 */
	public int findIndexByTel(String tel){
		int index=-1;
		for(int i=0;i<list.size();i++){
			if(tel.equals(list.get(i).getTel())){
				index=i;
				break;
			}
		}
		return index;
	}
	public void addPerson(Person p) throws DuplicateTelException{
		if(findIndexByTel(p.getTel())!=-1)
			throw new DuplicateTelException(p.getTel()
					+" tel�� �����Ͽ� �߰��Ұ�!");
		list.add(p);
	}
	public void printAll(){
		Iterator<Person> it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	public Person findPersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ��ȸ�� �� �����ϴ�.!");
		return list.get(index);
	}
	public void updatePerson(Person p) throws PersonNotFoundException{
		int index=findIndexByTel(p.getTel());
		if(index==-1)
			throw new PersonNotFoundException(p.getTel()+" tel�� �������� �ʾ� ������ �� �����ϴ�.!");
		list.set(index, p);
	}
	public void deletePersonByTel(String tel) throws PersonNotFoundException{
		int index=findIndexByTel(tel);
		if(index==-1)
			throw new PersonNotFoundException(tel+" tel�� �������� �ʾ� ������ �� �����ϴ�.!");
		list.remove(index);
	}
}
































