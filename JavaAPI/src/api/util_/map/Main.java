package api.util_.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// HashMap 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		// 데이터 저장 - put
		map.put("num", 1);
		map.put("name", "아담");
		map.put("job", "Singer");
		// 동일한 key로 저장하면 이전 데이터는 삭제되고 수정됨
		map.put("job", "Cyber Singer");
		
		// 전체 데이터 확인
		System.out.println(map);
		
		// Map에서 데이터 가져오기
		System.out.println(map.get("name"));
		System.out.println(map.get("age")); // 없는 key 사용 시 null 리턴
		System.out.println("=======================================");
		
		// Map을 이용하면 key의 이름을 몰라도 모든 데이터에 접근하는 것이 가능 < Map의 가장 큰 장점
		Set<String> keys = map.keySet();
		// Set을 순회
		for(String key : keys) {
			System.out.println(key+": "+ map.get(key));
		}
		
	}

}
