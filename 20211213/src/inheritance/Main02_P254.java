package inheritance;     //● 실행부 ● (Person의 상속)

public class Main02_P254 {
	public static void main(String[] args) {
		
		//샐러리맨
		Salaryman s1 = new Salaryman();
		s1.name = "고다은";
		s1.age = 2;
		s1.salary = 10000;
		
		s1.getInfo();
		s1.getSalaryInfo();

		
		//학생
		Student ss1 = new Student();
		ss1.name = "고구마";
		ss1.age = 3;
		ss1.stuNum = 13;
		
		ss1.getInfo();
		ss1.getStudentInfo();
	
	
	
	
	}
}
