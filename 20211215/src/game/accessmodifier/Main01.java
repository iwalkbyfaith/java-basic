package game.accessmodifier;

public class Main01 {
	public static void main(String[] args) {
		
		// 매지션 생성
		Magician m1 = new Magician("왕초보법사");
		
		// 교전 전에 getInfo()로 정보 조회
		m1.getInfo();
		
		// hunt()로 사냥해주세요
		m1.hunt();
		m1.hunt();
		
		// 사냥이 끝난 후 정보조회
		m1.getInfo();
		
		// 파이어볼
		m1.fireball();
		m1.getInfo();
		
		// 힐
		m1.heal();
		m1.getInfo();
		
		
	}
}
