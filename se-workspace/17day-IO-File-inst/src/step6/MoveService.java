package step6;

import java.io.File;

public class MoveService {
	/* orgDir�� �ִ� ���ϵ� �� ext Ȯ���ڿ� �ش��ϴ� ���ϵ鸸 
	 * destDir ���丮�� �̵���Ű�� �޼��� 
	 */
	public void execute(String orgDir, String destDir, String ext) {
		//�̵��� ���丮�� �����Ѵ� 
		new File(destDir).mkdirs();
		//���丮��ü�κ��� ���ϰ�ü�迭�� ��ȯ�޴´�  
		File orgFile[]=new File(orgDir).listFiles();
		for(int i=0;i<orgFile.length;i++){
			//�����̰� ext�� ������ 
			if(orgFile[i].isFile()&&orgFile[i].getName().endsWith(ext)){
				//destDir�� �̵���Ų�� 
				orgFile[i].renameTo(
						new File(destDir+File.separator+orgFile[i].getName()));
			}
		}
	}
}






