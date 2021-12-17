import java.util.Scanner;

public class ForQ3_P112 {
	public static void main(String[] args) {
		// 구구단을 작성해보겠습니다.
		// int dan 스캐너를 이용해서 정수를 받아주세요.
		// dan변수에 2 ~ 9 사이의 값이 들어왔는지 확인해서
		// 2 ~ 9라면 구구단 결과값을 보여주고
		// 그렇지 않다면 "구구단의 유효 범위는 2~9단입니다."
		// 라는 안내문구가 나오도록 작성해주세요.
		// if와 &&를 사용
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2~9단 사이의 숫자를 입력해주세요.");
		int dan = scan.nextInt();
		
		if(dan >=2 && dan <= 9) {   
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + "x" + i + "=" + dan*i );
			}		
		}else {
			System.out.println("구구단의 유효 범위는 2~9단입니다.");
		}
		
		scan.close();
	}
}

// ★★
// 17번에 (1 < dan < 10 하면 안되는 이유. <는 2항 연산자이기 떄문에 값이 4개가 필요하다)
// 위와 같이 만들었다면 1 < dan 이 되고 X(값이 없음) < 10 이 된다. 근데... 파이썬에서는 된다.
// 17번에 &&와 ||를 섞어서 써도 된다. 예제 좀 봐야할 듯.
	// if(1 < dan && dan < 10 && dan !=5) => 1보다 커야하고 10보다 작아야하지만 5이면 안된다.


