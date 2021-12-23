package exception3;

public class Throw01_P361 {
	public static void main(String[] args) {
		// throw는 예외 상황이 아니지만 예외를 강제로 발생시킵니다. ( ※ throws 랑 다른 것!!! )
		// Math.random()은 0 <= 난수 < 1 범위를 가지는 난수를 발생시킵니다.
		System.out.println(Math.random());
			// 나중에 로또복권 추첨기 만들때 사용할 것.
		
		// 범위를 0 ~ 9 사이로 만들고 싶으면? => ( * 범위수 + 1 )
		
			// 1) 9까지 만들고 싶으면 9 + 1 => 10을 곱한다.
			System.out.println(Math.random() * 10);
			// 2) 여기에 강제로 int로 바꾸어주면 됨.
			System.out.println((int)(Math.random() * 10));
		
		// 그래서 보통은 sysout보다는 변수 만들어서 이렇게 많이 쓰나봐.
		int randomNum = (int)(Math.random() * 10);
		System.out.println("나온 난수 값 : " + randomNum);
		
		
		
		// 예외 발생 시켜볼게 억지로 (3보다 큰 난수를 만들고 싶지 않을 때 아예 무관한 에러 때려버리기)
		try {
			if(randomNum > 3) {   // 발생하지도 않은 Array~Exception 만들기
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("정상 범위 난수 발생");
			}
		} catch(Exception e) {
			System.out.println("없던 예외를 만들었습니다.");
			
			// 콘솔에 상세 예외 정보를 보여주는 구문입니다.
			e.printStackTrace();
		}
		
		
	}
}
