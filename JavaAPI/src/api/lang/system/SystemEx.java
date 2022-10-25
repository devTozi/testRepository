package api.lang.system;

import java.io.PrintStream;

public class SystemEx {
	
	public static void main(String[] args) {
		
		System.out.println("출력");
		
//		System.exit(0);
//		System.gc();
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		
		long sum = 0;
		for(long i=0; i<=10000000000L; i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end);
		
		System.out.println((end - start)*0.001 + "초 소요");
		
	}
	
}

