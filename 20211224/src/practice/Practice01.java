package practice;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		
		// 스캐너로 받은 문장을 .charAt() 과 .length로 세로 출력
		
		// .charAt()은 한 단어씩 받아오는 애고
		// .length는 길이 재는 애
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문장을 입력해주세요.");
		String a = scan.nextLine();
				
		
		for(int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		scan.close();

		
		
		
		
		
		
		
		
	}

}
