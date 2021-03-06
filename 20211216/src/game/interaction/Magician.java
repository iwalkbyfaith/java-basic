package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	
	public Magician() {
		this.hp = 10;
		this.mp = 30;
		this.atk = 7;
		this.def = 0;
		this.exp = 0;
	}
	
	
	public void huntOrc(Orc orc) {
		// 오크 때리기
		orc.doBattle(this.atk);
		if(orc.getHp() <= 0) {
			System.out.println("전투가 종료되었습니다.");
		}else {
		// 얻어 맞기
		this.hp = (this.hp + this.def) - orc.getAtk();
		if(hp <= 0) {
			hp = 0;
			System.out.println("전투 실패 ! 마법사가 죽었습니다.");
		}
		}
		System.out.println("교전 결과 마법사의 체력 : " + this.hp);
		System.out.println("========================");
	}
	
	
	public void huntTroll(Troll troll) {
		// 트롤 때리기
		troll.doBattle(this.atk);
		if(troll.getHp() <= 0) {
			System.out.println("전투가 종료되었습니다.");
		}else {
		// 얻어 맞기
		this.hp = (this.hp + this.def) - troll.getAtk();
		if(hp <= 0) {
			hp = 0;
			System.out.println("전투 실패 ! 마법사가 죽었습니다.");
		}
		}
		System.out.println("교전 결과 마법사의 체력 : " + this.hp);
		System.out.println("========================");
	}


	public void huntSlame(Slame slame) {
		// 슬라임 때리기
		slame.doBattle(this.atk);
		if(slame.getHp() <= 0) {
			System.out.println("전투가 종료되었습니다.");
			
		}else {
		// 얻어 맞기
		this.hp = (this.hp + this.def) - slame.getAtk();
		if(hp <= 0) {
			hp = 0;
			System.out.println("마법사가 죽었습니다.");
		}
		}
		System.out.println("교전 결과 마법사의 체력 : " + this.hp);
		System.out.println("========================");
	}
	
	
	// getter와 setter
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMp() {
		return mp;
	}


	public void setMp(int mp) {
		this.mp = mp;
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


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	

}
