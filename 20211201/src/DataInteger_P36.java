
public class DataInteger_P36 {
	public static void main(String[] args) {
		// 정수는 자료형의 크기에 따른 비트 갯수에 따라 표현 범위가 달라집니다.
		// 2의 보수 방식을 취하기 때문에 그렇습니다.
		// 범위를 넘지 않도록 주의해주세요.
		
		byte a = -128; //byte의 범위 : -128 ~+ 127
		System.out.println(a);
		
		// 우리가 그냥 숫자를 적으면 int로 간주됩니다.
		// 그래서 int 범위를 벗어난 값은 long형에는 대입이 안됩니다.
		long b = 2500000000L; 
		// 'long b = 2500000000;'라고 하면 에러가 남. 왜? 지금 얘는 int로 간주가 됨.
		// int 범위는 벗어난 숫자를 대입할때는 숫자 뒤에 L을 추가로 붙입니다.
		System.out.println(b);
		
		
		
		
	}
}
