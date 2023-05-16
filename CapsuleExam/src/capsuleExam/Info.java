package capsuleExam;

import java.util.ArrayList;
import java.util.HashMap;

public class Info {

	private String name;
	private int phone, age;
	private String addr;
	private ArrayList arr = new ArrayList<>();
	private HashMap<String, ArrayList> map = new HashMap<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}


}
