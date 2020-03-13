package step7;

/*
 *  MakeFileWorker 스레드 :  1초 간격으로 30개 파일을 생성한다 
 *          확장자는 .mp3 or .avi 를 랜덤하게 
 *          만들고 파일명은 실행 순번대로 
 *          0.mp3 , 1.avi 와 같은 형식으로 한다 
 * MoveFileWorker 스레드 : 7초 간격으로 총 5번 
 *           생성된 파일을 확장자별로 이동시킨다  
 */
public class TestFileWorkerThread {
	public static void main(String[] args) {
		MakeFileWorker mw = new MakeFileWorker(1000, 30);
		Thread makeThread = new Thread(mw);
		makeThread.start();
		MoveFileWorker mw2 = new MoveFileWorker(7000, 5);
		Thread moveThread = new Thread(mw2);
		moveThread.start();
	}
}
