package api.util_;

// VO 데이터를 표현하기 위한 명칭 / DTO 데이터 이동용 명칭 / NTT 데이터베이스와 연동 관련 명칭
public class PersonVO implements Comparable<PersonVO> {

	private int num;
	private String name;
	private int age;
	
	// 디폴트 생성자 
	public PersonVO() {}
	
	// 속성을 전부 매개변수로 받는 생성자
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// 데이터 출력을 편리하게 하기 위한 메서드
	// 출력하는 메서드에 인스턴스 이름을 대입하면 이 메서드가 호출되서 출력함
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
	
	// 크기 비교하는 메서드: 정렬을 하기 위해 사용
	@Override
	public int compareTo(PersonVO o) {
		// 크기 비교 방법 설정
		return o.name.compareTo(this.name);
	}
	
	
}
