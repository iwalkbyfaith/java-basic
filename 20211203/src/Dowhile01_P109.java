
public class Dowhile01_P109 {
	public static void main(String[] args) {
		// do ~ while문은 while문과 기본적인 동작원리는 같습니다.
		// 단, 첫 번째 바퀴는 조건비교 없이 바로 실행하고
		// 두 번째 바퀴부터 조건비교를 통해 추가 실행 여부를 결정합니다.
		
		 int a = 1;
		 
		 do { // do 구문이 먼저 써지고 하단에 실행문을 적습니다.
			 a += 2;
			 System.out.println("a는 5보다 작나요?");	 
		 }while(a < 5);  // 일반 while 문과 달리 마지막에 ;을 붙입니다.
	}
}

// do의 영역 10 ~ 13.
// 3 < 5 => 10번으로 올라가 실행.
// a는 5가 되고 프린트 됨.
// while문에서 비교 했을때 5 < 5 니까 정지.
// a를 5로 만들고 실행해보세요. => 한번 실행.
