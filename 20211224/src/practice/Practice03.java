package practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		
		// 스캐너로 받은 문장을 trim(), replace()로 공백 제거하기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("공백이 섞인 문장을 입력하세요.");
		String str = scan.nextLine();
		
		
		System.out.println(str.trim().replace("  ", ""));
		
		scan.close();
		
		
	}
}
