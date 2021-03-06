package constructor;   // ● 정의부 ●

// 농구 선수를 자바 내에서 구현합니다.
public class BasketballPlayer {
	
	// 멤버 변수(상태, 정보)
	public int height;      // 키
	public int jumpHeight;  // 점프력
							// ★ 변수: 첫단어 첫글자는 소문자, 이후 단어 첫글자는 대문자 나머지는 소문자로 작성 
							//        (=> camel case 표기법)
	
	
	//생성자 생성 <= 1. void 이런거 안적음 2. 클래스 명과 똑.같.이 적어야함
	public BasketballPlayer(int h, int j) {
		height = h;
		jumpHeight = j;
		
		System.out.println("생성된 선수 키 : " + height + 
						   ", 점프력 : " + jumpHeight);
	}
	
	// 멤버 메서드
	// 메서드 덩크슛 ( '덩크슛 하기'라는 행동을 작성)
		// 키 + 점프력이 300을 넘는다면 덩크에 성공했다는 메세지를 보내주기 위해 조건문 작성
	public void dunkShoot() {
		if((height + jumpHeight) > 300) {            // 이런 연산을 할 때는 소괄호를 사용해서 연산 먼저 계산하도록 해준다.
			System.out.println("덩크슛에 성공했습니다");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
}
