package api.util_;

import java.util.Arrays;

public class ArraysEx01 {

	public static void main(String[] args) {
		
		// 문자열 배열 생성
		String[] ar = {"카리나","카이린","윈터","조이","슬기"};
		
		// 배열의 순회
//		for(String s : ar) {
//			System.out.println(s);
//		}
		
		// 문자열의 크기 비교하는 메서드: compareTo, compareToIgnorecase
//		System.out.println(ar[0].compareTo(ar[1]));
		
		// 선택 정렬
		// 배열의 복제
		String[] copyar = Arrays.copyOf(ar, ar.length);
		
		// 첫번째부터 n-1번째까지 
		for(int i=0; i<copyar.length; i++) {
			for(int j=0; j<copyar.length; j++) {
				if(copyar[i].compareTo(copyar[j]) < 0) {
					String temp = copyar[i];
					copyar[i] = copyar[j];
					copyar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(copyar));
	}

}
 // Arrays 클래스
 // 배열 관련 작업을 쉽게 할 수 있도록 도와주는 클래스
 // 배열에서 중요한 것
 // 1. 배열의 순회 (map)
 // 2. 정렬 (sort)
 // 3. 검색
 // 4. 복제
 // 5. 필터링
 // 6. 연산(reduce)

 // - sort
 // 데이터를 순서대로 나열하는 것
 // 오름차순(ascending), 내림차순(descending) 정렬
 // 정렬을 구현하는 방법 - 알고리즘을 이용해서 정렬 또는 API에서 제공하는 메서드를 이용해서 정렬(각 요소가 크기 비교가 가능하도록 해주어야 함)
 // 코딩 테스트에서 퀵정렬은 필수!(직접 구현, 설명이 가능하여야 함)

 // - search
 // 1. 순차검색: 앞에서부터 순서대로 탐색 - 효율성이 좋지 않음
 // 2. 제어검색: 정렬한 후 검색
 //   > binary search(이분검색): 중앙값과 비교 - up&down 게임 형태 - Arrays 클래스에서 제공하는 메서드
 //   > fibonacci search
 //   > 보간검색(interpolation): 검색 위치를 계산 - 데이터간 간격이 커질 경우 효율성 급락
 //	  > 트리검색(중요*): 하나의 데이터를 기준으로 크기를 비교하여 트리 형태로 이어서 검색 
 //   > 블록검색: 블록은 정렬되어 있지만 블록 내부는 정렬되어 있지 않음 (블록을 분류시켜 놓음 ex.10번대 블록, 20번대 블록)
 //   > 해싱검색(중요*): ex. mod5 설정 시 데이터들을 5로 나눈 나머지를 기준으로 0, 1, 2, 3, 4 < 다섯가지 분류로 저장하여 검색할 데이터를 5로 나눠 해당 분류로 이동
 //           어떤 데이터가 들어오든 5로 나누는 연산 한번 + 해당 분류로 이동하여 검색하는 형태라 검색 평균 시간이 매우 일정하게 나타난다. 이것이 가장 큰 장점이다.











