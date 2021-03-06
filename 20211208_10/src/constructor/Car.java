package constructor;  // ● 정의부 ●

public class Car {

	// 자동차의 상태(속성)을 나타내는 변수들
	public int gas;      // 연료량
	public int speed;    // 속도
	public String owner; // 차주
	

	// ■■■■■■■■ 자동차 ★생성자★ 만들기 ■■■■■■■■ (Main01_P204의 10번 줄에서 new 키워드로 생성시 실행될 메서드)
	
		// ★ 리턴 타입은 기입하지 않습니다. (기입하면 안된다)
		// ★★ 클래스 이름인 Car로 메서드명이 고정됩니다. (무조건)
		// 생성시 자동으로 호출되기 때문에 무시하고 넘어갈 수 없습니다.

	public Car(int g, int s, String o) {  // ★ '생성자'에는 int나 void같은게 없음
		gas = g;
		speed = s;
		owner = o;
		System.out.println("자동차 생성 완료!");
		System.out.println("연료 : " + gas + ",속도 : " + speed + ", 주인 : " + owner);
	}
	// Q) 이걸 작성하니까 Main01_P204에 에러가남. 왜?
		// A) 생성자 Car가 g, s, o를 요청하고 있는데 
		// 10번줄 new Car(); 눌러보면 'add arguments to match'car(int,int,String)'라고 뜸
		// () 안에 100, 0, "고다은"을 넣으면 에러가 사라진다.	
	
	
	// 자동차의 동작 추가하기
	public void getInfo() {
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주인 : " + owner);
		System.out.println("====================== ");
	}

	// 운전 기능 추가하기(가속하기)
	public void accelSpeed() {
		gas -= 2;     // 연료는 줄어들고
		speed += 10;  // 속도는 늘어난다.
	}
	
	// 브레이크 기능 추가하기(감속하기)
	public void breakSpeed() {
		speed -= 10;
	}
	
	// 주유 기능을 추가해주세요.
	// 메서드 명은 putGas() 입니다.
	// 한 번 주유시 개솔린은 10씩 주유됩니다.
	// 만들고 main쪽에서 주유도 해 보세요.
	
	public void putGas() {
		speed = 0; // 주유하려면 멈춰야하니까 이걸 추가하는게 더 정확함.
		gas += 10;	
	}
	
	
	
	
// 자동차의 기능은 4개가 추가됨
	// 1.동작 2.가속 3.감속 4.주유
	
}
