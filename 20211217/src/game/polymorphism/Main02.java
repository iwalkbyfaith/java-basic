package game.polymorphism;

public class Main02 {
	public static void main(String[] args) {
		
		Commoner c1 = new Commoner("왕초보");
		Monster t1 = new Troll();
		Monster s1 = new Slime();
		Monster d1 = new Dragon();
		
		
		c1.hunt(t1);
		c1.hunt(s1);
		c1.hunt(d1);
		
	}
}
