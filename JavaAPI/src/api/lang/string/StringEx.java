package api.lang.string;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길-동길";
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("딩"));
		String result = s.replace("길", "");
		System.out.println(result);
		System.out.println(s.substring(2,3));
		
		String[] arr = s.split("길", 1);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(s.contains("김"));
		String result2 = String.copyValueOf(new char[] {'a','b','c'});
		System.out.println(result2);
		
		String result3 = String.valueOf(3);
		System.out.println(result3);
		
		
	}

}
