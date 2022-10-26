package api.util_.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {

	public static void main(String[] args) {

		// 문자열을 저장하는 set 인스턴스 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> linkedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		// 샘플 데이터 삽입
		hashSet.add("LG EDS");
		linkedHashSet.add("LG EDS");
		treeSet.add("LG EDS");
		
		hashSet.add("adamsoft");
		linkedHashSet.add("adamsoft");
		treeSet.add("adamsoft");
		
		hashSet.add("39");
		linkedHashSet.add("39");
		treeSet.add("39");
		
		hashSet.add("Triangle");
		linkedHashSet.add("Triangle");
		treeSet.add("Triangle");
		
		hashSet.add("SM");
		linkedHashSet.add("SM");
		treeSet.add("SM");
		
		hashSet.add("Choongang");
		linkedHashSet.add("Choongang");
		treeSet.add("Choongang");
		
		hashSet.add("KB");
		linkedHashSet.add("KB");
		treeSet.add("KB");
		
		hashSet.add("Kakao");
		linkedHashSet.add("Kakao");
		treeSet.add("Kakao");
		
		// 데이터 출력
		// HashSet - 출력 순서를 예상할 수 없음
		for(String company : hashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		// linkedHashSet - 입력 순서대로 정렬
		for(String company : linkedHashSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		// treeSet - 아스키 코드값 기준으로 정렬
		for(String company : treeSet) {
			System.out.print(company + "\t");
		}
		System.out.println();
		
	}

}
