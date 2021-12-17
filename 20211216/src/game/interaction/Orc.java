package game.interaction;

// 클래스 오크
public class Orc {
	private int hp;
	private int atk;
	private int def;
	
	public Orc() {
		this.hp = 20;
		this.atk = 3;
		this.def = 0;
	}
	
	
	// 워리어에서 hunt()가 생겼으니까, Orc도 워리어와 교전하는 메서드 만들어야함.
	// doBattle은 유저의 공격력을 받아 오크의 체감을 차감한다.
	// 오크의 체력을 유저 공격력만큼 차감시켜주세요.
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
			if(hp <= 0) {
			hp = 0;
			System.out.println("오크가 죽어서 반응하지 않습니다.");
			return; // 값을 갖다주는게 아니라 강제 종료.
			}
			
		System.out.println("오크의 남은 체력 : " + hp); // 죽으면 체력 안 알려줌
	}
	
	
	
	
	// getter와 setter 생성
	
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
