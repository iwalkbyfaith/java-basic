package polymorphism;

public class Main01_P302 {
	public static void main(String[] args) {
		
		// 부모타입인 Person으로 자식타입인 Student까지 받을 수 있음. 
		//  => 확장성을 고려한 설계
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 20, 100);
		
		
		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson();  // Person측 showPerson() 호출
		s1.showPerson();  // Student측 showPerson() 호출  (근데! 컨트롤 클릭했을때는 Person쪽으로 나옴)
						  // => 명속상으로는 Person측 호출했다고 뜨지만 실제로 콘솔에는 오버라이드 된 것이 뜸(오버라이드 된 것이 우선순위임.)
		// Person쪽은 student의 자원을 건들 수 없음(Person에만 영향력을 미칠 수 있다)
			// 단, 자식쪽에 오버라이드 된 메서드는 건들 수 있음. (지금 경우는 오버라이드된 showPerson)
			// 스튜던트 쪽에서 새로 생성된 것은 요청이 되지 않는다. (==> 가상 메서드/가상 상속이라고 부름)(이해안되면 패스 괜츈)
		
		
		// 신분 밝히기용 showStudent()를 호출 시도해보자.
		//s1.showStudent();
			// 실행 결과 => 에러. The method showStudent() is undefined for the type Person
			// ★★★★★ s1은 Person 타입이므로 Person에 소속된 자원'만' 호출할 수 있다. (오버라이드된 것만 예!외!사!항!) ★★★★★
			// 다형성 만들때 중요한 것. 자식쪽에 최대한 오리지널 메서드를 만들지 않고, 부모쪽에 있는 것을 오버라이드하는 형태로 가야함.
		
		
		
	}
}
