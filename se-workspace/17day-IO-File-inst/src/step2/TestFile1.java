package step2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
	public static void main(String[] args) {
		//File dir=new File("C:\\java-kosta");
		// �ü������ ������ �ٸ� �� �����Ƿ� �Ʒ��� ���� ǥ���ϴ� ���� �ٶ���
		File dir=new File("C:"+File.separator+"java-kosta");
		System.out.println(dir.exists());//�����ϸ� true
		System.out.println(dir.isDirectory());//���丮�� true
		System.out.println(dir.isFile());//�����̸� true
		System.out.println(dir.getPath());//��� ��ȯ
		// java-kosta �Ʒ��� test �̸��� ���丮�� �����غ��� 
		File testDir=new File(dir.getPath()+File.separator+"test");
		System.out.println(testDir.mkdirs());		
		// test ���丮�� a.txt ������ �����غ��� 
		File file=new File(testDir.getPath()+File.separator+"a.txt");
		System.out.println(file.getPath());
		System.out.println(file.exists());
		// createNewFile() �޼���� ������ �����Ѵ� 
		try {
			boolean flag=file.createNewFile();
			System.out.println("���� ���� "+flag);
		} catch (IOException e) {			
			e.printStackTrace();
		}
		System.out.println(file.exists()); //���������Ƿ� true 
		// ����� ���� ���丮 ������ ���ڿ��� ��ȯ 
		// a.txt ������ ���� ���丮 ��δ�? 
		System.out.println(file.getParent());
		// ����� ���� ���丮 ������ File ��ü�� ��ȯ 
		System.out.println(file.getParentFile());
		// a.txt �� ������ ��ġ�� b.txt�� �����ϰ��� �Ѵ� 
		// file ��ü�� ���� ���丮�� �˾Ƴ��� b.txt�� �����ϱ� ����
		// File ��ü�� �����ϰ� createNewFile() �� �����Ѵ� 
		File file2
		=new File(file.getParentFile().getPath()+File.separator+"b.txt");
		try {
			file2.createNewFile();
			System.out.println("b.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("*******************");
		File listDir
		=new File("C:"+File.separator+"java-kosta"+File.separator+"test");
		System.out.println(listDir.isDirectory());
		//listDir ���丮�� �����ϴ� ���� ����� ����غ��� 
		String list[]=listDir.list();
		for(int i=0;i<list.length;i++)
			System.out.println(list[i]);
		System.out.println("****************");
		//listDir ���丮�� �����ϴ� ���� ����� ���� ��ü�� ��ȯ�޾� 
		// ����غ��� 
		File fa[]=listDir.listFiles();
		for(int i=0;i<fa.length;i++)
			System.out.println(fa[i].getPath());
	}
}










