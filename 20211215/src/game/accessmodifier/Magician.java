package game.accessmodifier;

// Commoner에서 생성자에서 요구하는 변수가 있다면 에러지만, 요구하는게 없다면 에러날 일이 없음.
public class Magician extends Commoner {
	
	
	// 생성자 매지션
	public Magician(String name) {
		super(name);	
	}

	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
	
		// hp -=2;를 직접 실행할 수 없으므로 
		//public인 setter의 일종인 setHp()를 이용합니다. <= 변수가 private이라서 오류나는 것.
		// setHp(3)인 경우, 기존의 값 대신 hp변수에 3로 교체해달라는 요청임
		// (빼는 개념이 아니라 그 값을 바꾸어 버리는 것)
		
		// 현재 원하는 것은, 현 hp값에서 사냥할때마다 2씩 체력이 깎이는 것입니다.
		setHp(getHp() - 2);
		
		// 경험치도 마찬가지로
		// exp += 10;를 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는 것은, 현 exp값에서 사냥할때마다 10씩 경험치가 증가하는 것입니다.
		setExp(getExp() + 10);
		
		// Q) 체력을 2를 깎고 싶은데.. 만약 () 괄호 안에 -2를 넣는다면? 
		// A) 체력이 -2가 됨.
	}
	
	
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		// System.out.println("현재 체력 : " + hp); // => hp is not visible
												 // hp위에 마우스 대면 getHp()로 바꿀수 있음.
		System.out.println("현재 체력 : " + getHp() + 
					       ", 현재 마나 : " + getMp() +
					       ", 현재 레벨 : " + getLv() +
					       ", 현재 경험치 : " + getExp());
		
	}
	
	
	// 파이어볼 메서드 생성
	// 마나가 3 줄고, 경험치는 20증가
	public void fireball() {
		System.out.println("파이어 볼을 던졌다");
		setMp(getMp() - 3);
		setExp(getExp() + 20);
	}
	
	
	
	
	// 힐 메서드 생성
	// 마나가 3 줄고, 체력이 10 회복.
	public void heal() {
		System.out.println("상처에 힐을 시전했다.");
		setMp(getMp() - 3);
		setHp(getHp() + 10);
	}
	
	
	
	
	
}
