package network_;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TCPServer {

	public static void main(String[] args) {
		
		// try ~ resources 구문으로 메모리 해제를 하지 않아도 됨
		try(ServerSocket ss = new ServerSocket(9999);) {
			System.out.println("서버 대기 중...");
			
			// 클라이언트의 요청 대기
			try {
				Socket socket = null;
				Calendar c = Calendar.getInstance();
				
				int week = c.get(Calendar.DAY_OF_WEEK);
				
				// 클라이언트의 요청을 대기하다가 클라이언트의 요청이 오면 접속됨
				while(true) {
					socket = ss.accept();
					// 접속자 정보 출력
					System.out.println("접속자 정보: "+socket.toString());
					// 접속자와 문자열을 읽을 수 있는 스트림 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					// 한 줄의 메시지 읽기
					String message = br.readLine();
					System.out.println(message);
					if(message.equals("닫기")) break;
					
					// 메시지를 보낼 수 있는 스트림을 생성
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					if(message.indexOf("무슨") != -1 && message.indexOf("요일") != -1 && message.indexOf("내일") != -1) {
						pw.println(getWeek(week+1)+"요일이야");
					}else if(message.indexOf("무슨") != -1 && message.indexOf("요일") != -1){
						pw.println(getWeek(week)+"요일이야");
					}else {
						pw.println("그래");
					}
					pw.flush();
					
					// 정리 작성
					pw.close();
					br.close();
					socket.close();
					
				}
				
				
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}finally {
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	public static String getWeek(int week) {
		Calendar c = Calendar.getInstance();
		String strWeek = null;

		switch(week) {

		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;

		}
		
		return strWeek;
	}

}
