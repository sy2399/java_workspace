package step3;

import java.io.File;

public class FileService {
	/* �Ű������� ���޵� filePath�� ���ϰ� ������ ��ġ�� 
	 *  ����(���丮 �� �ڽ��� ����)���� ����ϴ� �޼��� 
	 */
	public void printFileName(String filePath) {
		File file=new File(filePath);
		File dir=file.getParentFile();
		File fa[]=dir.listFiles();
		for(int i=0;i<fa.length;i++){
			if(fa[i].isFile()&&filePath.equals(fa[i].getPath())==false){
				System.out.println(fa[i].getName());
			}
		}
	}
}








