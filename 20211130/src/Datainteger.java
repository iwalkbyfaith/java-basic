
public class Datainteger {
	public static void main(String[] args) {
		// 정수형을 나타낼 수 있는 자료는 크게 4가지 입니다.
		// bite(1바이트), short(2바이트), int(4바이트), long(8바이트)
		
		
		// byte 형 자료 생성 및 초기화(변수 만들고 바로 값 넣기)
		
		byte a = 127; //8비트(0 ~ 2^8-1)
		// byte에 600을 넣으면 에러가 남.
		
		short b = 32000; //16비트(0 ~ 2^16-1)
		int c = 210000000; //32비트(0 ~ 2^32-1)
		long d = 2041894; //64비트(0 ~ 2^64-1)
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
