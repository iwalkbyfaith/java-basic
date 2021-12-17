package structure; // ● 실행부 ●

public class Structure03_P190 {
	
	
	public static void getinfo(Cat c) {  // 이름을 getCatInfo 라고 명확하게 지어주면 더 좋음.
		System.out.println(c.name + "의 정보입니다.");
		System.out.println("이름 : " + c.name + ", 나이 : " + c.age + ", 주인 : " + c.owner + ", 주인 번호 : " + c.pNum);
	}
	
	
	
	public static void main(String[] args) {
		
		Cat a = new Cat();
		a.name = "나비";
		a.age = 2;
		a.owner = "다은";
		a.pNum = "01012345678";
		
		Cat b = new Cat();
		b.name = "미미";
		b.age = 3;
		b.owner = "라은";
		b.pNum = "01098765432";
		
		getinfo(a);
		getinfo(b);
				
	}
}
