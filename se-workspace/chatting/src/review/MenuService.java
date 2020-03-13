package review;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MenuService {
	public void order() throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(new FileWriter(CommonInfo.FILE_PATH2), true);
			System.out.println("메뉴 입력");
			while (true) {
				String data = br.readLine();
				if (data.equals("주문끝")) {
					break;
				}
				System.out.println(data + " 주문처리");
				pw.println(data);
			}
		} finally {
			if (pw != null)
				pw.close();
			if (br != null)
				br.close();
			System.out.println("close 완료~");
		}
	}
}





