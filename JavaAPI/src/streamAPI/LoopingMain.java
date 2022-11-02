package streamAPI;

import java.util.ArrayList;

public class LoopingMain {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("프로그래밍 언어");
		list.add("데이터베이스");
		list.add("프레임워크");
		list.add("소프트웨어 공학");
		list.add("Toy Project");
		
		// 전체 데이터 출력 - 실행 속도는 가장 빠르지만 list의 데이터 개수가 변경되면 수정이 불편함
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println("=============1");
		
		// 반복문 이용 - list의 데이터 개수가 변경되도 수정할 필요가 없음
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 사이즈를 저장해두면 반복문이 반복할 때마다 size() 메서드를 호출하지 않아 효율적임
		int len = list.size();
		for(int i=0; i<len; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("=============2");
		
		// 모든 데이터를 순회한다면 빠른 열거를 이용하는 것이 효율적이다.
		// 일반 for문에 조건문을 수행하지 않아 더욱 효율적임
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("=============3");
		
		// 빠른 열거는 반복자를 외부에 만들어서 사용하는데 스트림 API는 내부 반복자를 사용한다.
		// 데이터가 많을 때 효율적임, 위 방법들과 비교하면 가장 빠름
		list.stream().forEach(subject -> {
			System.out.println(subject);
		});
		
	}

}
