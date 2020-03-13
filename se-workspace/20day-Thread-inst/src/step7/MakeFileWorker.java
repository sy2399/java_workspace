package step7;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class MakeFileWorker implements Runnable {
	private int period;
	private int count;

	public MakeFileWorker(int period, int count) {
		this.period = period;
		this.count = count;
	}

	/*
	 * MakeFileWorker ������ ���� period �ð����� count ��ŭ�� ������ ������ ���丮�� ���� 0. ���� ���丮
	 * ���� 1. Random �� �̿��ؼ� Ȯ���ڸ� .mp3 or .avi �� �ش� 2. for ���� �̿��� count ��ŭ �ݺ��Ͽ�
	 * ������ �����ϵ� period �������� sleep �� �� ������ �簳�Ѵ�
	 * 
	 */
	// ���ϸ� Ȯ���ڸ� �ο��ϴ� �޼���
	public String createFileName(int name) {
		Random r = new Random();
		if (r.nextBoolean())
			return name + ".mp3";
		else
			return name + ".avi";
	}
	public void run() {
		new File(CommonInfo.MAKE_PATH).mkdirs();
		for (int i = 0; i < count; i++) {
			String fileName = createFileName(i);
			try {
				new File(CommonInfo.MAKE_PATH + File.separator + fileName).createNewFile();
				System.out.println(fileName + " ����");
				Thread.sleep(period);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
