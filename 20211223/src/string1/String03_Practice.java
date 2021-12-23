package string1;

import java.util.Scanner;

public class String03_Practice {
	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력 받으세요. (뭐가 들어올지 모름)
		// 다음으로 문장 내에서 찾고 싶은 단어를 추가로 입력 받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해보세요.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		String searchVoca = scan.nextLine();
		
		int idx = 0;
		
		while(true) {
		int get = sentence.indexOf(searchVoca, idx);
			if(get == -1) {
				System.out.println("더이상 찾을 수 없습니다.");
				return;
			}else {
			System.out.println(sentence + "의 "+ get + "번째에 " + searchVoca + "가 있습니다.");
			idx = get + 1;
			}
		}
		
	}
}

