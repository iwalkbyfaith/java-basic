package polymorphism;

// 부모 클래스를 Person으로 가지도록 상속해주세요.
public class Student extends Person{
	
	// 학생의 등급인 grade를 선언합니다.
	private int grade;
	
	
	// super()를 이용해 Person(부모) 생성자까지 커버하는 생성자를 만들어주세요.
	// 부모쪽에서 쓸 자원인 String name, int age 도 받고
	// 자식쪽에서 쓸 자원인 int grade 총 3개를 입력 요청합니다.
	public Student(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}
	
	// 상속 받은 showPerson을 활용한 메서드를 작성합니다.
	public void showPerson() {
		// 부모쪽 showPerson 호출
		super.showPerson();  // 이름과 나이를 콘솔에 찍어주는 구문
		System.out.println("학생 성적 : " + grade);
	}
	
	// 신분을 밝히는 코드를 Student에만(부모인 Person에는 정의X) 작성합니다.
	public void showStudent() {
		System.out.println("저는 학생입니다.");
	}
	

}
