import java.util.Scanner;

public class MethodQ1_P204 {
	// 화씨 온도를 입력하면 섭씨 온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 FToC이고, double을 리턴합니다.
	// 리턴 받은 결과값은 main 메서드에서 sysout()으로 출력해주세요.
	// 화씨 = (섭씨 X 1.8) + 32
	

	public static double FtoC(double a){	
		return (a - 32) / 1.8;	
		
		// double c = (f - 32) / 1.8;
		// return c ;                    <= 이런 식으로 구성해도 됨.
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘의 화씨 온도를 입력해주세요.");
		double f = scan.nextDouble();
		
		double c = FtoC(f);
		System.out.println("오늘의 섭씨 온도는 " + c + "도 입니다.");
		
		scan.close();
	}
}

// 선생님거랑 섞였음 ;; 처음부터 다시 하기 
// ( 선생님 파일 다운 받아서 이거 보기 변수명이 2개 겹치는데 '소속'이라는 개념을 이해하기 위해 다시 봐야함.)
//
// 19번 -> 스택에 main지역 생성 -> main 안에 scan 생성. 실제 scan 내용은 힙 안에 저장됨(마치 배열처럼) -> 21번 프린트
// -> 22번 -> main지역 안에 f 생성. 53.0도를 집어 넣음 -> 10번으로 가면서 53.0 가져감 -> 스택 안에 FtoC 지역 생성
// -> FtoC 안에 f 생성(★★주의★★ main 지역안의 f와 다른 f임. 다른 지역에서 같은 이름의 변수 동시에 존재 가능.)
// -> main안의 f 값인 53.0이 13번의 double의 f값으로 들어감 -> (Double f의 소속은 FtoC소속임.) 스택 안 FtoC의 f값 안에 53.0 생성
