import java.util.Scanner;

public class Scanner01_P93 {
	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받게하고 싶은 경우 스캐너 진행을 사용합니다.
		// 아래 Scanner 라고 적은 부분에 마우스를 갖다대고 import를 해주세요

		Scanner scan = new Scanner(System.in);
		
		// 정수 한 글자를 받음
		int a = scan.nextInt();
		
		// 입력 받은 정수 출력
		System.out.println(a);
		
		scan.close();
		
		// 코드를 실행하고 콘솔에 커서를 갖다대면 깜빡깜빡거림
		// 그때 숫자를 딱! 쓰면 카피가 딱!
		
		// 코드 어떻게 쓰는지는 외워라
	}

}
