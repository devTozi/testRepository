package thread_.multithread;

public class Main {

	public static void main(String[] args) {
		
		// Runnable 인터페이스를 상속받은 클래스
		ShareData sd = new ShareData();
		
		// 스레드 생성
		Thread th1 = new Thread(sd);
		th1.start();
		Thread th2 = new Thread(sd);
		th2.start();
		
		try {
			// 30초 대기 - 앞의 작업이 스레드로 동작하기 때문에 작업이 끝날때까지 대기하고 결과를 출력
			Thread.sleep(3000);
			System.out.println(sd.getResult());
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
