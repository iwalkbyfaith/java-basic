
public class While02_P106 {
	public static void main(String[] args) {
		// while문의 조건식이 어떻게 해석해도 true로 판단되는 조건식을 넣으면 절대 끝나지 않는 무한루프문이 됩니다.
		// 이 경우 강제 탈출문인 break를 써야만 종료할 수 있습니다.
		
		int count = 0;
		while(true) {
			count += 1;
			System.out.println("반복문 실행중입니다." + count);  // 여기까지 치고 실행 -> 신호등은 멈추지 않아 뽀이~! 상태가 됨.
			
			// 이런 방법을 아예 안 쓰지는 않음. 로또복권 당첨 이런 곳에.
			// 끝내는 방법. 콘솔창에 오른족 위에 있는 빨간 네모 버튼 클릭 -> 강제로 종료할 수 있음.
		
		
		}
	}
}	
