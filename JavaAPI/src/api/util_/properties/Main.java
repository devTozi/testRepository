package api.util_.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		// 객체 생성
		Properties p = new Properties();
		System.out.println(p.getProperty("name")); // 존재하지 않는 key 사용 시 null 리턴
		
		// 프로퍼티 저장
		p.setProperty("아담", "한국 최초의 사이버 가수");
		p.setProperty("강진 축구", "세계 최초의 온라인 축구 게임");
		p.setProperty("프리스톤테일", "한국 최초의 자체 3D 엔진 MMORPG");
		
		System.out.println(p.getProperty("아담"));
		System.out.println(p.getProperty("강진 축구"));
		System.out.println(p.getProperty("프리스톤테일"));
		System.out.println(p.getProperty("프리스톤"));
		
		// 텍스트 파일로 저장
		// 현재 작업 디렉토리에 파일로 저장
		// git 에 연결되신 분은 workspace가 아니고
		// c 드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있습니다.
		try {
			p.storeToXML(new FileOutputStream("./myproject.properties.xml"), "텍스트 저장");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
