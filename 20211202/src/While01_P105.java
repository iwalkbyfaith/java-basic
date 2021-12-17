
public class While01_P105 {
	public static void main(String[] args) {
		// while문은 타겟이 되는 실행문을 반복해서 실행하는 구문입니다.
		// while문은 실행여부를 조건식 비교를 통해 결정합니다.
		// 한 번 실행하기로 결정되면 모든 타겟 실행문을 실행합니다.
		// 실행이 끝나면 다시 while 구문으로 복귀합니다.
		// 추가 비교를 통해 실행/탈출 여부가 결정됩니다.
		// java tutor를 이용해서도 확인해보세요.
		
		int a = 0;
		while(a < 2) {   // a=0이고 a는 n보다 작은 경우 => n바퀴 돈다.
			a += 1;
			System.out.println(a+ "번째 반복문 실행중입니다.");  	
		} // 15번 }가 끝나면 다시 12번으로 돌아감. a가 2가 되어 12번으로 갈 때까지 반복(거짓이라는 것이 확인되면 반복문 빠져나옴. 16번진행)
	}
}
