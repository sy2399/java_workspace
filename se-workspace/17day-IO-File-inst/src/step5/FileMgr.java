package step5;

import java.io.File;

public class FileMgr {
	/*  path�� �ش��ϴ� ���� ��ο� ������ ���丮�� �ִ� 
	 *  ���ϵ��� �̸�(Ȯ���� ����)�� ����Ѵ� ( ���丮�� �����Ѵ� ) 
	 *  
	 */
	public void printFileNameNoExt(String path) {
		File fa[]=new File(path).getParentFile().listFiles();
		for(int i=0;i<fa.length;i++){
			if(fa[i].isFile())
			System.out.println(
					fa[i].getName().substring(
							0,fa[i].getName().lastIndexOf(".")));
		}
	}
}





