package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동");
		
		// toString()
		System.out.println(p1.toString());
		
		// equals()
		Person p2 = new Person("홍길동");
		System.out.println(p2.equals(p1));
		System.out.println(p2.toString().equals(p1.toString()));
		
		// clone() - 객체 복사
		try {
//			Object obj = p1.clone();
			Person p3 = (Person) p1.clone();
			System.out.println("복사된 객체의 name: "+p3.getName());
			System.out.println(p3.equals(p2));
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
		
	}

}
