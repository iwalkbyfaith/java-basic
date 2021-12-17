import java.util.Scanner;

public class ForQ2_P112 {
	public static void main(String[] args) {
		
		// Scanner로 int count 변수에 정수를 입력 받아주세요.
		// 입력된 count 횟수만큼 "Hello Java"를 출력하는 반복문을 아래쪽에 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for(int i = 0; i < count ; i++) {
			System.out.println("Hello Jave");
		}
		
		scan.close();
		 
	}
}











