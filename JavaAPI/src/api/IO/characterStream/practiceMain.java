package api.IO.characterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class practiceMain {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("./log1.txt"));
			
			Map<String, Integer> log = new HashMap<>(); // ip별 접속 횟수 저장 
			Map<String, Integer> log2 = new HashMap<>(); // ip별 트래픽 합 저장
			
			long traffic_sum = 0;
			
			while(true) {
				
				// 트래픽 합
				String[] tar = br.readLine().split(" ");
				if(br.readLine()== null) break;
				if(tar[tar.length-1].equals("-")) continue;
				traffic_sum += Integer.parseInt(tar[tar.length-1]);
				
				// ip별 접속 횟수
				if(log.containsKey(tar[0])) log.put(tar[0], log.get(tar[0])+1);
				else log.put(tar[0], 1);
				
				// ip별 트래픽 합
				if(log2.containsKey(tar[0])) log2.put(tar[0], log2.get(tar[0])+Integer.parseInt(tar[tar.length-1]));
				else log2.put(tar[0], Integer.parseInt(tar[tar.length-1]));
				
			}
			// 트래픽 합 출력
			System.out.println("트래픽 합 : "+traffic_sum);
			System.out.println("=====================");
			System.out.println(" <IP별 접속 횟수> ");
			
			// ip별 접속 횟수 출력
			Set<String> set = log.keySet();
			for(String data : set) {
				System.out.println(data + " : " +log.get(data));
			}
			System.out.println("=====================");
			System.out.println(" <IP별 트래픽 합> ");
			Set<String> set2 = log2.keySet();
			for(String data : set2) {
				System.out.println(data + " : " +log2.get(data));
			}
			
			br.close();
			
		} catch (Exception e) {
			System.out.println("오류 : "+e.getLocalizedMessage());
		}
		
	}

}
