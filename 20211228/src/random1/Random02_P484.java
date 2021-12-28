package random1;

import java.util.Random;
import java.util.Scanner;

public class Random02_P484 {
	public static void main(String[] args) {
		
		// Random 객체를 생성한 다음 nextBoolean() 기능을 이용해서
		// 동전 던지기 카운팅 프로그램을 만들어주세요.
		// n 회 던졌을 때 true가 나오면 앞면, false가 나오면 뒷면으로 간주해서
		// 프로그램이 다 끝났을 때 앞면 몇 회, 뒷면 몇 회인지 콘솔에 출력해주세요.
		// 실행 횟수 n회는 스캐너로 입력 받습니다.
		
		
		// 1. 동전 던질 횟수 입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 알려주세요");
		int count = scan.nextInt();
		

		// 2. 앞면 뒷면 카운팅할 변수 생성 (변수 선언 + 초기화)
		int front = 0;   // 앞면
		int back = 0;   // 뒷면

		
		// 3. 랜덤 변수 실행 후, 반복은 동전 던질 횟수만큼 돌려서
		Random random = new Random();
		
		for(int i = 0; i < count  ; i++) {
		Boolean result = random.nextBoolean();       
			// result 변수를 안 만들고 random 변수를 바로 main:35에 넣어도 됨.
		
		// 4. result 결과 값이 true면 앞면에 +1, false면 뒷면에 +1
		if(result == true) {
			front += 1;
		}else {
			back += 1;
		}
		}
		
		// 5. 다 돌린 값 콘솔에 찍기
		System.out.println(count + "바퀴 돌린 결과값");
		System.out.println("앞면 : " + front );
		System.out.println("뒷면 : " + back);
		
		
		scan.close();
		
	}
}
