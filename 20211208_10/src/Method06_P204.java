
public class Method06_P204 {
	// mul 메서드를 선언해주세요.
	// 이 메서드는 여러분들이 임의로 이름 붙인 정수 변수 3개를 입력 받아
	// 3개를 곱한 값을 return해줍니다.
	public static int mul(int a, int b, int c) {
		return a * b * c ;
	}
	
	// info 메서드를 선언해주세요. 
	// 이 메서드는 내부에서
	// "안녕하세요"
	// "자바 메서드 학습중입니다."
	// "1번의 호출로 3줄을 콘솔에 작성합니다."
	// 라는 문장만 출력하고 return은 없습니다.  (= void)
	public static void info() {
			System.out.println("안녕하세요");
			System.out.println("자바 메서드 학습중입니다.");
			System.out.println("1번의 호출로 3줄을 콘솔에 작성합니다.");
		}
		
	public static void main(String[] args) {
	// mul을 호출해 결과값을 int result에 저장한다음 콘솔에 출력하기
			
		int result = mul(10, 20, 30);
		System.out.println(result);

	// info 메서드 반복문으로 3번 호출하기
		for(int i = 0; i <3; i++){
		info();
		}
	}
}


// 지역 3개

// 22번(시작) -> 스택에 main 지역 생성 -> 25번 -> 6번 -> 스택에 mul 지역 생성 -> 10, 20, 30이 a, b, c에 들어간다.
// -> (6번에 int라고 적혀있다는 것은 정수형 자료를 갖다주어야 한다는 뜻) -> 7번 ( 6000 포장 ) -> 호출한 20번의 우변에 들어감
// -> int result = 6000; -> main 안의 result 변수 안에 6000이 들어가는 것임 -> 8번 -> mul 지역 삭제 -> 25번 -> 26번
// -> 29번 -> 스택 의 main지역 안에 for지역이 만들어짐. for 지역 내부에는 i=0이라고 선언됨 -> for 안에서 info 호출
// -> 스택 안 info 지역이 생성됨. 내부적으로 저장하는 자료는 없음 -> 16~20번 -> info지역 삭제 -> 호출한 30번으로 -> 31번
// -> 29번 -> i+1=1 -> 30번 -> info호출 -> info지역 생성 -> 16~20번 -> info지역 삭제 되면서 30번으로 -> 31번
// -> 29번 -> i+1=2 -> 30번 -> info호출 -> info지역 생성 -> 16~20번 -> info지역 삭제 되면서 30번으로 -> 31번
// -> 29번 -> i+1=3 -> 3<3 거짓 -> for지역 삭제(변수 i도 같이 사라짐) -> 32번-> main 지역 삭제 -> 종료