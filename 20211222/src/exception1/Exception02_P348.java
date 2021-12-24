package exception1;

public class Exception02_P348 {
	public static void main(String[] args) {
		
		// 예외 발생 케이스 2
			// 실행 예외 : 실행하기 전까지는 예외를 인지할 수 없는 예외
			// 대표적인 예시로는 특정한 숫자를 0으로 나누는 것입니다.
		int a = 1;
		int b = 0;
		System.out.println(a/b);
			// 문법적으로는 정수를 정수로 나누니까 문제가 없음. 컴파일 에러도 안 뜸.
			// 하지만 실제로 실행을 해 보면 콘솔창에 에러가 나옴. => / by zero (디비젼 바이 제로)
		
	}
}

