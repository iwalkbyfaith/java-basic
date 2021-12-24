package string1;

import java.util.Scanner;

public class String10_P399 {
		public static void main(String[] args) {
			
			
			// 로그인 로직을 만들어보겠습니다.
			// 먼저 String id에 여러분이 설정한 아이디를
			// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
			
			// 다음 사용자에게 Scanner를 이용해
				// uId 변수에는 아이디를(사용자 입력)
				// uPw 변수에는 비밀번호를(사용자입력) 받아서
			
			// 조건문을 이용해서 
			// 1) 기존 id, pw가 입력받은 자료와 모두 일치하면 "x님이 로그인 하셨습니다."
			// 2) id는 일치하나 비밀번호가 틀리면 "비밀번호가 틀렸습니다"
			// 3) id가 일치하지 않으면 "그런 아이디는 없습니다."
			// 라고 출력되도록 코드를 작성해주세요.
			
			Scanner scan = new Scanner(System.in);
			
			String id = "apple";
			String pw = "qwer1234";
			boolean bool = true;
			
			
			while(bool) {
			System.out.println("아이디를 입력해주세요.");
			String uId = scan.nextLine();
			
			if(id.equals(uId)) {  // ()안이 true여야 실행되니까 == true 안써도 됨.
				System.out.println("패스워드를 입력해주세요.");
				String uPw = scan.nextLine();
				
				if(pw.equals(uPw)) {
					System.out.println(uId + "님이 로그인 하셨습니다.");
					bool = false;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {			
			System.out.println("그런 아이디는 없습니다.");
			
			}
			}
			
			// 세 번째 시도.
			// 아이디를 입력 받고 아이디가 일치해야 비밀번호를 입력 받도록 하는 로직을 만든 학생이 있다네. 나도 위에다가 구현해보자
			// 로그인 될 때까지 입력 받으려고 while문도 추가해봤다.
			
			
			// .equals 자체가 true/ false가 나오기 때문에 &&를 사용했을 때 굳이 == true 이렇게 비교 안해도 된다.
			// 근데 써도 돌아감. 나는 쓰는 것 자체가 더 직관적인 것 같은데...
			
			
			
			
			// 처음 짠 코드
			
//			System.out.println("아이디를 입력해주세요.");
//			String uId = scan.nextLine();
//			System.out.println("패스워드를 입력해주세요.");
//			String uPw = scan.nextLine();
//			if(id.equals(uId) && pw.equals(uPw)) {
//				System.out.println(id + "님이 로그인하셨습니다.");
//			}else if(id.equals(uId) && pw.equals(uPw) == false) {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}else if(id.equals(uId) == false) {
//				System.out.println("그런 아이디는 없습니다.");
//			}
			
			
			// 이런 방법으로도 해봤음
			
//			if(id.equals(uId)) {
//				if(pw.equals(uPw)) {
//					System.out.println(id + "님이 로그인하셨습니다.");
//				}else {
//					System.out.println("비밀 번호가 틀렸습니다.");
//				}
//			}else {
//				System.out.println("그런 아이디는 없습니다.");
//				return;
//			}


			
			
			
			
			
			
			
			
		
			
			
			scan.close();
			
			
		}

}
