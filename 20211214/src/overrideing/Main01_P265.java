package overrideing;

public class Main01_P265 {
	public static void main(String[] args) {
		
		// 개와 고양이를 생성해보겠습니다.
		
		Cat c1 = new Cat();
		
		c1.name = "깜구";
		c1.color = "검흰";
		c1.age = 2;
		c1.owner = "다은";
		
		c1.howl();
		c1.getInfo();
		
		Dog d1 = new Dog();
		
		d1.name = "페퍼";
		d1.color = "회흰";
		d1.age = 4;
		d1.race = "보더콜리";
		
		d1.howl();
		d1.getInfo();
		
		// Animal쪽에 있는 howl이 맘에 안 들어서 고침
		// 고친 howl이 우선순위가 더 높다.
		// howl 위에 마우스를 갖다대보면 각각의 howl이 어디 출신인지 알 수 있음.
		
		
		// main에는 멤버변수의 값을 임의로 고쳐주신 다음 고친 값이 확인되도록 .getInfo()를 호출해주시면 됩니다.
		
		
	}
}
