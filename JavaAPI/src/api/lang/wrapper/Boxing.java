package api.lang.wrapper;

public class Boxing {

	public static void main(String[] args) {
		
		int a = 100;
		double d = 3.14;
		long c = 200L;
		
		// 기본형 > 객체형 포장하는 작업을 boxing
		Integer val = new Integer(a);
		System.out.println(val);
		Double val1 = new Double(d);
		Long val2 = new Long(c);
		
		Object[] arr = {val, val1, val2}; // 객체형 변수를 Object 배열에 저장
		
		// 객체형을 기본형으로 변경 unboxing
		int a1 = val.intValue();
		double a2 = val1.doubleValue();
		long a3 = val2.longValue();
 		
	}

}
