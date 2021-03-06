package polymorphism;

public class Person {
	// polymorphism = 다형성
	// Person은 사람을 나타내는 클래스
	// 실제로 쓰려는 것이 아니라 상속을 목적으로 함.
	// ★★★ Person을 상속 받은 자식들은 전부 Person을 요구하는 자리에 대입될 수 있다. ★★★
	
	private String name;   // 이름
	private int age;       // 나이
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// Person클래스의 전체 데이터를 콘솔에 찍어주는 showPerson()
	// Person 타입으로 호출했을 때 유일하게 호출 가능한 메서드
	// 이 메서드를 자식쪽에 오버라이딩 하면 부모타입으로도 자식쪽 showPerson()을 호출할 수 있다. 
	public void showPerson() {
		System.out.println("이름 : " + this.name + ", 나이 : " + this.age);
	}

	

	// setter와 getter 생성
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
