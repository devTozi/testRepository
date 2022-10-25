package api.util_;

public class FibonacciEx01 {

	// n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static int fibonacci(int n) {
		// 첫번째와 두번째는 1
		if(n==1 || n==2) {
			return 1;
		// 세번째부터는 앞의 2개 항의 합	
		}else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	public static void main(String[] args) {
		  
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(30));
		
	}

}
