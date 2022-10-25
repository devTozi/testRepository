package api.util_;

import java.util.ArrayList;

public class CollectionTest2 {

	public static void main(String[] args) {

		// 문자열을 저장하는 ArrayList 생성
		ArrayList<String> a1 = new ArrayList<>();
		
		// 샘플 데이터 추가
		a1.add("One");
		a1.add("Three");
		
		long start = System.currentTimeMillis();
		for(int i=0; i<10; i++) {
			a1.add(1, "Two");
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.out.println(a1.get(0));
		System.out.println(a1.get(9));
		System.out.println(a1.get(a1.size()-1));
		System.out.println(a1.size());
		System.out.println(a1.toString());
		
	}

}
