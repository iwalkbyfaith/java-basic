package game.interaction;

public class Main03 {
	public static void main(String[] args) {
		
		Archer a2 = new Archer();
		Orc o2 = new Orc();
		Troll t2 = new Troll();
		
		a2.huntOrc(o2);
		a2.huntOrc(o2);
		a2.huntOrc(o2);
		a2.huntOrc(o2);
		
		a2.huntTroll(t2);
		a2.huntTroll(t2);
		a2.huntTroll(t2);
		a2.huntTroll(t2);

		
		Magician m3 = new Magician();
		Orc o3 = new Orc();
		Troll t3 = new Troll();
		
		m3.huntOrc(o3);
		m3.huntOrc(o3);
		m3.huntOrc(o3);

		
		m3.huntTroll(t3);



		
		
		
		
		
	}

}
