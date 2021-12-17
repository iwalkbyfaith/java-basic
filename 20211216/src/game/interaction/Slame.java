package game.interaction;

public class Slame {
	
	private int hp;
	private int atk;
	private int def;
	
	
	public Slame() {
		this.hp = 30;
		this.atk = 4;
		this.def = 2;
	}
	
	
	public void doBattle(int uAtk) {
		this.hp = (this.hp + this.def) - uAtk;
		if(hp <= 0) {
			hp = 0;
			System.out.println("슬라임이 죽어서 반응하지 않습니다.");
			return; 
			}
		System.out.println("슬라임의 남은 체력 : " + this.hp);
	}


	// getter와 setter 만듦.
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}
	
	
	
}
