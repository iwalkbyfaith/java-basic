package game.inheritance;

public class Archer extends Commoner {
	
	private int rDam; // 원거리 데미지
	
	
	public Archer(String id) {
		super(id);
		this.rDam = 6;
	}

	public void getInfo() {
		System.out.println("레벨 : " + lv + 
						   ", 체력 : " + hp + 
						   ", 마나 : " + mp +
						   ", 원거리 데미지 : " + rDam);
	}
	
}
