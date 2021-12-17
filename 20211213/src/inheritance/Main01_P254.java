package inheritance;   // ● 실행부 ●

public class Main01_P254 {
	public static void main(String[] args) {
		
		// Student가 Person을 상속했기 때문에 자신의 자원 뿐만 아니라 Person의 자원을 사용할 수 있습니다.
		
		Student s1 = new Student();
		s1.name = "고다은";
		s1.age = 20;
		s1.stuNum = 15;
		
		s1.getInfo();
		s1.getStudentInfo();
	}
}
