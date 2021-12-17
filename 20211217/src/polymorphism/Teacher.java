package polymorphism;

public class Teacher extends Person{
	
	private String subject; // 과목

	// 생성자 Teacher
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	
	// 메서드 Teacher 조회
	public void showPerson() {
		super.showPerson();
		System.out.println("과목 : " + subject);
	}
}
