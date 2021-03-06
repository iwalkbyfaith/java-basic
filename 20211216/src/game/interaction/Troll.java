package game.interaction;

// 클래스 트롤
public class Troll {
	
	private int hp;
	private int atk;
	private int def;
	
	// 생성자 트롤
	public Troll() {
		this.hp = 10;
		this.atk = 4;
		this.def = 3;
	}
	
	// 매서드 doBattle
	public void doBattle(int uAtk) {
		hp = (hp + def) - uAtk;
		if(hp <= 0) {
			hp = 0;
			System.out.println("트롤이 죽어서 반응하지 않습니다.");
			return; // 값을 갖다주는게 아니라 강제 종료.
		}
		
		System.out.println("트롤의 남은 체력 : " + hp);   // 트롤이 안 죽어야 실행됨.
	}
	// 선생님 답 보고 필기한 것
	// 반복문은 break;를 쓰고 메서드는 return;으로 처리해야한다.
	// return; 처리하면 메서드가 끝난다.
	// ★★★ return의 용도 1) 배달해주기 위해서 갖다 놓는 2) 메서드를 강제로 종료 ★★★★
	

	
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
