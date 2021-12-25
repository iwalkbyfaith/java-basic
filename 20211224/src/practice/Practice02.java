package practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		
		// .equals로 로그인 로직 만들기.
		// 사용자가 스캐너로 아이디와 비밀번호를 입력했을때, 미리 입력해둔 아이디와 비밀번호와 같은지 비교
		// 1. 아이디가 다르다면 -> 그런 아이디는 없습니다.
		// 2. 아이디는 맞는데 비밀번호가 다르다면 -> 비밀번호가 틀렸습니다.
		// 3. 아이디도 맞고 비밀번호도 맞다면 -> 로그인에 성공했습니다. 출력
		
		
		String id = "mimilove";
		String pw = "1234";
		boolean bool = true;
		
		
		Scanner scan = new Scanner(System.in);
		
		while(bool) {
		System.out.println("아이디를 입력하세요.");
		String uId = scan.nextLine();
		
		if (id.equals(uId) == true) {
			System.out.println("비밀번호를 입력하세요.");
			String uPw = scan.nextLine();
			
			if(pw.equals(uPw) == true) {
				System.out.println(uId + "님께서 로그인하셨습니다.");
				bool = false;
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}	
		}else {
			System.out.println("그런 아이디는 없습니다.");
		}
		}
		
		
		scan.close();
		
		
		
		
	}

}
