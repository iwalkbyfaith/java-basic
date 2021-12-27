package math1;

public class Math06_P480 {
	public static void main(String[] args) {
		
		//  가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3 확률로 가위, 바위, 보를 부여 받으며
		// 가위>보, 바위 >가위, 보 >가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		
		// 가위바위보를 뽑는 부분부터 작성해주세요.
		// 가위 = 0, 바위 = 1, 보 = 2
		
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		
		
		// if(내값 = 0(가위) && 컴퓨터 값 = 2(보)){
		// sysout 내가 이겼습니다.
		//}
						
		
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		
		// 선생님 답. 코드가 짧음.
		
		if((myValue == SCISSORS && comValue == PAPER) ||
			(myValue == ROCK && comValue == SCISSORS) ||
			(myValue == PAPER && comValue == ROCK)) {
			System.out.println("내가 이겼습니다.");
		}else if((myValue == PAPER && comValue == SCISSORS) ||
				(myValue == SCISSORS && comValue == ROCK) ||
				(myValue == ROCK && comValue == PAPER)) {
				System.out.println("내가 이겼습니다.");
		}else if((myValue == comValue)) {
			System.out.println("무승부입니다.");
		}
		
		String[] items = {"가위", "바위", "보"};
		System.out.println("내가 낸 것 : " + items[myValue] );
		System.out.println("컴퓨터가 낸 것 : " + items[comValue] );		
		
		
		
		
		// 두번째 시도 => 상수 쓰라고 해서 일단 바꿔봄.
		
//		final int SCISSORS = 0;
//		final int ROCK = 1;
//		final int PAPER = 2;
		
//		if(myValue == SCISSORS) {
//			if(comValue == SCISSORS) {
//				System.out.println("비겼습니다.");
//			}else if(comValue == ROCK) {
//				System.out.println("내가 졌습니다.");
//			}else {
//				System.out.println("내가 이겼습니다.");
//			}	
//		}else if(myValue == ROCK) {
//			if(comValue == SCISSORS) {
//				System.out.println("내가 이겼습니다.");
//			}else if(comValue == ROCK) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("내가 졌습니다.");
//			}
//		}else if(myValue == PAPER) {
//			if(comValue == SCISSORS) {
//				System.out.println("내가 졌습니다.");
//			}else if(comValue == ROCK) {
//				System.out.println("내가 이겼습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//		}
//		String[] arr1 = {"가위", "바위", "보"};
//		// int[] arr1 = {scissors, rock, paper};
//		
//		System.out.println("내가 낸 것 : " + arr1[myValue] );
//		System.out.println("컴퓨터가 낸 것 : " + arr1[comValue] );
		
		
		
		// 첫번째 시도
		
//		if(myValue == 0) {
//			if(comValue == 0) {
//				System.out.println("비겼습니다.");
//			}else if(comValue == 1) {
//				System.out.println("내가 졌습니다.");
//			}else {
//				System.out.println("내가 이겼습니다.");
//			}	
//		}else if(myValue == 1) {
//			if(comValue == 0) {
//				System.out.println("내가 이겼습니다.");
//			}else if(comValue == 1) {
//				System.out.println("비겼습니다.");
//			}else {
//				System.out.println("내가 졌습니다.");
//			}
//		}else if(myValue == 2) {
//			if(comValue == 0) {
//				System.out.println("내가 졌습니다.");
//			}else if(comValue == 1) {
//				System.out.println("내가 이겼습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//		}

//		String[] arr1 = {"가위", "바위", "보"};
//		
//		System.out.println("내가 낸 것 : " + arr1[myValue] );
//		System.out.println("컴퓨터가 낸 것 : " + arr1[comValue] );

		
		
		
		
		
	}

}
