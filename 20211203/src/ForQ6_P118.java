
public class ForQ6_P118 {
	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.
		// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 늘어나는데, 점점 숫자가 커지는 변수가 뭐가 있을지 생각해보세요. => 모르겠는데..?
		
		
		//세로
		for(int i = 1; i <= 4 ; i++) {
			//가로
			for(int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


// i = 0 ; i < 5로하면 왜 정확하게 출력 안되는지 확인
	// =>  j=1/ j<=0 => 성립안함 => 엔터만 처리되고 다음으로 올라감.(콘솔 첫 줄에 공백이 생기는 이유)
