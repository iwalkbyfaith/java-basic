package practice;

public class Buyer {
	
	// 변수 선언
	private int money;  // 소지금
	private int mango;  // 소지한 망고
	
	
	// 생성자
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		System.out.println("새로운 구매자가 등장했습니다.");
	}
	
	// buyMango 망고 사기
	public void buyMango(Seller seller, int mango) {
		if(seller.getMango() < mango) {
			System.out.println("망고가 부족해서 살 수 없습니다. 현재 남은 망고의 양 : " + seller.getMango());
		}else if(this.money < (mango * 1000)){
			System.out.println("가진 돈이 부족합니다. 현재 소지한 금액 : " + this.money);
		}else {
		seller.sellMango(mango);
		this.mango += mango;
		this.money -= (mango * 1000);
		}
	}
	
	// showBuyer 구매자의 정보 보기
	public void showBuyer() {
		System.out.println("======구매자 정보를 열람합니다.======");
		System.out.println("구매한 개수 : " + this.mango);
		System.out.println("소지한 금액 : " + this.money);
		System.out.println("==============================");
		System.out.println("");
	}
}
