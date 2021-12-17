package game.inheritance;    // ● 정의부 ● (Commoner의 상속)

public class Magician extends Commoner{
	
	private int mDam; // 마법 데미지
	
	
	public Magician(String id) {
		super(id);
		this.mDam = 7;
	}
	
	public void getInfo() {
		System.out.println("레벨 : " + lv +
						   ", 체력 : " + hp + 
						   ", 마나 : " + mp +
						   ", 마법 데미지 : " + mDam);
	}

}
