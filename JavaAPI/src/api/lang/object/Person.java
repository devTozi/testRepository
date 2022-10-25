package api.lang.object;

public class Person implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	// 오버라이딩 - toString
	// generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	// 오버라이딩 - equals
	// 멤버변수명이 같으면 true를 반환하도록 구현
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person) {
			Person p = (Person)obj;
			String s = p.getName();
			if(s.equals(this.name)) {
				return true;
			}
		}
		
		return false;
	}
	
	// clone 메서드를 사용하고 싶다면 오버라이드 + Cloneable 구현(implements) 필요
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	
	
}
