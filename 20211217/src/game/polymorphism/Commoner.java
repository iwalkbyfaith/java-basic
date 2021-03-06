package game.polymorphism;

public class Commoner {
	// 속성(필드, 변수)값으로 name, hp, mp, atk를 추가해주세요
	private String name;   // 이름
	private int hp;        // 체력
	private int mp;		   // 마나
	private int atk;       // 공격력
	
	
	
	// 생성자로 위 필드를 초기화하도록 설정해주세요.
	// 초심자여서 어떤 직업이어도 그냥 수치 고정.
	public Commoner(String name) {
		this.name = name;
		this.hp = 20;
		this.mp = 10;
		this.atk = 4;
	}
	
	// 다형성을 적용해서 어떤 몬스터가 오더라도 이 메서드 하나로 처리함.
	public void hunt(Monster monster) {
		// 몬스터의 doBattle(사용자 공격력)을 호출해서 몬스터의 체력을 깎아주세요.
		monster.doBattle(this.atk);
		// 오크가 반격 가능한 상태인지 먼저 검사
			if(monster.getHp() > 0) {
			// 몬스터의 공격력을 받아와 사용자의 체력을 깎아주세요.
			this.hp -= monster.getAtk();
			// 교전 결과
			System.out.println("교전 결과 " + name + "의 체력은 : " + this.hp);
			}			
	}
	
	
	
}
