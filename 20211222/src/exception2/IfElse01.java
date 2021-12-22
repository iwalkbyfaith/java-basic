package exception2;

import java.util.Scanner;

public class IfElse01 {
	public static void main(String[] args) {
		// int a, b에 스캐너로 각각 정수를 입력 받아주세요.
		// a / b의 결과를 콘솔에 띄워주시되
		// a / b를 실행하기 전에 b가 0인지 검사해서
			// b = 0인 경우는 "0으로 숫자를 나눌 수 없습니다."라는 경고만 띄우도록 만들어주세요.
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
		}else {		
			System.out.println(a / b);
		}
		
		scan.close();
		
		// ==> 문제) 예외처리를 위해서 사용한 구문인지, 일반적인 조건문인지 구분이 안되고 가독성이 안 좋다.
		// ==> 해결) try ~ catch 구문
	}
}
