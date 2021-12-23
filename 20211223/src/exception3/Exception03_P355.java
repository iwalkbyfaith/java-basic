package exception3;

public class Exception03_P355 {
	public static void main(String[] args) {
		// (문제) 그냥 catch문은 어디서 예외가 발생했는지 코드를 까보기 전까지 알 수 없음.
		
		// (해결) 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을때 (예외가 2개 이상 발생할 때)
		// 각각 예외 유형을 다르게 처리할 때 사용합니다.
		// 이 때 catch 구문을 여러번 사용할 수 있습니다.
		
		// 코드 순서
			// 에러가 발생했을 시 그 에러에 해당되는 곳으로 바로 이동하는 것이 아니라
			// 순서대로 25번 catch -> 28번 catch -> 31번 catch 이동하면서 에러에 맞는 유형에 들어가는 것.
		
		int[] number = {1, 2, 3, 4, 5, 0};
		
		// 예외가 발생할지도 모르는 코드부터 try 블럭에 넣습니다.
		try {
			for(int i =0; i < 7; i++) {                          // ArrayIndexOutOfBoundsException
				System.out.println(number[i]);		
			}
			System.out.println("0에서 나누기를 시도해보겠습니다.");
			System.out.println(number[4] / number[5]);           // ArithmeticException
		
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
			
		} catch(ArithmeticException b) {
			System.out.println("0으로 나눌 수 없습니다.");
			
		} catch(Exception e) {   // Exception e는 만능처리구문으로 어떤 예외도 다 일괄적으로 처리해줍니다.
								// ★ 왜 다 받을수 있냐면 디테일한 예외들이 Exception의 자식이라서 다형성의 원리에 의해 가능하게 된 것.
			System.out.println("예외가 발생했습니다.");
		}
		
		// ★ 여러 catch문을 작성할 때 (Exception e)가 적힌 catch문이 제일 밑으로 오도록 해야겠지. (범위가 제일 넓으니까)
		//   그렇게 안하면 에러뜸. (else if 문에서도 가장 범위가 좁은 것부터 위에 쓴 것이 같은 예임)
		
	}
}
