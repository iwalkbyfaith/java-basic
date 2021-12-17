package game.inheritance;   // ● 정의부 ●


// 정보은닉이 적용되어 private 접근 제한자를 가진다. 

public class Commoner {

	protected int lv;            // 레벨
	protected int hp;		     // 체력
	protected String id;         // 아이디
	protected int mp;		     // 마나
	
	// 자식에게 상속할 때는 변수를 public 이나 protected로 한다. (귀찮아지는 일 방지하기 위해)
	// 선생님은 private나 protected로 하는걸 권하신다고.
	
	
	// 생성자로 데이터를 초기화할 수 있다. 아이디만 입력.
	// 생성자 내부에서 멤버변수를 초기화할 때는 웬만하면 this.를 붙여주는 경우가 일반적이다.
	public Commoner(String id) {
		this.lv = 1;
		this.hp = 20;
		this.mp = 10;
		this.id = id;
		System.out.println("캐릭터 " + id + "가 생성되었습니다.");
	}
	
	
	// getInfo 현재상태
	public void getInfo() {
		System.out.println("레벨 : " + lv + ", 체력 : " + hp + ", 마나 : " + mp);
	}
	
	
	
}
