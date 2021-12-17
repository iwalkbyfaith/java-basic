import java.util.Scanner;

public class WhileQ3 {
	public static void main(String[] args) {
		// ForQ5_P118을 while문을 사용하는 로직으로 고쳐보세요.
		// i, j변수, 조건식, 증감식 부분을 신경써서 옮겨주세요.
		
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3 입력시
		// *** (1,2,3바퀴)
		// *** (1,2,3바퀴)
		// *** (1,2,3바퀴)
		// 가로줄 출력시 Sysout("*");
		// 다음줄로 내릴때만 System.out.println(); 을 씁니다.
		// 헷갈리시면 ForQ4P117과 WhileQ2를 참조해보세요.
		
		System.out.println("숫자를 입력해주세요.");
		
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		int i = 0;
		
	
		while(i < count) {
			int j = 0;         // <- ★★ 위치 기억 ★★ 
			while(j < count) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i ++;
			// j = 0; <- 여기 안 써도 됨. 
				// 내가 안됐던 이유는 j를 다시 초기화 시켜주려면 29번자리에 넣어야하는데 26에 넣어서 반영이 안됐던거임.
			
			scan.close();
		}
	}
}
