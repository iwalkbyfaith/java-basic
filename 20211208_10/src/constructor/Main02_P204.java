package constructor;   // ● 실행부 ●

public class Main02_P204 {
	public static void main(String[] args) {
		
		// 덩크슛 성공하는 b1
		BasketballPlayer b1 = new BasketballPlayer(198, 111);  // 키, 점프력 순으로 전달.
		b1.dunkShoot();
		
		
		// 덩크슛 실패하는 b2
		BasketballPlayer b2 = new BasketballPlayer(180, 120);
		b2.dunkShoot();
			// ★(중요)★ 메서드의 핵심 : 덩크슛을 시도해볼 수는 있음. 시도해볼 수는 있으나 단지 안될 뿐인 것.(실패든 성공이든 상관 없이)
				// Q. 300보다 작으니까 13번을 실행하면 안되는거 아닌가? 놉!
				// A. 300언더여도 일단 실행은 한다는 것. 실패만 할 뿐이지 시도는 가능하다. (시도 자체에는 제한이 없다)
				// ====> '★★조건에 안 맞아도 일단 실행한다★★'는 것이 중요.

	}
	
	
}
