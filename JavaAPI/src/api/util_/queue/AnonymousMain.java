package api.util_.queue;

interface Starcraft{
	public void attack();
}

// 인터페이스를 구현한 클래스 생성
class Protoss implements Starcraft{
	@Override
	public void attack() {
		System.out.println("질럿의 공격");
	}
}

public class AnonymousMain {

	public static void main(String[] args) {

		// 인터페이스를 implements 한 클래스를 만들고 인스턴스를 만든 후 메서드를 호출
		Protoss p = new Protoss();
		p.attack();
		
		// 인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 생성해서 호출
		// 한번만 호출할 때 아래 방법이 좋음
		Starcraft z = new Starcraft() {
			@Override
			public void attack() {
				System.out.println("저그의 공격");
			}
		};
		z.attack();
		
//		Starcraft p2 = new Protoss(); // 객체는 구현한 클래스 기입하면 생성 가능
//		p2.attack();
		
		// 익명 객체
		new Starcraft() { // 변수조차 사용하지 않고 인스턴스를 통해 메서드 호출
			@Override
			public void attack() {
				System.out.println("테란의 공격");
			}
		}.attack();;
		
	}

}
