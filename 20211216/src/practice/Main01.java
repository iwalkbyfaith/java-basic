package practice;

public class Main01 {
	public static void main(String[] args) {
		
		// 판매자 1
		Seller s1 = new Seller(10);
		// 판매자 2
		Seller s2 = new Seller(5);
		// 구매자 1
		Buyer b1 = new Buyer(10000);
		
		// 정보 확인
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
		
		// 판매자 2에게 망고 5개 구매
		b1.buyMango(s2, 5);
		b1.showBuyer();
		
		// 판매자 2에게 망고 1개 구매
		b1.buyMango(s2, 1);
		b1.showBuyer();
		
		// 판매자 1에게 망고 10개 구매
		b1.buyMango(s1, 10);
		b1.showBuyer();
		
		// 최종 정보
		System.out.println("★★★★★★★★★★ 최종 정보 ★★★★★★★★★★");
		s1.showSeller();
		s2.showSeller();
		b1.showBuyer();
	}

}
