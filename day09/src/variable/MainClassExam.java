package variable;


public class MainClassExam {
public static void main(String[] args) {
	TestClassExam t = new TestClassExam();
	//t.display();
	String name = t.nameInput();
	int age = t.ageInput();
	int a_age = t.age(age);
	
	System.out.println("이름 :" +name);	
	System.out.println("만 나이: " +a_age );
}
	
	
}
