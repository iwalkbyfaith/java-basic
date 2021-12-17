package practice;

public class Seller {
	
	// 변수 선언
	private int money;  // 매출액
	private int mango;  // 망고 재고량
	
	// 생성자
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
		System.out.println("새로운 판매자가 망고 판매를 시작합니다.");
		
	}
	
	// 메서드 sellMango
	public void sellMango(int mango) {
		this.mango -= mango;
		this.money += (mango * 1000);
	}
	
	// 메서드 showSeller
	public void showSeller() {
		System.out.println("======판매자 정보를 열람합니다.======");
		System.out.println("남은 망고의 양 : " + this.mango);
		System.out.println("오늘의 매출액  : " + this.money);
		System.out.println("==============================");
		System.out.println("");
	}
	
	// 메서드 getter getMango. 
	// 구매자 쪽에서 판매자의 남은 망고양을 조회할 때 사용
	public int getMango() {
		return this.mango;
	}

}
