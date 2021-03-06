package constructor;   // ● 실행부 ●

public class Main01_P204 {
	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름
		
		Car c1 = new Car(100, 0, "고다은");   // Car라는 매서드 호출
		// c1.gas = 100;					// Car Class파일의 17번줄 생성자로 감
		// c1.speed = 0;
		// c1.owner = "고다은";
			// 생성자로 gas, speed, owner를 처리해서 이 세줄은 이제 필요가 없어짐.
				// 100, 0, 고다은은 Car.java의 17번 줄에 왼쪽부터 각각 들어가게 됨.
		
		
		// 차를 뽑자마자 먼저 상태 확인
		c1.getInfo();
		
		// 여기서 엑셀을 두 번 밟은 후 상태 다시 확인
		c1.accelSpeed();
		c1.accelSpeed();
		c1.getInfo();
		
		// 브레이크 밟고 상태 확인
		c1.breakSpeed();
		c1.getInfo();
		
		// 주유 한 번 하고 상태 확인
		c1.putGas();
		c1.getInfo();
		

	}
}

// 생성자의 장점
// 1. new Car(); 의 ()안에 값을 한 줄로 처리할 수 있다.
// 2. 생성자가 있을때 값을 없이 만들려고 하면 에러가 남(의도하지 않은 값이 들어갈 확률 낮음.)= 안정성 높음
