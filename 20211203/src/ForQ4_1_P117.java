
public class ForQ4_1_P117 {
		public static void main(String[] args) {
			
	// ForQ3_P112를 while문으로 만들기.
		//  구구단 2 ~ 9 단까지 모두를 출력하는 코드를 작성해주세요.
		// 구구단은 2 ~ 9단까지 출력하면 됩니다.
		// 중첩 반복문을 사용해서 작성해주세요.
		// 바깥쪽 반복문(int i) 2 ~ 9까지 반복하게 해주시고
		// 안 쪽 반복문(int j) 1 ~ 9까지 반복하게 해서
		// i * j 를 출력하게 하면 됩니다.

		int i = 2;
		// int j = 1; 
	
	while(2 <= i && i <= 9) {
			int j = 1;         // (★최종 해결★) 이 자리에 변수 j를 선언해줘야 하는데 14번에 했으니 j가 계속 초기화가 안된 것.
			while(j>=1 && j <=9) {
				System.out.println(i + "x" + j + "=" + i*j);
				j += 1;
			}
			i += 1;
			// j = 2;   // => (처음 시도)이거 안 써서 틀린거였음. 근데 다른 예제에서는 안 썼는데 알아서 나옴. 노노노 아님. 17번으로 고고
			System.out.println("=======================");
		}
	}
}