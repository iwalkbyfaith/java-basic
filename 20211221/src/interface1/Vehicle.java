package interface1;

// ★ 인터페이스는 interface 선언을 사용합니다.
// ★ 내부에는 '상수'인 값과 '추상 메서드'만 선언할 수 있습니다. (완성된 메서드 X)
// 애초에 '구현'(implements = 미완성 된 것을 만드는 것)을 전제로 설계되기 때문에
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에서는 부모 클래스의 역할을 합니다.

public interface Vehicle {
	// 최대 연료량
		// 바로 상수로 잡힙니다.
		// ★★★★ public static final int인것 !!!! ★★★★  힙의 static에 들어감.
		// 상수를 쓰면 메인에서 사용할 때 그 상수의 값이 숫자로 무엇인지 몰라도
			// 그 값이 의미하는 바가 무슨 뜻인지 직관적으로 알 수 있음.
			// 메인의 로직 내부에 최대한 숫자가 없는게 좋은거라고 하시넴..
	
	// 공용 상수
	int MIN_SPD = 0;                    // 최저 속도
	
	
	// 자동차
	int CAR_MAX_GAS = 100;         	    // 최대 가스량
	int CAR_MAX_SPD = 200;		        // 최대 속도
	
	int CAR_INCREASE_GAS = 30;          // 연료 증가량
	int CAR_DECREASE_GAS = 1;           // 연료 감소량
	
	int CAR_INCREASE_SPD = 10;          // 속도 증가량
	int CAR_DECREASE_SPD = 10;          // 속도 감소량
	
	
	
	// 기차
	int TRAIN_MAX_GAS = 100;			// 최대 가스량
	int TRAIN_MAX_SPD = 300;		    // 최대 속도
	
	int TRAIN_INCREASE_GAS = 70;        // 연료 증가량
	int TRAIN_DECREASE_GAS = 7;         // 연료 감소량
	
	int TRAIN_INCREASE_SPD = 50;        // 속도 증가량
	int TRAIN_DECREASE_SPD = 50;        // 속도 감소량

	
	
	// 비행기
	int AIRPLANE_MAX_GAS = 1000;        // 최대 가스량
	int AIRPLANE_MAX_SPD = 900;			// 최대 속도
	
	int AIRPLANE_INCREASE_GAS = 500;    // 연료 증가량
	int AIRPLANE_DECREASE_GAS = 150;    // 연료 감소량
	
	int AIRPLANE_INCREASE_SPD = 400;    // 속도 증가량
	int AIRPLANE_DECREASE_SPD = 300;    // 속도 감소량
	
	
	
	
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상 메서드로 작성
	// {
	//      실행문...
	// }
	// 와 같은 실행문 부분(메서드의 몸체,body) 없이 선언만 해 주세요.
		// 이 메서드도 자식에서 반드시 고쳐서 써야한다.
	
	public void accel();         // 가속
	public void breakSpeed();    // 감속
	public void reFuel();        // 주유
	public void showStatus();    // 계기판 조회
	
	
	
}
