package game.accessmodifier;

public class Warrior extends Commoner {
	
	// 힐 스킬 없음
	// fireball 대신 doubleAttack이 있어서 경험치 +25, 체력 -4
	// 이 외의 사항은 모두 매지션과 같으며
	// 메인02에 작성하면 됨.
	// 전사를 생성해서 자율적으로 다뤄보세요.ㅣ 행동은 최소 3개 이상

	
	
	// 생성자
	public Warrior(String name) {
		super(name);
		System.out.println("새로운 전사가 생성되었습니다.");
		System.out.println(name + "님 환영합니다!");
	}
	
	// 사냥 (체력-1 / 경험치 +10)
	public void hunt() {
		System.out.println("전사가 사냥을 시작합니다.");
		setHp(getHp() - 1);
		setExp(getExp() + 10);
	}
	
	// 더블어택 (체력-4 / 경험치 +25)
	public void doubleAttack() {
		System.out.println("전사가 더블어택을 날렸습니다.");
		setHp(getHp() - 4);
		setExp(getExp() + 25);
	}
	
	// 마력을 소모하는 회복의 물약 마시기
	public void drink() {
		System.out.println("마력을 5 소모하여 회복의 물약을 마셨습니다.");
		setMp(getMp() - 5);
		setHp(getHp() + 30);
	}
	
	// 보스 레이드. 체력 -30 경험치 +50
	public void bossRaid() {
		System.out.println("보스 레이드를 시작합니다.");
		setHp(getHp() - 30);
		setExp(getExp() + 50);
	}
	
	// 함정에 빠지기
	public void trap() {
		System.out.println("함정을 만났습니다!");
		for(int a = 10; a < getHp(); a++) {
			setHp(getHp() - 10);
			System.out.println("함정에 빠졌습니다. 체력이 줄어듭니다.");
			System.out.println("현재 체력 : " + getHp());
			if(getHp() <= 10) {
				System.out.println("가까스로 빠져나왔습니다.");
				break;
			}
		}
	}
	
	
	// 정보 조회 메서드
	public void getInfo() {

		if(getHp() <= 0) {
			setHp(0);
			setMp(0);
			setExp(0);
			System.out.println("체력 부족으로 사망했습니다. 5000 코인을 넣으면 부활합니다.");
		}else if(getExp() >= 100){
			setExp(0);
			setLv(getLv() + 1);
			System.out.println("레벨이 올랐습니다.");
			
		}
		System.out.println("현재 체력 : " + getHp() + 
							", 현재 마나 : " + getMp() +
							", 현재 레벨 : " + getLv() +
							", 현재 경험치 : " + getExp());
	}
	

	
	

	
}
