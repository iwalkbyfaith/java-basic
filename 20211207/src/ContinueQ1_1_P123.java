import java.util.Scanner;

public class ContinueQ1_1_P123 {
	public static void main(String[] args) {
		
		// ContinueQ1_P123 혼자 연습 (미완성!!!!!!!!!!!!!)
		
		// 1부터 n까지 총 합을 구하되 홀수끼리만 더한 총합을 구하는 구문을 작성해주세요.
		// continue문은 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력 받습니다.
		// 1. 정수 입력 받기 / 2. 반복문 만들기		
		
		Scanner scan = new Scanner(System.in);
		int goal = scan.nextInt();
		
		int total = 0;
		int count = 1;
		
		while(total < goal) {   // 이 조건식이 왜 선생님이랑 다른지 모르겠음 이것도 생각해보자
								// while(total < goal) => 5는 가능, 7에서는 1~5까지만 더함.
								// 이해 됨. goal은 몇바퀴인지 고정인거고 count는 +1씩 되면서 그 바퀴 돌려주는 것이기 때문에
								// count <= goal 이렇게 되야할듯
			if(count % 2 == 0) {
				count += 1;           // ★★★1-1 이자리 중요
				continue;
			}
			total += count;
			
			// count += 1;  ?? 이자리 아닌가
			System.out.println("현재 1부터" + count + "까지 더했습니다.");
			System.out.println("총합은 " + total + "입니다.");
			
			count += 1;                // ★★★1-2 왜 두번 써주는지 생각해보자
		}
	
		scan.close();
	}
}
