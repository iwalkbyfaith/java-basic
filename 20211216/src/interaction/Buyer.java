package interaction;

public class Buyer {
	// 구매자와 판매자는 교환하기 때문에 같은 자원을 써야함.
	private int money;  // 소지금
	private int mango;  // 소지 망고 개수

	
	// 생성자에 돈을 받아서 소지 금액을 초기화해준다.
	public Buyer(int money) {  // 소지금액
		this.money = money;
		this.mango = 0;
	}
	
	// 메서드에서 1)어떤 상인에게 2) 몇 개를 살지를 입력.
	// 망고 개수를 입력 받으면 소지금을 망고개수*가격만큼 차감해주고 망고 개수는 올라갑니다.
	// 이때 seller 쪽에서도 sellMango가 호출되도록 처리하며
	// 1. 구매하려는 망고 총액이 내 소지금을 넘어서면 "돈이 모자랍니다"라고만 알리고 메서드를 중지시킵니다.
	// 2. 판매자의 망고가 내가 구매하려는 망고보다 적은 경우도 역시 "망고 재고가 부족합니다." 라고만 알리고 메서드를 중지 시킵니다.
	// 이 모든 경우의 수를 통과한 경우만 망고 구매가 가능합니다.
	// 누구한테 팔지가 아니라, 어떤 상인에게 살지 넣는 이유 -> 실제로도 바이어가 셀러를 고르지, 셀러가 바이어를 고르지 않음
	public void buyMango(Seller seller, int mango) {
		if((mango * 1000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return;
			
		}else if(seller.getMango() < mango) {
			System.out.println("구매하려는 망고 개수 : " + mango);
			System.out.println("망고 재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
			
		}else {
		// 내 금액은 차감되고 망고가 늘어남.
		this.money -= (mango * 1000);
		this.mango += mango;
		System.out.println("망고를 " + mango + "개 구매했습니다.");
		// ★★★★★★★★ 동시에 일어나는 행위니까 ★★★★★★★★★★★★★
		// 셀러의 망고를 차감하고 돈을 올려주는 로직. (연결해주어야 한다.)
		seller.sellMango(mango);
		}
	}

	//  showBuyer()를 이용해 소지망고, 소지금을 볼 수 있습니다.
	
	public void showBuyer() {
		System.out.println("---------구매자 정보---------");
		System.out.println("소지 망고 : " + this.mango);
		System.out.println("소지 금액 : " + this.money);
		System.out.println("--------------------------");
		System.out.println("");
	}
		
	}

