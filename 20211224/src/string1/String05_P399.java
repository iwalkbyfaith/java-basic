package string1;

import java.util.Scanner;

public class String05_P399 {
	public static void main(String[] args) {
		// .length()와 charAt()을 활용해 입력된 전체 문자열을 한 글자씩 한 줄 씩 처리하는 로직을 작성해보세요.
		// 문자열은 Scanner로 입력 받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 입력해주세요.");
		String sentence = scan.nextLine();

		
		for(int i = 0; i < sentence.length(); i++) {
		char get = sentence.charAt(i);
		System.out.println(get);
		
		// 이렇게 해도 됨. get을 아예 안 만들고
		// System.out.println(sentence.charAt(i));
		}
		
		scan.close();
	}
}
