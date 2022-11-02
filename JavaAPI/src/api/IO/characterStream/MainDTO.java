package api.IO.characterStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class MainDTO {

	public static void main(String[] args) {
		
		try(// 인스턴스 단위로 파일에 기록할 수 있는 객체 생성
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("multiobject.txt"));) {
			
			// 기록할 인스턴스 생성
			StudentDTO dto = new StudentDTO(1, "아담", new Date());
			StudentDTO dto2 = new StudentDTO(2, "강진축구", new Date());
			
			// 기록할 인스턴스가 여러개이므로 하나의 list로 묶기
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto2);
			
			// 기록
			oos.writeObject(list);
			
//			oos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		// 읽기
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./multiobject.txt"));){
			
//			StudentDTO dto = (StudentDTO)ois.readObject(); // serializable.txt 읽기
//			System.out.println(dto);
			
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
//			ois.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
