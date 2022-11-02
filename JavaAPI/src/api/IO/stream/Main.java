package api.IO.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// 바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdg = new SimpleDateFormat("yyyy-MM-dd");
			
			//기록할 파일 만들기
			// 두번쨰 인자에 true을 적으면 기존 파일에 추가 기록
			FileOutputStream fos = new FileOutputStream("../"+sdg.format(date)+".txt", true); 
			
			// 기록할 메시지 생성
			String msg = "오늘 날짜2\n";
			// 파일에 기록
//			fos.write(msg.getBytes()); // 바이트 배열로 전달해야되기 때문에 String 타입에 getBytes메서드 사용
			
			// 파일을 닫기
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		// 앞에서 작성한 파일 읽기
		try {
			// 읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("2022-10-27.txt");
			
			// 읽어서 저장할 바이트 배열 생성
			byte[] bar = new byte[fis.available()];
			
			// 읽기
			fis.read(bar);
			
			// 읽은 내용 확인
			System.out.println(new String(bar));
			
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		
	}

}
