package api.util_;

import java.util.Arrays;

public class CollectionTest1 {

	public static void main(String[] args) {
		
		String[] ar = {"List", "Set", "Map"};
		
		// 배열의 데이터 수정은 가능
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));
		
		// ar 배열에 데이터를 추가 - ar 배열보다 1개 더 큰 공간을 갖는 배열 생성
		String[] br = new String[ar.length+1];
		// ar 복사
		for(int i=0; i<ar.length; i++) {
			br[i] = ar[i];
		}
		// br의 마지막에 데이터 추가
		br[br.length-1] = "Properties";
		// br이 가리키는 곳을 ar이 가리키도록 한다.
		ar = br;
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(br));
		
		// 연습 배열 내 Set 삭제하기
		for(int i=0; i<ar.length; i++) {
			if(ar[i].equals("Set")) {
				for(int j=i; j<ar.length-1; j++) {
					ar[j] = ar[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
