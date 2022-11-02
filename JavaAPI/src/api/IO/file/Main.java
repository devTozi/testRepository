package api.IO.file;

import java.io.File;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		// 파일에 대한 정보 확인
		try {
			// File 객체 생성
			// windows 에서는 디렉토리 구분 기호가 \ 인데 프로그래밍 언어에서는 \ 가 오고 하나의 문자가 오면 제어 문자로 인식
			// 그렇기 때문에 \ 를 쓸때는 두 번씩 기입해야 함
			File f = new File("C:\\Users\\이성호\\Desktop\\강의\\중앙 학원 강의\\자바교안\\자바 1회차.txt");
			
			// 파일의 존재 여부 확인
			System.out.println(f.exists());
			
			// 마지막 수정 날짜
			System.out.println(f.lastModified()); // 알 수 없는 숫자로 출력
			System.out.println(new Date(f.lastModified())); // Date 객체에 전달 시 시간 출력됨
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
