package string1;

public class String07_P399 {
	public static void main(String[] args) {
		
		// toUppercase()는 문자열 전체를 대문자로 바꿉니다.
		// 대문자였던 것은 대문자 유지, 소문자였던 것은 대문자로 바꿉니다.
		
		String hello = "Hello java";
		System.out.println(hello.toUpperCase());
			// 저장을 해주는 개념이 아님.
		System.out.println(hello);
			// 바뀐 내용이 일시적으로 저장됐던 것임을 알 수 있음(시뮬레이션 같은 느낌)
		
		
		
		// toLowercase()는 문자열 전체를 소문자로 바꿉니다.
		// 소문자였던 것은 소문자 유지, 대문자였던 것은 소문자로 바꿉니다.
		
		String hi = "hihi HELLO";
		System.out.println(hi.toLowerCase());
	}
}
