package abstract1;

// 상속을 하고 child 위에 커서를 올려보면 The type Child must implement the inherited abstract method Parent.getAge() 라고 나옴.
// 다시 커서를 올리고 add unimplemented method 버튼 누르면 자동으로 오버라이드를 해야하는 메서드를 생성한다.
public class Child extends Parent {

	@Override
	public void getAge() {
		System.out.println("부모쪽 나이는 private입니다.");
		
	}
	

}
