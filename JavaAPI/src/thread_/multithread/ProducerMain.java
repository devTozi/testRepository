package thread_.multithread;

public class ProducerMain {

	public static void main(String[] args) {
		
		// 자원 생성
		Product pd =new Product();
		
		// 하나의 자원을 이용해서 2개의 스레드를 생성 및 실행
		new Producer(pd).start();
		new Customer(pd).start();
		
	}

}
