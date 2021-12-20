package casting;

public class Dog extends Animal{
	
	// 생성자를 이용해 부모쪽에 이름, 나이를 전달합니다.
	public Dog(String name, int age) {
		super(name, age);
	}
	
	
	public void dig() {
		System.out.println("강아지가 땅을 팝니다.");
	}
	
	// 오버라이드 sit
	public void sit() {
		System.out.println("강아지가 앉습니다.");
	}

}
