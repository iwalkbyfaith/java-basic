package static1;

public class Main02 {
	public static void main(String[] args) {
		// static 변수는 생성 없이도 활용할 수 있다. (new 라는 키워드 없이도 쓸 수 있음)
		System.out.println(StaticTest.num2);
			// 만든적이 없는데도 존재한다.
			// 왜? 이미 메모리 영역에 만들어져있기 때문.
		
		// System.out.println(num2);
			// 이렇게 하면 에러뜸.
			// num2는 StaticTest에만 선언된 static 변수이기 때문
		
		// System.out.println(StaticTest.num1); => 에러
			// Cannot make a static reference to the non-static field StaticTest.num1
			// 스테틱이 아닌 것은 참조할 수 없다는 오류가 뜸.
		
		// main이 스택 영역에서 실행되기 전에 static이라는 키워드가 있다면 무조건 static을 생성하는 것이 우선순위임.
		// main이 열리기 전에 이미 메모리에 생성되어 있음.
		
		
		// static 메서드도 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.check();
		
		// 이탤릭체로 기울어진 애들은 static 인가봥
		
		//  s1 생성 후 s1을 이용해 .check()를 호출해보세요.
		StaticTest s1 = new StaticTest();
		s1.check();
			// main:23번처럼 호출하는 것도 가능하지만 main:29처럼 호출하는 것도 가능하다.
			// 100번지의 check()라고 호출되지만 엄밀히 따지자면 check()는 100번지가 아.니.다.
		
		
		
	}
}
