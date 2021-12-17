import java.util.Scanner;

public class Elseif01_P97 {
	public static void main(String[] args) {
		// else if는 추가적인 조건을 달 때 사용합니다.
		// if문 다음에 작성하며, else문 이전에 작성합니다.
		// else if는 else와 달리 조건식을 기입해야 합니다.
		// else if문은 몇 개라도 작성할 수 있습니다. (개수 제한이 없다)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요");
		
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수입니다.");
		} else if(num == 0) {   // 조건1은 아니지만 조건2이다. = '0보다 크지는 않지만 0과 같다'라고 해석해야 함.
			System.out.println("0입니다.");
		} else {                // 조건1도 조건2도 아니다.
			System.out.println("음수입니다.");
		}
		
		scan.close();
		
	}
}
