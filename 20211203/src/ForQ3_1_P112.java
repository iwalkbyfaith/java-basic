import java.util.Scanner;

public class ForQ3_1_P112 {

	// ForQ3P112의 문제를 while문을 사용해서 풀기.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("2~9단 사이의 숫자를 입력해주세요.");
		int dan = scan.nextInt();
		int i = 1;
		
		if(2 <= dan && dan <= 9) {
			while(i < 10) {
				System.out.println(dan + "x" + i + "=" + dan*i);
				i += 1;
			}
		}else {
				System.out.println("구구단의 유효 범위는 2~9단입니다.");
		}
		
		scan.close();

	}

}






