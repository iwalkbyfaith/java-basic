package math1;

public class Math05_P480 {
	public static void main(String[] args) {
		
		// 주사위 게임을 만들어주세요.
		// 주사위 게임은 내 값은 myValue 변수에,
		// 컴퓨터 값은 comValue 변수에 값을 난수 발생으로 1 ~ 6 (중요)번으로 부여한 뒤
		// 값이 같다면 무승부,
		// 나, 혹은 컴퓨터 중 승자가 누구인지 알려주는 방식입니다.
		
		int myValue = ((int)(Math.random() * 6) + 1);
		int comValue = ((int)(Math.random() * 6) + 1);
		

		
		if(myValue > comValue) {
			System.out.println("내가 승리했습니다.");
		}else if(myValue == comValue){
			System.out.println("무승부입니다.");	
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
		
		System.out.println("내 값 : " + myValue);
		System.out.println("컴퓨터 값 : " + comValue);
		
		
		
		
	}
}
