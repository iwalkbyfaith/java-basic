
public class SwitchCase_P99 {
	public static void main(String[] args) {
		// switch ~ case 구문은 변수에 들어있는 자료가 case문에 제시된
		// 자료와 일치하는지 여부로 논리식을 실행한다.
		// switch(변수) {
		// case 값1:
		//      실행문;
		// case 값2...
		// }
		// 와 같이 작성합니다.
		// 마지막에 default문을 작성시 if~else문의 else처럼 기능한다.
		// if ~ else문과 달리 범위로 지정된 것을 작성하는게 어려운 점이 있다.
		
		int a = 3;
		switch(a) {
		case 1:  // case 옆에 있는 숫자는 경우1이 아니라 => 'a안에 1이 있는지 확인'이라는 뜻.
			System.out.println("one");
			break; // 각 케이스 종료시마다 break를 작성해야 줄줄이 실행되지 않음.
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		default :
			System.out.println("1~5가 아니네요.");
			break;    // default 부분에는 break;가 필요 없지만 가독성을 위해 작성하기도 함.
			
		
		// 'break;' 없이 실행했을 때 three/four/five/1~5가 아니네요가 나옴. => break; 를 추가해야함.
		}
	}
}
