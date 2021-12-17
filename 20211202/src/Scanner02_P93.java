import java.util.Scanner;

public class Scanner02_P93 {
	public static void main(String[] args) {
		// Scanner 생성을 직접 해 보세요.  // 웹개발에서는 잘 안쓴다고 . . .
		Scanner scan = new Scanner(System.in);
		

		// 문자열을 입력받는 경우
		// String name = scan.nextLine();
		
		System.out.println("이름을 입력해주세요 : ");   // 이거 안써도 무방. 부연설명
		String name = scan.nextLine();
		
		// 실수를 입력받는 경우
		// double height = scan.nextDouble();
		System.out.println("키를 입력해주세요 : ");    // 이거 안써도 무방. 부연설명
		double height = scan.nextDouble();
		
		
		// System.out.println(name);
		// System.out.println(height);
	
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		
		scan.close();
	
	}
}
