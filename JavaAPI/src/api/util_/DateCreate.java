package api.util_;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {

	public static void main(String[] args) {
		
		// 현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		
		// 출력
		System.out.println(currentTime);
		
		// 원하는 날짜를 가지고 생성
		Date firstMeetingTime = new Date(94, 9, 11, 2, 0 ,0); // 연도는 -1900, 월은 -1로 해야 원하는 시간대 설정 가능
		
		// 출력
		System.out.println(firstMeetingTime);
		System.out.println(firstMeetingTime.getYear()+1900); // 연도만 출력, getter 메서드 이용해서 원하는 데이터만 출력 가능
		
		// 원하는 포맷으로 출력
		// java.text.SimpleDateFormat 클래스와 같이 사용하는 경우가 많음 - 해당 클래스 format 메서드에 date 객체를 전달하면 날짜 서식이 적용된 문자열이 리턴됨
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetingTime));
		
		// 연습해볼만한 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력
		// 프로젝트에 적용할만한 기능 - 로그인한 시간 저장, 주소(위치) 저장
	}

}
