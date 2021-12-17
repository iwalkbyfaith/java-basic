
public class ForQ8_1 {
	public static void main(String[] args) {
		
	
	// 추가 문제
	// 중첩 반복문을 이용해서 다음 방정식의 양의 정수 해를 모두 구하세요
	// 4x + 5y = 60
	
		
// 두번째 시도. 이미 답 보고 적음.
	for(int x = 1; x < 15 ; x++) {
		for(int y = 1; y < 12; y++ ) {
			if(4*x + 5*y == 60) {
				System.out.println(x + "와" + y);
				
			}
		}
	}
		


	}
		
}



// 해답 코드
// x 포문, y포문, if문 필요. (아 if문 있다고 말해줘야지,,,)
// x가 1인 경우부터 시작해서 14인 경우까지 반복
// for(int x = 1; x < 15 ; x++){
//		x1, y1 = 9 => x1, y2 =? 14 => . . . => 새로운 for문 필요
//		for(int y = 1; y < 12 ; y++) {
//			if(x * 4 + y * 5 == 60){
//				sysout("x는" x , "y는" y "가 해입니다" );
//		}
//		}
//	}	


/* 첫 시도 => if문 써도 되는지 몰랐어
 int i = 1;
 int j = 1;
 
for(i = 1 ; (60 / (4*i) == 0) ; i++) {
	for(j = 1 ; (60 / (5*j) == 0) ; j++) {
		System.out.println(i & j);
 * 
 */




