package step7;

/*
 *  MakeFileWorker ������ :  1�� �������� 30�� ������ �����Ѵ� 
 *          Ȯ���ڴ� .mp3 or .avi �� �����ϰ� 
 *          ����� ���ϸ��� ���� ������� 
 *          0.mp3 , 1.avi �� ���� �������� �Ѵ� 
 * MoveFileWorker ������ : 7�� �������� �� 5�� 
 *           ������ ������ Ȯ���ں��� �̵���Ų��  
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
