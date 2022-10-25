package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {
		
		// AutoBoxing 자동형변환
		int a = 100;
		Integer val = a; // boxing
		a = val; // unboxing
		
		Object[] arr = {1,2,3};
		
		int v1 = Integer.parseInt("3");
		int v2 = Integer.parseInt("34");
		double v3 = Double.parseDouble("3.14");
		long v4 = Long.parseLong("1242342343");
		
		System.out.println(v1+v2);
		System.out.println(v3+v4);
	}

}
