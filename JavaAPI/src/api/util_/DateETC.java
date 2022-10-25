package api.util_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {

	public static void main(String[] args) {
		
		// 날짜와 시간을 다른 형태로 사용하는 클래스
		GregorianCalendar gc = new GregorianCalendar();
		
		// Date 보다 많은 정보를 출력
		System.out.println(gc);
		
		// 특정한 데이터를 조회 - 년도 추출
		System.out.println(gc.get(Calendar.YEAR));
		
		// 최근에 많이 사용하는 날짜 타입
		LocalDateTime ld = LocalDateTime.of(2022,10,27,18,50); // 연도나 월 입력 시 따로 +- 처리가 필요없음
		System.out.println(ld);
		
	}

}
