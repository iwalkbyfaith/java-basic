package structure; // ● 실행부 ●

public class ClassMain02_P196 {
	public static void main(String[] args) {
		
		Car a = new Car();
		a.model = "람보르기니";
		a.price = 1111111111;
		a.owner = "고다은";
		a.getInfo();
		
		Car b = new Car();
		b.model = "페라리";
		b.price = 123456789;
		b.owner = "고다은";
		b.getInfo();
		
	}
}
