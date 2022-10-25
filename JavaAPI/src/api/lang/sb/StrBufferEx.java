package api.lang.sb;

public class StrBufferEx {

	public static void main(String[] args) {
		
		String str = new String("Java");
		
		StringBuffer sb = new StringBuffer("Java");

		str = str + "Program";
		sb.append("Program");
		System.out.println(str);
		System.out.println(sb);
		
		// 문자열 마지막에 추가
		sb.append("마지막에 추가");
		System.out.println(sb);
		
		// 문자열 중간에 추가
		sb.insert(11, "-");
		System.out.println(sb);
		
		// 문자열 변경
		sb.replace(0, 4, "자바");
		System.out.println(sb);
		
		// 문자열 삭제
		sb.delete(2, 9);
		System.out.println(sb);
		
		// 문자열로 형변환
		System.out.println(sb.toString());
		String result = sb.toString();
		System.out.println(str.equals(result));
		
		// 거꾸로
		sb.reverse();
		System.out.println(sb);
		
	}

}
