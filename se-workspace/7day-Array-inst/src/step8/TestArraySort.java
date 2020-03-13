package step8;

public class TestArraySort {
	public static void main(String[] args) {
		int[] point = { 4, 2, 3, 1 };
		printArray(point);
		System.out.println("**�������� ����**");
		// �迭 �������� ����
		int size = point.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (point[i] > point[j]) {
					int temp = point[i];// ��ȯ(swap)
					point[i] = point[j];
					point[j] = temp;
				}
				System.out.println(i+" "+j+
						" ��� ���� i�� j���� ũ�� ��ȯ ");
				printArray(point);
				System.out.println();
			}
		}
		System.out.println("***�������� ���İ��***");
		printArray(point); // 1 2 3 4
	}

	public static void printArray(int[] point) {
		for (int i = 0; i < point.length; i++)
			System.out.print(point[i] + " ");
		System.out.println();
	}
}
