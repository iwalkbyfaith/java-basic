package game.interaction;

public class Main04 {
	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		Warrior w1 = new Warrior();
		
		Slame s1 = new Slame();
		
		
		m1.huntSlame(s1);
		a1.huntSlame(s1);
		w1.huntSlame(s1);


	}
}
