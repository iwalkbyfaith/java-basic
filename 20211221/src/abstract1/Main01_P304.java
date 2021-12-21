package abstract1;

public class Main01_P304 {
	public static void main(String[] args) {
		
		// new 키워드로는 추상클래스를 생성할 수 없습니다.
		// Parent p1 = new Parent();
			// 에러 => Cannot instantiate the type Parent
				// 1) 추상 클래스이기 때문
				// 2) 불완전한 메서드 getAge()가 존재.
		
		
		// 단 parent를 상속 받아 getAge() 메서드를 구체화시킨 Child 타입으로는 객체 생성 및 사용이 가능하다.
		Parent c = new Child();
		c.getAge();
		
		// 따로 오버라이딩 하지 않아도 일반 메서드는 상속 받았다면 사용 가능
		c.getInfo();
		
		
	}

}
