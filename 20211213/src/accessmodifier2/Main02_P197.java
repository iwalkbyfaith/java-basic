package accessmodifier2;    // ● 실행부 ●

import accessmodifier.Warrior;

public class Main02_P197 {   // ※ 지역도 다르고 패키지 소속도 다름
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("김전사");
		
		// w1.hp = 10000;
		// 1) hp가 package friendly일때 package가 달라서 hp 변경 불가.
		// public int hp;가 아니라 그냥 int hp; 일때 (?)
		// => The field Warrior.hp is not visible
		
		// 2) private int hp일때(패키지가 같은 경우?)
		// private 요소인 hp는 메인지역에서 직접 값을 못 바꿈.
			// Q. 그럼 hp의 값을 어떻게 바꿀 수 있는데?
			// A. 메서드 hunt를 통해.(hunt와 hp는 같은 지역이므로 가능)
			//	  main에서 hunt호출 -> hunt에서 hp와 exp의 값을 바꿈.
		// 이거에 대해서는 필기하기 전에 더 검색해보고 필기하기.
		
		
		// 사냥 3번
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}		
}

