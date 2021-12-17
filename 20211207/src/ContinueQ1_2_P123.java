import java.util.Scanner;

public class ContinueQ1_2_P123 {
	
	// ContinueQ1_P123를 for로 만든 학생의 질문.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int total = 0;
		
		for(int a = 1; a < n; a++) {  // a를 0부터 시작하면 헛바퀴 도는거임(큰 차이는 없음)
			if(a % 2 == 0) {
				continue;
			}
			total += a;
		}
		System.out.println("총합 : " + total);
		
		scan.close();
	}
}

// 이렇게 돌리면 5를 입력했을때 4까지만 돔. => 13번에 a < n 라고 했으니 그렇쥐 => a <= n 이렇게 해야지
// 아까 그분은 13번을 for(int a = 0; a < n; a++) 이렇게 했던 것 같다.
// 그래서 5바퀴 돌거라고 생각했던 것 같은데 a = 0, 1, 2, 3, 4 이렇게 되니까 5는 포함 안되고 끝나게 된다.