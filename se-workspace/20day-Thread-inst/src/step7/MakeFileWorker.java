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
	 * MakeFileWorker 스레드 실행 period 시간동안 count 만큼의 파일을 지정한 디렉토리에 생성 0. 저장 디렉토리
	 * 생성 1. Random 을 이용해서 확장자를 .mp3 or .avi 로 준다 2. for 문을 이용해 count 만큼 반복하여
	 * 파일을 생성하되 period 간격으로 sleep 한 후 실행을 재개한다
	 * 
	 */
	// 파일명에 확장자를 부여하는 메서드
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
				System.out.println(fileName + " 생성");
				Thread.sleep(period);
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
