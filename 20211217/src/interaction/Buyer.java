package interaction;

public class Buyer {
	
	private int money;
	private int mango;
	private int apple;
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.apple = 0;
		System.out.println("과일 구매를 원하는 구매자가 나타났습니다.");
	}

	public void buyMango(Seller seller, int mango) {
		if(seller.getMango() < mango) {
			System.out.println("망고가 부족해서 살 수 없습니다. 현재 남은 망고의 양 : " + seller.getMango());
		}else if(this.money < (mango * 1000)){
			System.out.println("가진 돈이 부족합니다. 현재 소지한 금액 : " + this.money);
		}else {
		seller.sellMango(mango);
		this.mango += mango;
		this.money -= mango * 1000;
		System.out.println("망고 구매 완료 !");
		}
	}
	
	
	public void buyApple(Seller seller, int apple) {
		if(seller.getApple() < apple) {
			System.out.println("사과가 부족해서 살 수 없습니다. 현재 남은 사과의 양 : " + seller.getApple());
		}else if(this.money < (apple * 2000)){
			System.out.println("가진 돈이 부족합니다. 현재 소지한 금액 : " + this.money);
		}else {
		seller.sellApple(apple);
		this.apple += apple;
		this.money -= apple * 2000;
		System.out.println("사과 구매 완료 !");
		}
	}
	
	public void showBuyer() {
		System.out.println("======구매자 정보를 열람합니다.======");		
		System.out.println("구매한 사과 : " + this.apple);
		System.out.println("구매한 망고 : " + this.mango);
		System.out.println("소지한 금액 : " + this.money);
		System.out.println("==============================");
		System.out.println("");		
	}
}
