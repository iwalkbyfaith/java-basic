package interaction;



public class Seller {
	// 변수로 int mone(매출), int mango(재고)를 가집니다.
	private int money;   // 매출
	private int mango;   // 재고
	
	
	// 생성자에서 money는 초기값이 0이고, mango는 입력 받도록 해주세요.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
	}
	
	
	// 망고 개수를 입력 받으면(doBattle)과 유사.
	// 자신의 this.mango는 갯수만큼 차감하고, this.money는 망고개수*가격만큼 증가한다.
	
	public void sellMango(int mango) {
		// 망고가 모자라면, "망고가 모자랍니다"라고 하고 메서드를 종료.
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : " + this.mango);
			return;
		}
		this.mango = (this.mango - mango);
		this.money = (mango * 1000);
		
	}
	
	
	// showSeller()를 이용해 현재 소지금, 망고개수를 볼 수 있습니다.
	public void showSeller() {
		System.out.println("-------- 상인 정보 ----------");
		System.out.println("현재 소지금 : " + this.money);
		System.out.println("망고 개수 : " + this.mango);
		System.out.println("--------------------------");
	}


	// buyer에서 망고개수를 확인할 수 있도록 getMango() getter를 하나만 만들기
	public int getMango() {
		return this.mango;
	}
	
	
}
