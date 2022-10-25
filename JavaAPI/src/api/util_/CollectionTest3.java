package api.util_;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {

	public static void main(String[] args) {
		
		// 100000 개의 데이터를 가진 ArrayList와 LinkedList 생성
		ArrayList<Integer> a1 = new ArrayList<>();
		for(int i=0; i<100000; i++) {
			a1.add(i);
		}
		LinkedList<Integer> li = new LinkedList<>();
		for(int i=0; i<100000; i++) {
			li.add(i);
		}
		
		// ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간 측정
		// 데이터를 가져오는 메서드는 get(index)
		long Start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			a1.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 조회 시간: " + (end - Start)*1/1000.0+"초");
		
		// LinkedList에서 100000개의 데이터를 읽는데 걸리는 시간 측정
		Start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			li.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 조회 시간: " + (end - Start)*1/1000.0+"초");
		
		
	}

}
