package review;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/*
 * 콘솔로부터 데이터를 입력받아 
 * CommonInfo 의 FILE_PATH2 파일에 저장하는 클래스 
 */
public class TestIOReview4 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(
				new InputStreamReader(System.in));
		try {
			/*PrintWriter pw=new PrintWriter(
					new FileWriter(CommonInfo.FILE_PATH2));*/
			//API DOC: PrintWriter(OutputStream out, boolean autoFlush)
			//autoFlush 에 true를 할당하면 println() 실행시 즉시 데이터 출력
			//이 부분 다음주에 실수하면 노래하기!!!!! 
			PrintWriter pw=new PrintWriter(
					new FileWriter(CommonInfo.FILE_PATH2),true);
			System.out.println("메뉴 입력");
			while(true){
				String data=br.readLine();
				if(data.equals("주문끝")){
					break;
				}
				System.out.println(data+" 주문처리");
				pw.println(data);
			}
			pw.close();
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}











