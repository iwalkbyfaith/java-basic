package exception2;

import java.util.Scanner;

public class TryCatch_P353 {
	public static void main(String[] args) {
		
		// try~catch 구문은 
		// 크게 예외가 발생할 가능성이 있는 구문을 적어주는 try블럭과
		// 예외가 실제로 발생했을때 대처할 코드를 실행하는 catch 블럭으로 나뉩니다.
		
		// 스캐너로 int a, b에 정수를 입력 받는 부분까지만 작성하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1번 정수를 입력해주세요");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요");
		int b = scan.nextInt();
		
		
		try {
			// 예외가 발생할 가능성이 있는 구문을 전부 때려넣습니다.
			System.out.println("실행 시작");               // 얘는 실행 됨.
			System.out.println(a / b);				    // 여기서 에러가 나서
			System.out.println("계산 끝!"); 			    // 얘는 실행도 못되고 스킵됨 ㅠ
			// try 구문에서 에러가 발생하면 밑에 있는 코드들(main:25)은 보지도 않고 바로 main:27 catch로 이동
		}catch (Exception e) {
			// catch 블록에는 (Exception e)가 기본으로 들어간다.
			// Exception e로 적는 경우 예외 종류를 막론하고 전부 처리 가능하다.
			// 추후에 특정한 종류의 예외를 따로 처리하고 싶은 경우는 다른 예외명을 적으면 된다.
			System.out.println("나누는 숫자는 0이 될 수 없습니다.");
		}finally {
			// 모든 실행 구문이 다 끝나고 나서 실행할 코드는 finally 블럭 내부에 작성합니다. (finally를 안 적어도 됨)
			// try에서 예외가 발생하지 않아도 finally는 실행된다. (걍 어떤 경우든 무조건 실행)
			System.out.println("코드 끝!");
		}
		
		
		scan.close();
		
	}
}
