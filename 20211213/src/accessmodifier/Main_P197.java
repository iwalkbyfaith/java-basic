package accessmodifier;   // ● 실행부 ●

public class Main_P197 {
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("김전사");
		
		// w1.hp = 10000;
		// (문제점) ※ w1.hp = 10000; 로 수치를 조작할 수 있음 ※
		// main쪽에서 이렇게 수치를 맘대로 고치는 것을 막기 위해 접근제한자 사용.
		// 얘는 public int hp; 가 int hp로 바뀌어도 가능. 같은 소속ㅇㅣ라서.
		
		// private int hp;로 고치면 8번에서 에러남.
		// main에서 직접적으로 힙에 있는 hp를 고치려고 하기 때문에 오류.
		
		
		// 사냥 3번
		w1.hunt();
		w1.hunt();
		w1.hunt();
	}

}
