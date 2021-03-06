package superclass;

public class Airplane {

	// 비행기는 속도를 가집니다.
	protected int speed;
	
	// 생성자는 속도를 입력한 값으로 맞춰줍니다.
	public Airplane(int speed) {
		this.speed = speed;
	}
	
	// fly() 메서드를 정의하는데 속도가 500씩 붙습니다.
	// 단, 일반 비행기는 속도가 900초과일 수 없습니다.
	
	public void fly() {
		speed += 500;
		
		if(speed > 900) {
			speed = 900;
		}
		System.out.println(
				"가속 결과 : " + speed + "km/h로 비행중");
	}
	
		// fly() 선생님 답
		// if((speed + 500 ) > 900{
		//		speed = 900;
		// }else{
		//   	speed += 500;
		// }
	
	
	// breakSpeed() 메서드를 수행하면 속도가 100씩 감속합니다.
	// 단, 브레이크 구동의 최저 속도는 0입니다.
	// breakSpeed()가 아니라 break()를 쓰면 예약어라서 안된다.
	
	public void breakSpeed() {
		speed -= 100;
		if(speed <= 0) {
			speed = 0;
		}
		System.out.println("감속 결과 : " + speed + "km/h로 비행중");
	}
	
	// 선생님 답 breakSpeed()
	// if(speed - 100 < 0){
	//		speed = 0;
	//}else{
	//		speed -= 100;
	//}
	
	
	public void getInfo() {
		System.out.println("현재 속력 : " + speed + "km/h로 비행중");
	}

}

