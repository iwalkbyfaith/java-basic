
public class Method05_P204 {
	// int c, int num을 받아서
	// System.out.println(c + num); 만 실행하고 종료되는  => return구문이 아니니까 void
	// plus2메서드를 정의해주신 다음
	// main 내부에서 c에는 10, num에는 20을 전달해 실행하도록 코드를 작성해보세요.
	
	public static void plus2 (int c, int num) {
		System.out.println(c + num);
	}

	public static void main(String[] args) {
		plus2(10, 20);
		// 중괄호 여닫는 부분을 "지역"이라고 합니다.
		// 중괄호가 닫히면 해당 "지역"과 "지역 내 자료"들은 함께 소멸이 됩니다.
		 // System.out.println(c);
		 // System.out.println(num);   <= 두 코드가 실행이 안됨. 왜?
		//								 c와 num은 plus2지역 소속인데 main 지역에서 끌어다 쓸 수 없음.
		//								 ★ 특정한 변수를 호출하려면 같은 지역이어야 호출이 가능하다.
	}
}

// 12번 -> 스택에 main지역 생성 -> 13번 -> 플러스 호출 10과 20을 가지고 감-> 8번 
// -> 스택에 plus2 지역 생김, c와 num이 있는 깡통 변수가 생김 -> 13에서 가져온 10, 20을 각각 넣어줌 -> 10 + 20
// -> 콘솔에 30 출력 -> 10번 -> plus2 지역 삭제 -> 13번 -> 14번 -> main 지역 삭제 -> 종료
