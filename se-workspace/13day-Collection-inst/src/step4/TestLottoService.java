package step4;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		LottoService service=new LottoService();
		TreeSet<Integer> lottoNumSet=service.createLottoNum();
		System.out.println(lottoNumSet);
		/* �� �ڵ带 �����ϸ� 1���� 45 ������ ������ �� 6�� Set ��ȯ�Ǿ� 
		 * ���ĵ� ���� ���  2�� 20�� ����(�޽� + �ڵ�)
		 */
	}
}








