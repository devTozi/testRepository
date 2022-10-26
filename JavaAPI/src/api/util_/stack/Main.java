package api.util_.stack;

import java.util.Date;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		// PersonVO 클래스의 인스턴스를 저장할 Stack 생성
		Stack<PersonVO> st = new Stack<>();
		
		// Stack에 데이터 저장 - push
		st.push(new PersonVO(1, "카리나", new Date(100, 3, 11), "01023142412"));
		st.push(new PersonVO(2, "민지", new Date(109, 5, 7), "01027442312"));
		
		// Stack에 데이터 꺼내기 - pop
		System.out.println(st.pop());
		System.out.println(st.pop());
		//System.out.println(st.pop()); // underflow로 인한 exception
		
	}

}
