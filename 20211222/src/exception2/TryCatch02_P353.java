package exception2;

public class TryCatch02_P353 {
	public static void main(String[] args) {
		// 아까 exception1 패키지 내부의 여러 예외 유형 중 하나를 골라서
		// 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try ~ catch 블록을 활용합니다.
		// / by zero(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		
		
		try {
		String a = "1994년도 3월 2일";
		System.out.println("확인 1번");
		
		int result = Integer.parseInt(a);
		System.out.println("확인 2번");
		
		System.out.println(result);
		System.out.println("확인 3번");
		
		}catch(Exception e){
			System.out.println("안돼요");
			
		}finally {
			System.out.println("다 끝났습니다.");
		}
		
	}

}
