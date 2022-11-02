package nestedclass;

public class OuterClass {
	
	// 내포 클래스 - 다른 클래스 안에 만들어진 클래스 - private, protected 사용 가능
	class Inner{
		public int num;
		
	}
	
	// 내포 클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용할 수 있도록 static을 추가 - 17버전부터는 클래스에 static 안붙여도 자동으로 static 영역에 생성됨
	class StaticInner{
		public int num;
		public static int shore;
	}
	
	public void method() {
		// 메서드 안에 만들어진 클래스
		// 메서드 안에서만 사용이 가능한 클래스
		// 다른 inner 클래스에서 필요로할 경우 멤버필드로 localinner 클래스를 이동시켜 사용
		class LocalInner{
			public int num;
		}
	}
	
}
