package game.accessmodifier;    // ● 정의부 ●

public class Commoner {
	
	// private 요소는 자식 쪽에서도 조회나 수정이 불가능합니다.
	// 보안성이 제일 뛰어나기 때문에 private을 무조건 써야한다면 
	// ★ setter, getter ★라는 것들을 이용해 보조합니다.
	
	private int hp;
	private int mp;
	private int lv;
	private int exp;
	private String name;

	
	
	public Commoner(String name) {
		this.hp = 20;
		this.mp = 10;
		this.lv = 1;
		this.exp = 0;
		this.name = name;
	}

	
	// (방법) setter/getter의 기본형을 만드는 방법은
	// 마우스 우클릭 -> source -> generate getters/setters를 선택해 자동으로 생성해줄 수 있다.
		
	
	public int getHp() {
		return hp;
	}
	// 파라미터값을 요청하지 않아서 + public이어서 그냥 호출이 됨.
	// Magician 30번줄의 getHp() 자리로 return됨.


	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getMp() {
		return mp;
	}



	public void setMp(int mp) {
		this.mp = mp;
	}



	public int getLv() {
		return lv;
	}



	public void setLv(int lv) {
		this.lv = lv;
	}



	public int getExp() {
		return exp;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	

	
	
}
