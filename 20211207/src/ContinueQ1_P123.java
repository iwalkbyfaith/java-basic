import java.util.Scanner;

public class ContinueQ1_P123 {
	public static void main(String[] args) {
		// 1부터 n까지 총 합을 구하되 홀수끼리만 더한 총합을 구하는 구문을 작성해주세요.
		// continue문은 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력 받습니다.
		// 1. 정수 입력 받기 / 2. 반복문 만들기
				
		Scanner scan = new Scanner(System.in);
		int goal = scan.nextInt();
		
		int total = 0;
		int count = 0;    // ★★★왜 0부터 시작하는지 생각해보기 (밑에)
		
		// 2. 반복문 만들기
		while(count < goal) {
			
			count += 1;       // ★★★14번에 count를 0으로 했다면 19번에 이걸 추가해주어야 함.
			// 3. count가 짝수면 스킵
			if(count % 2 == 0) {   // % (나머지 연산자 사용)
			continue;
			}
			// 4. 홀수면 총 합 더하기
			total += count;
			
			// 5. 진행상황 콘솔에 찍기
			System.out.println("현재 1부터" + count + "까지 더했습니다.");
			System.out.println("총합은 " + total + "입니다.");
			
			
		}
		scan.close();
		
		}
}

// Q. 왜 count = 0부터 시작했는지? (이유가 있음)
// 1부터 시작했다면 19번에 ++를 못 적고 그럼 continue문에 실행에 안 걸림
// 암튼 더 생각해보기
