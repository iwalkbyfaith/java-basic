package game.inheritance;	// ● 실행부 ●

public class Main02 {
	public static void main(String[] args) {
		
		// 워리어 생성을 하나 해주세요.
		Warrior w1 = new Warrior("왕초보전사");
		w1.getinfo();
	}
}

// ★ 코드 호출 순서 : main[7] 우변 -> Warrior[11][12] -> Commoner[19~25] (Commoner 클래스의 변수에 값 전해주고 다시 옴) 
//				  -> Warrior[12]에 실행할 것 없는 것 확인 -> Warrior[13] -> main[7] 좌변 : 우변 결과 주소값을 좌변에 저장
//				  -> main[8] 메서드 실행.

