package step2;

import java.io.File;

public class TestFile2 {
	public static void main(String[] args) {
		String dir
		="C:\\java-kosta\\util\\eclipse-jee-neon-2-win32-x86_64\\eclipse";
		// �� dir ���丮�� �ִ� ���ϸ��� ����Ѵ� ( ���丮�� ���� ) 
		File dirObj=new File(dir);
		File fa[]=dirObj.listFiles();
		for(int i=0;i<fa.length;i++){
			if(fa[i].isFile())
				System.out.println(fa[i].getName());
		}
	}
}





