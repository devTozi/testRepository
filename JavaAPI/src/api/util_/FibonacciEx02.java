package api.util_;

public class FibonacciEx02 {

	// n번째 피보나치 수열의 값을 리턴
	public static long fibonacci(long n) {
		// 이전 항의 값과 이전의 이전 항의 값을 저장할 변수
		long f1 = 1;
		long f2 = 1;
		
		// 피보나치 값을 저장할 변수
		long fibo = 1;
		
		// 첫번째와 두번째는 처리할 필요가 없어서 반복문을 세번째부터 적용
		for(int i=3; i<=n; i++) {
			fibo = f1 + f2;
			f2 = f1;
			f1 = fibo;
		}
		return fibo;
	}
	
	public static void main(String[] args) {

		System.out.println(fibonacci(100));
		
	}

}
