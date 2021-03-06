package game.interaction;

// 클래스 워리어
public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	
	// 워리어 생성자
	public Warrior() {
		this.hp = 20;
		this.mp = 10;
		this.atk = 7;
		this.def = 1;
		this.exp = 0;
	}
	
		// ★(핵심) 교전을 할 경우 상호간의 수치값이 교환되어야 한다. (내가 쟤 때리면, 쟤도 날 때리는 식)
	// Warrior 쪽에서 Orc쪽의 수치를 깎아주고
	// Orc 쪽에서 Warrior 쪽의 수치를 깎아야 한다.
	
	
	// 교전 메서드 만듦
	// 순서 : main -> 워리어의 huntOrc 호출 ->오크 내부의 doBattle 호출
	public void huntOrc(Orc orc) {  // 파라미터로 오크의 값을 받아야한다.(값을 받아야 영향을 주니까)
		// 전사가 오크를 때리기 위해서 먼저 Orc의 do battle을 호출한다.
		orc.doBattle(this.atk);
		if(orc.getHp() <= 0) {
			System.out.println("전투가 끝났습니다.");
			System.out.println("교전 결과 전사의 체력 : " + this.hp);
		}else {
		// 전사도 오크에게 공격을 받습니다.
		this.hp = (this.hp + this.def) - orc.getAtk();
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
		}
	}
	
	public void hunTroll(Troll troll) {
		// 때리고
		troll.doBattle(this.atk);
		if(troll.getHp() <= 0) {
			System.out.println("전투가 끝났습니다.");
			System.out.println("교전 결과 전사의 체력 : " + this.hp);
		}else {
		// 반격당함
		this.hp = (this.hp + this.def) - troll.getAtk();
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
		}
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
			System.out.println("전사가 죽었습니다.");
		}
		}
		System.out.println("교전 결과 전사의 체력 : " + this.hp);
		System.out.println("========================");
	}
	
		
	
	
	

	
	
	// getter와 setter 생성
	// 변수를 프라이빗으로 막았을 때는 무조건 getter와 setter를 생성해야한다.
	
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
