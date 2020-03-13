package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * System.in : InputStream 타입으로 8bit 단위 ByteStream
 * 				 콘솔로부터 데이터 입력시 사용하는 노드 스트림 
 * 				 노드 스트림이란 직접 장치 또는 자원에 연결되는 스트림 
 * InputStreamReader : 8bit ByteStream 을 16bit CharacterStream으로 
 * 							변환하는 프로세스(보조) 스트림 
 * 						    프로세스(보조) 스트림이란 
 * 						    기존 스트림에 연결되어 다양한 기능을 제공하는 스트림 
 */
public class TestIOReview2 {
	// System.in < InputStreamReader < BufferedReader 
	public static void main(String[] args) {
		//콘솔에 연결되는 8bit 단위의 노드 스트림
		InputStream is=System.in; 
		//16bit 단위스트림으로 변환
		InputStreamReader ir=new InputStreamReader(is); 
		BufferedReader br=new BufferedReader(ir);
		try {
			System.out.println("읽은 내용:"+br.readLine());
			br.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}











