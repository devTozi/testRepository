package api.util_.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;


public class Lotto {

	public static void main(String[] args) {
		
		// 랜덤한 숫자 추출
		Random r = new Random();
		
		// ArrayList 활용
		ArrayList<Integer> al = new ArrayList<>();
		
		// ArrayList의 사이즈가 6보다 작을때 까지
		while(al.size() < 6) {
			// 1~45까지의 숫자 랜덤 추출
			int su = r.nextInt(45)+1;
			// 중복검사
			if(al.contains(su)) continue;
			al.add(su);
		}
		// 출력 전 정렬
		al.sort(null); // 비교 기준이 존재하여 매개변수는 null 전달
		System.out.println(al);
		
		
		// TreeSet 활용 - 중복된 데이터를 저장하지 않고 정렬되어 저장되기 때문에 추가적인 작업이 필요없음
		TreeSet<Integer> ts = new TreeSet<>();
		
		while(ts.size() < 6) {
			int su = r.nextInt(45)+1;
			ts.add(su);
		}
		System.out.println(ts);
		
	}

}
