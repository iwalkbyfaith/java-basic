package structure;   // ● 정의부 ●

public class Car {
	
	// 멤버 변수
	// 멤버 변수는 어떤 특정한 사물이나 객체의 "상태 혹은 정보"를 나타냅니다.
	public String model;  // 모델명
	public int price;     // 가격
	public String owner;  // 주인
	

	//멤버 메서드
	// 어떤 특정한 사물이나 객체의 "동작 (~하기)"을 나타냅니다.
	// ex) getInfo는 일종의 '조회하기'이다.
	public void getInfo() {
		System.out.println(owner + "의 차 정보입니다.");
		System.out.println("모델명 : " + model + ", 가격 : " + price);
	}
	

}
