package api.util_;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		
		// 문자열 배열 생성
		String[] singers = {"장원영","카리나","지젤","민지","태연","아이유","수지"};
		
		// 이분검색 수행 - sort를 하지 않아 잘못된 결과가 리턴됨 
		int result = Arrays.binarySearch(singers, "태연");
		System.out.println(result); // 음수값 출력
		
		// 정렬 후 검색
		Arrays.sort(singers);
		System.out.println(Arrays.toString(singers));
		int result2 = Arrays.binarySearch(singers, "태연");
		System.out.println(result2); // 음수면 존재하지 않음, 양수면 해당 인덱스 출력
		if(result2 >= 0) {
			System.out.printf("%s는(은) %d 번째 존재\n", "태연", result2+1);
		}else {
			System.out.printf("%s는(은) 존재하지 않음\n", "태연");
		}
		
	}

}
