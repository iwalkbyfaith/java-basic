package game.inheritance;   // ● 정의부 ● (Commoner의 상속)

// 1. 뼈대가 되는 정보를 가진 Commoner 상속
// 이렇게 했을때 에러가 나는 것은 상관 없음 (생성자 만들고 연결하면 없어지는 에러임)
public class Warrior extends Commoner {
	
	private int pDam; // 물리 데미지
	
	
	// 객체를 생성하는 생성자 만들기
	public Warrior(String id) {  // (내용) 은 부모쪽에 전달할 것을 받는 것. + 필요하다면 자기가 쓸 것도.
		super(id);            // 생성자 내부에서 다른 코드에 앞서서 무!조!건! 1순위로 들어와야 함.
		this.pDam = 8;		  // 그 다음 물리 데미지 입력 (2순위로 자식에서 필요한 코드들을 입력)
	}
	
	
	
	public void getinfo() {
		System.out.println("레벨 : " + lv + 
						   ", 체력 : " + hp + 
						   ", 마나 : " + mp +
						   ", 물리 데미지 : " + pDam);
		
	}
	
	// Commoner에 있던 변수들을 모두 protected로 고침( 생성시 private로 만들었었음)
}
