import java.util.Scanner;

public class ScannerQ1 {
	public static void main(String[] args) {
		// 환율 계산기를 만들어보겠습니다.
		// 네이버에 검색해서 원하는 국가 화폐의 환율을 rate 변수에 저장해주세요.
		// 스캐너를 이용해서 won 변수에 원화 금액을 입력해주세요.
		// 원화와 환율을 이용해서
		// 원화 XXXXX원을 환전시 XXX(화폐) 입니다. 로 결과물을 출력해주세요.
		
		double rate = 1177.80;
		
		System.out.println("미국 달러의 환율은 1달러 당 " + rate + "원 입니다.");
		System.out.println("원화를 입력해주세요.");
		
		Scanner scan = new Scanner(System.in);
		int won = scan.nextInt();
		
		System.out.println("원화 " + won + "원을 환전시 " + (won / rate) + "$ 입니다." );
		
		// double 소수점 자리 통제하고 싶다면?(아직.. 외우지마..)
		// Math.round(won / rate)라고 입력하고 10^n승을 곱하고 10.0n^으로 나눠주면 n승에 해당하는 자리수만큼 소수점 자리까지만 나옴.
		// 소수점 첫째짜리까지 나타내고 싶다면
		// Math.round(won / rate * 10) /10.0 라고 입력하면 됨.
		// 소수점 둘째짜리까지 나타내고 싶다면
		// Math.round(won / rate * 100) /100.0 라고 입력하면 됨.
		
		
		scan.close();
		// 다 사용한 scan 변수는 .close()로 닫아줘야 메모리가 회수됩니다.
		
		// 쌤이 안보고 다시 작성해보는 것을 권한다고 하심.
		
		
		// 선생님 답
		
		// double rate1 = 42.47;
		
		// System.out.println("대만 달러의 환율은 1달러 당 " + rate1 + "원 입니다.");
		// System.out.println("원화를 입력해주세요.");
		
		// int won1 = scan.nextInt();
		
		// System.out.println("원화 " + won1 + "원을 대만 달러로 환전시);
		// System.out.println( won1 / rate + "ntd 입니다." );
		
		
				
		
	}
}
