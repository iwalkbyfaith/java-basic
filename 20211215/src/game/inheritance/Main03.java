package game.inheritance;    // ● 실행부 ● 매지션&아처

public class Main03 {
	public static void main(String[] args) {
		
		Magician m1 = new Magician("초보마법사");
		m1.getInfo();
		
		Archer a1 = new Archer("초보궁수");
		a1.getInfo();
	}
}
