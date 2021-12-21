package interface1;

public class Train implements Vehicle {
	
	private int speed;     // 속도
	private int gas;       // 연료
	private String name;   // 기관사명
	
	
	public Train(String name) {
		this.name = name;
		this.speed = 0;
		this.gas = TRAIN_MAX_GAS;
	}
	
	// 오버라이드해서 사용해야하는 구현 메서드
	// 구현 = 구체적으로 만든다.
	@Override
	public void accel() {  // +50, 최대 300
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		}else {
			speed += TRAIN_INCREASE_SPD;
		}
		gas -= TRAIN_DECREASE_GAS;	
		
	}

	
	
	@Override
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		}else {
			speed -= TRAIN_DECREASE_SPD;
		}
	}

	
	
	
	@Override
	public void reFuel() {
		if(gas + TRAIN_INCREASE_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		}else {
			gas += TRAIN_INCREASE_GAS;
		}
		
	}


	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료 : " + gas);
		System.out.println("현재 기관사 : " + name);
		System.out.println("=====================");
		
	}
	
	

}
