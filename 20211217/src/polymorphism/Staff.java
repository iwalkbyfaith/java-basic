package polymorphism;

public class Staff extends Person{
	
	private int pay; // 시급
	
	// 생성자 Staff
	public Staff(String name, int age) {
		super(name, age);
		this.pay = 10000;
	}


	// 메서드 Staff 조회
	public void showPerson() {
		super.showPerson();
		System.out.println("시급 : " + this.pay);
	}
	
}
