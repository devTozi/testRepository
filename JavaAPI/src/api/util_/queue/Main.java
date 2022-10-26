package api.util_.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		// PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		// 정수를 저장하는 PriorityQueue 생성
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		// 데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		
		// 데이터 꺼내기 - 오름차순으로 정렬되어 출력
		System.out.println(intQueue); // 저장된 것을 정렬되어 저장되지 않음
		System.out.println(intQueue.poll()); // 호출할 때는 정렬된 순으로 반환한다
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll()); // 저장된 데이터가 없다면 null 반환

		System.out.println("===============================");
		
		// PersonVO 클래스를 저장하는 우선순위 큐
		// PriorityQueue<PersonVO> persons = new PriorityQueue<>();
		
		// 위 상태에서는 PersonVO 클래스 내 크기를 비교할 기준이 없어 예외 발생
		// PersonVO 클래스에 Comparable 인터페이스를 implements하고
		// ComparableTo 라는 메서드를 재정의해서 해결 할 수 있고
		
		// Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를  << 아래 방법이 안정적
		// 구현한 클래스의 인스턴스를 이용해서 생성해도 된다.
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {
			
			// o1를 기준으로 양수, 음수, 0을 판단하여 o1를 이동시키는 구조 == 오름차순
			// return 구문에 위치를 바꿔주면 내림차순으로 정렬
			@Override
			public int compare(PersonVO o1, PersonVO o2) { 
				return o1.getPhone().compareTo(o2.getPhone());
			}
			
		});
		persons.offer(new PersonVO(1, "아담", new Date(100, 7, 10), "01023214221"));
		persons.offer(new PersonVO(2, "이브", new Date(102, 5, 3), "01013214223"));
		persons.offer(new PersonVO(3, "프리", new Date(97, 1, 3), "01033214223"));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
		
	}
}
