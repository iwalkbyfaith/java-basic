package abstract1;

// 추상 클래스
// abstract 선언이 붙은 클래스는 new를 이용한 직접적 객체 생성은 불가능하고, 상속만 가능합니다.
// 아이콘쪽에 잘 보면 A라는 알파벳이 그림에 붙는 것을 알 수 있음.
public abstract class Parent {

	private int age;
	
	public Parent() {
		this.age = 40;
	}
	
	
	// 추상 메서드, 아래와 같이 실행문 없이 선언부만 작성한다.
	public abstract void getAge();
		// 실행문이 없기 때문에 자식이 상속 받았을 때 오버라이딩이 강요된다.
		// 자식에게 강!제! 상속하는 메서드. (부모님 왈 : getAge()는 반드시 작성해서 써야한다)
	
	
	// 추상 클래스 내부의 일반 메서드는 그냥 평범하게 작성합니다.
	// 일반 메서드는 오버라이딩은 자율적으로 할 수 있습니다.
	public void getInfo() {
		System.out.println("일반 메서드입니다.");
	}
	
	
}
