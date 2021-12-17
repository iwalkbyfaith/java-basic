
public class Method04_P204 {

	public static void info() {
		// 메모리 구조 신경 안써도 됨.
		// 만약 내부 실행구문이 추가 입력을 받지 않아도 완성된 구문이라면 굳이 값을 받지 않아도 됩니다.
		System.out.println("123");
		System.out.println("456");
		System.out.println("124");
		System.out.println("784");
	}
	public static void main(String[] args) {
		info();
		info();
		info();
		info();
	}
}


// 실행하면 4번 호출한다. (info를 4번 호출했기 때문)
// 7~10번처럼 애초에 어떤걸 출력하는지 명확한 상태라면 굳이 값을 전달할 필요가 없다.
// info는 전달 받거나/하는 행위를 하지 않는다.
// 이렇게 했을때 장점
//		info를 사용해서 7~10을 4번 실행하니까 편함.

// 12번(시작) -> 스택 안에 main 지역 생성 -> 13 -> info 호출 -> 4번 -> 스택 안에 info지역 생성은 됐지만 입력 할것도 받을 필요도 없음
// -> 7~10 실행 -> 11번 -> info 삭제 -> 14번 -> 4번 info 호출 -> info 지역 또 생성 -> 7~10 실행 -> 11번 -> info 삭제
// -> 15번 -> 4번 info 열림 -> 7~10 실행 -> 11번 -> info 삭제 -> 16번 -> 4번 info 생성 -> 7~10 실행 -> 11번 -> info 삭제
// -> 17번 -> main 삭제