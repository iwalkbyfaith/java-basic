import java.util.Scanner;

public class ForQ5_P118 {
	public static void main(String[] args) {
		// Scanner로 정수를 입력받게 해주세요.
		// 입력받은 정수의 제곱 형태의 직사각형이 찍히도록
		// 중첩 반복문을 작성해주세요.
		// ex) 3 입력시
		// *** (1,2,3바퀴)
		// *** (1,2,3바퀴)
		// *** (1,2,3바퀴)
		// 가로줄 출력시 Sysout("*");
		// 다음줄로 내릴때만 System.out.println(); 을 씁니다.

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		// i for문 내부에서 println을 실행하므로 세로 길이를 담당
		for(int i = 0; i < count ; i++) {
			// 가로 길이를 담당 print를 이용해 별을 일렬로 나열시키므로 가로길이를 담당.
			for(int j = 0; j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		scan.close();
	

		
	}
}
