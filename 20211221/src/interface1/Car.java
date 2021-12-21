package interface1;

// 인터페이스 구현 (상속이라고 부르지 않고 '구현'이라고 표현한다)
// 키워드: extends 가 아닌, implements를 사용한다.
// 인터페이스 내부의 추상 메서드는 무조건 전부 구현해야 합니다.
// implements로 받는 애들은 자식이라고 안 부르고 '구현체'라고 부름. (이 경우에는 Car = 구현체)

// Car 위에 마우스 올리고 또 Add unimplemented methods 클릭 -> 자동으로 메서드들 생성

// 변수는 새로 지정해주어야.
// 여러가지 종류의 객체를 여러 양식으로 만들고 싶을때 유리한 면이 있음(최적화 가능)
	// 추상 같은 경우 부모쪽에 만든 멤버 변수를 자식에서 필요 없어도 무조건 상속해야하는데
	// interface의 경우는 애초에 부모쪽에 멤버 변수가 없으니 구현체 쪽에서는 만들고 싶은 멤버 변수를 새로 만들면 됨.
	// 디테일한 구현 가능. (차, 기차, 비행기 클래스가 필요한 멤버 변수는 각각 다를 수 있으니)
	// 얘도 결론적으로는 다형성 떄문에 쓰는 것.
	// 장점) 부모쪽 생성자나 이런거 신경 안써도 됨.

public class Car implements Vehicle {
	
	// 자동차라면 가져야 하는 변수 설정
	// 현재 속도, 현재 연료량, 차주
	
	private int speed;      // 속도
	private int gas;       // 현재 연료량
	private String name;   // 차주
	
	
	// 생성자
	// 차주만 입력 받고 나머지는 속도 = 0, 연료량 = 100
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = CAR_MAX_GAS;  // <- Vehicle 인터페이스에서 만들어놓은 상수.
							 // '가스는 만땅으로 시작하는구나..' <- 직관적
	}
		// super(); 가 필요 없음. 부모클래스를 케어해줄 필요가 없다.
	
	
	@Override
	public void accel() { // 한번 가속 -> 속도 +10 / 연료 -1 / 속도 200 초과 불가
		
		// 가속 이전에 가속했을 경우 200을 초과하는지 확인해 처리(선생님 답)
		if(speed + CAR_INCREASE_SPD > CAR_MAX_SPD) {
			speed = CAR_MAX_SPD;
		}else {
			speed += CAR_INCREASE_SPD;
		}
		// 가속 로직을 다 확인한 다음
		gas -= CAR_DECREASE_GAS;
	}

	
	@Override
	public void breakSpeed() { // 한번 감속 -> 속도 -10 / 속도 0 미만 될수 없음
		if(speed - CAR_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		}else {
			speed -= CAR_DECREASE_SPD;
		}		
	}

	
	@Override
	public void reFuel() { // 채울때 -> + 30 / 단 최대값은 상수 MAX_GAS를 이용해서 측정해주세요.
		if(gas + CAR_INCREASE_GAS > CAR_MAX_GAS) {
			gas = CAR_MAX_GAS;
		}else {
			gas += CAR_INCREASE_GAS;
		}
	}

	@Override
	public void showStatus() { // 자동차의 정보를 조회할 수 있도록 작성
		System.out.println("현재 속도 : " + this.speed + ", 현재 연료량 : " + this.gas + ", 차주 : " + this.name);
		System.out.println("==============================================================");
		
	}

}
