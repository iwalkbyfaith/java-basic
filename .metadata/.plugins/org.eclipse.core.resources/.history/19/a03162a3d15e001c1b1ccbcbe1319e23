package interaction;

public class Seller {
	
	private int money;
	private int mango;
	private int apple;
	
	
	public Seller(int mango, int apple) {
		this.money = 0;
		this.mango = mango;
		this.apple = apple;
	}
	
	
	public void sellMango(int mango) {
		this.mango -= mango;
		this.money += mango * 1000;
	}
	
	public void sellApple(int apple) {
		this.apple -= apple;
		this.money += apple * 2000;
	}
	
	public void showSeller() {
		System.out.println("======판매자 정보를 열람합니다.======");
		System.out.println("남은 망고의 양 : " + this.mango);
		System.out.println("남은 사과의 양 : " + this.apple);
		System.out.println("오늘의 매출액  : " + this.money);
		System.out.println("==============================");
		System.out.println("");		
	}
	
	
	public int getMango() {
		return this.mango;
	}

	public int getApple() {
		return this.apple;
	}
}
