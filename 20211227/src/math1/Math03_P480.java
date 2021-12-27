package math1;

public class Math03_P480 {
	public static void main(String[] args) {
		
		// rint()는 현재 수에서 가장 가까운 정수를 실수 형태로 구해줍니다.
		
		double a = 3.4890000000000001;
		System.out.println(Math.rint(a));
		
		double b = 3.500000000000001;
		System.out.println(Math.rint(b));
		
		double c = -3.499999999999999999;
		System.out.println(Math.rint(c));
		
		
		
		// round()
		// round 역시 비슷한데 round()는 반올림한 값을 구해줍니다.
			// rint()와의 차이? 콘솔창에 찍히는 수가 실수냐 정수냐로 나뉨
		
		System.out.println(Math.round(a));
		System.out.println(Math.round(c));
		
		
		
	}
}
