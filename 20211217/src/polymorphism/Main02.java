package polymorphism;

public class Main02 {
	public static void main(String[] args) {
		
		// Student 이외에 Person을 상속 받은 직군을 2개 더 만들어주세요.
		// Main02에 만들어진 신규 자료형을 부모타입 하나로 받아서 처리해주세요.
		
		Person t1 = new Teacher("선생님", 40, "수학");
		t1.showPerson();
		
		Person s1 = new Staff("스태프", 30);
		s1.showPerson();
	}
}
