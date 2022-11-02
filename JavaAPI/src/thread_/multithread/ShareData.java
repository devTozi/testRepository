package thread_.multithread;

import java.util.concurrent.locks.ReentrantLock;

// 자원을 가지고 연산을 하는 스레드에 사용할 클래스
public class ShareData implements Runnable {
	// 연산 결과를 저장할 속성
	private int result;
	// 연산에 사용할 인덱스
	private int idx;
	
	// 공유 코드 영역을 설정하기 위한 객체
	static final ReentrantLock Lock = new ReentrantLock();
	
	// result의 getter 메서드
	public int getResult() {
		return result;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
				// 동기화 범위를 지정하는 것이 중요하다.
				// 코드가 효율적으로 동작하기 위한 범위를 지정해줘야 불필요한 리소스 낭비가 방지될 수 있다
				Lock.lock();
				idx++;
				Thread.sleep(1);
				result = result + idx;
				Lock.unlock();
			}
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
