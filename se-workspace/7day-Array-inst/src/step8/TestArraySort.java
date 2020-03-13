package step8;

public class TestArraySort {
	public static void main(String[] args) {
		int[] point = { 4, 2, 3, 1 };
		printArray(point);
		System.out.println("**오름차순 정렬**");
		// 배열 오름차순 정렬
		int size = point.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (point[i] > point[j]) {
					int temp = point[i];// 교환(swap)
					point[i] = point[j];
					point[j] = temp;
				}
				System.out.println(i+" "+j+
						" 요소 비교해 i가 j보다 크면 교환 ");
				printArray(point);
				System.out.println();
			}
		}
		System.out.println("***오름차순 정렬결과***");
		printArray(point); // 1 2 3 4
	}

	public static void printArray(int[] point) {
		for (int i = 0; i < point.length; i++)
			System.out.print(point[i] + " ");
		System.out.println();
	}
}
