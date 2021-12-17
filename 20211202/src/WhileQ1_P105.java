import java.util.Scanner;

public class WhileQ1_P105 {
			public static void main(String[] args) {
				// 스캐너를 이용해서 String num 변수에 "문자열 형태인 숫자"를 입력받게 해주세요.(scan.nextline()으로 문자열 받기)
				// 이 문자자료 num을 int loop 변수에 integer.parseInt()로 정수변환해 저장하세요.
				// loop 변수에 입력된 정수 횟수만큼
				// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록 while문을 작성해주세요.
				
				Scanner scan = new Scanner(System.in);
				
				String num = scan.nextLine();
				int loop = Integer.parseInt(num);                    // 선생님 답
				                                                     // int count = 0; (새로운 변수 선언)
				while(loop > 0) {                                    // (count < loop)
					loop -= 1;                                       // count += 1;
					System.out.println("반복문을 실행합니다.");           // ("~ 실행합니다." + count);

				}
				scan.close();
				
			} // 선생님 답과 내 답의 차이 => 선생님 : 기준(5)를 정해놓고 점점 커지게, 나 : 기준(0)을 정해놓고 점점 작아지게.
}			  // count변수에 전위수식/후위수식을 써도 되냐는 학생분도 있었음. 연습할 때 해보자.
			



