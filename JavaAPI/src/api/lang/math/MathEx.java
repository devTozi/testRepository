package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		// 올림
		double d = Math.ceil(1.3);
		System.out.println(d);
		
		// 내림
		double d2 = Math.floor(1.3);
		System.out.println(d2);
		
		// 반올림
		System.out.println(Math.round(3.14));
		
		// 루트
		System.out.println(Math.sqrt(16));
		
		// 절대값
		System.out.println(Math.abs(-10));
		
		// 큰값
		System.out.println(Math.max(5, 3));
		
		// 작은값
		System.out.println(Math.min(5, 3));
		
		
	}

}
