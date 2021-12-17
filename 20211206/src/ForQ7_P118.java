
public class ForQ7_P118 {
	public static void main(String[] args) {
		// 피라미드형 별을 찍어보겠습니다.(반대)
		// 아래와 같은 별을 찍을수 있도록 코드를 작성해주세요.
		// *
		// **
		// ***
		// ****
		// 중첩 반복문의 어느곳이 세로, 가로를 담당하는지 생각해보세요.
		// 힌트 : 별 개수가 점점 줄어드는데, 점점 숫자가 작아지는 변수가 뭐가 있을지 생각해보세요.
		// i-- j++인데 반대로 해도 결과가 나오기만 하면 됨.
		
		for(int i = 4; i > 0 ; i--) {
			for(int j = 0; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
