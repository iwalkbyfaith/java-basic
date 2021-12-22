package exception1;

public class Exception04_P348 {
	public static void main(String[] args) {
		
		// 예외 발생 케이스 4
			// 특정 배열을 만들었을 때 배열 인덱스를 초과해서 입력하는 경우
		int[] arr = new int[5]; 
		System.out.println(arr[5]);
			// 존재하지 않는 번호로 조회해서 예외 발생
			// 에러 => Index 5 out of bounds for length 5 ( 0 ~ 4까지만 있으니까 )
		
	}
}
