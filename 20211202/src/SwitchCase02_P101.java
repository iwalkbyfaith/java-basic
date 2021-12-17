
public class SwitchCase02_P101 {
	public static void main(String[] args) {
		
		// 범위인것처럼 switch ~ case 문을 쓰고 싶다면
		// 하나의 break에 여러 case문을 연달아 작성합니다.
		// 실제로 범위 지정이 된 것은 아님. break;를 이용한 노가다. 보통 이렇게 안함.
		// 줄줄 흘러내리는 성질을 이용한 것.
		
		int score = 4;
		
		switch(score) {
		case 10:
		case 9:
				System.out.println("수");
				break;
		case 8:
		case 7:
				System.out.println("우");
				break;
		case 6:
		case 5:
				System.out.println("미");
				break;
		case 4:
		case 3:
				System.out.println("양");
				break;
		default :
				System.out.println("가");
				break;
		}
	}
}
