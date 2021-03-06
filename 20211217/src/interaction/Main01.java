package interaction;

public class Main01 {
	public static void main(String[] args) {
		
		Seller s1 = new Seller(5, 10);
		Buyer b1 = new Buyer(10000);
		
		s1.showSeller();
		b1.showBuyer();
		
		// 망고 5개 구매 시도  -> 성공
		b1.buyMango(s1, 5);
		b1.showBuyer();
		
		// 사과 10개 구매 시도 -> 실패
		b1.buyApple(s1, 10);
		
		// 사과 2개 구매 시도  -> 성공
		b1.buyApple(s1, 2);
		b1.showBuyer();
		
		System.out.println("■■■■■■■■■■■ 최종 결과 ■■■■■■■■■■");
		
		// 구매자 판매자 정보
		s1.showSeller();
		b1.showBuyer();
	}

}
