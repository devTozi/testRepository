package api.lang.wrapper;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수를 입력하세요 : ");
		String s = sc.nextLine();
		
		try {
			// 실수 문자열을 실수로 변경
			Double silsu = Double.parseDouble(s);
			// 실수를 문자열로 변환
			String msg = silsu.toString();
			System.out.println(msg);
			
		} catch (Exception e) {
			System.out.println("변환에 실패");
		}
		
		sc.close();
	}

}
