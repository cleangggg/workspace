package constructor;

import java.io.IOException;
import java.util.HashMap;


public class win10Service {

	win10DTO dto = new win10DTO();
	ProcessBuilder pro = new ProcessBuilder();
	public win10Service(String s1) {
		pro.command(s1);
		try {
			pro.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public win10Service() {
	HashMap map = new HashMap();
	map.put("kkk","vvv");
	dto.setInfo(map);
	
	}
	
	public win10Service(HashMap map) {
		
		dto.setInfo(map);
		
		}
	public HashMap getmap() {
		 
		return dto.getInfo();
		
	}
}
