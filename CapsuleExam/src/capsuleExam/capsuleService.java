package capsuleExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class capsuleService implements Service{

	Info i = new Info();
	HashMap map = new HashMap<>();
	ArrayList arr = new ArrayList();

	public capsuleService(String name, int age, int phone, String addr) {

		i.setAddr(addr);
		i.setName(name);
		i.setAge(age);
		i.setPhone(phone);

	}

	public capsuleService() {
	}
	//@Override
	public void setmap() {

		map.put(i.getName(), setArr());

	}

	public ArrayList setArr() {
		// arr.removeAll(arr);
		ArrayList list = new ArrayList();
		list.add(i.getName());
		list.add(i.getAge());
		list.add(i.getAddr());
		list.add(i.getPhone());
		System.out.println("arr완료");
		return list;

	}

	public HashMap getmap() {
		setmap();

		return map;
	}

	public void removemap(String name) {

		map.remove(name);

	}

}
