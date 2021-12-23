package exception3;

public class Throws01_P361 {
	
	public static void doIt(String[] s, int i) throws ArrayIndexOutOfBoundsException{ // throws ~ 를 안써도 자동으로 자바에서 처리해주긴 함. (적는게 더 좋겠지?)
		// 내부가 인덱스 조회이므로, 언제든 ArrayIndexOutOfBoundsException 발생이 가능함.
		System.out.println(s[i]);
	}
	
	
	public static void main(String[] args) {
		
		// 특정 메서드 영역에서 발생하는 코드는 엄밀히 말하면 try블럭 외부의 예외 발생으로 간주된다.
		// 따라서 개념적으로는 try 블럭 밖에 있지만 실제로는 try 블럭에 속한 것처럼 처리하기 위헤
		// throws를 사용자 정의 메서드 위에 붙여준다.
		String[] greetings = { "안녕", "hi", "니하오", "싸왓디"};                 // 참조형 변수 => 힙에 저장
		int i = (int)(Math.random() * 5);   // 정수 0, 1, 2, 3, 4(에러)        // 기본형 변수 => 스택에 저장
		
		try {
			doIt(greetings, i);
		}catch (Exception e) {
			System.out.println("main 지역에서 처리했습니다"); // 외부지역인 doIt() 지역이 아니라.
		}
		
		// i = 4인 경우에는 예외 발생 상황은 doIt()지역:7번에서 발생. (try 부분에서 일어난게 아.니.라)
		// doIt() 지역은 메모리상으로는 (그림을 그려보면) try~catch 지역과 완전히 다른 영역이다. (= try 부분에서 에러가 나야 catch로 가는데 try에서는 에러가 없다는 말임)
		// 근데 throws가 있다 ( doIt에서 일어난 일을 나를 호출했던 try ~ catch 블록으로 던져 주겠다. = 그럼 try에서 일어난 일이 됨.)
		// (핵심) 지역이 다른 곳에서 에러가 났는데도 마치 try블럭 내에서 오류가 난것처럼 처리 됐다는 것이 중요.
		
	}
}
