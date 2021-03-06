package accessmodifier;   // ● 정의부 ●

public class Warrior {   // ■■■■■■■■  접근 제한자  ■■■■■■■■
	// hp, mp, lv, atk, def, exp, name;
	
	
	// 선언
	
	// 변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바귀지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private로 처리합니다.
	private String name;   // 아이디
	private int hp;		  // 체력
	private int mp;		  // 마나
	private int lv;		  // 레벨
	private int atk;		  // 공격력
	private int def;		  // 방어력
	private int exp;		  // 경험치
	
	
	// 생성자 (1. 클래스 이름과 동일 2.리턴 자료형 없음)
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		
		System.out.println("전사 생성 완료!");
		System.out.println("아이디 : " + name +
						   ", 체력 : " + hp +
						   ", 마나 : " + mp +
						   ", 레벨 : " + lv +
						   ", 공격력 : " + atk +
						   ", 방어력 : " + def +
						   ", 경험치 : " + exp);
	}
	
	
	
	// hunt 메서드 (실행시 사냥. 체력 -2/ 경험치 +10)
	
	// 생성자를 비롯한 메서드는 행동을 나타내고, 
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다.
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력이 " + hp + "가 되었고, 누적 경험치는 " + exp + "입니다.");
	}
	
}
