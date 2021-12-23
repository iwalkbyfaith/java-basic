package string1;

public class String01_P399 {
	public static void main(String[] args) {
		
		// String 클래스의 주요 메서드 확인 1. charAt();
		
		String greeting = "Hello Java";
		char get = greeting.charAt(6);
		System.out.println(get);
		
		// 자바는 문자열 인덱싱을 허용하지 않는다.
			// System.out.println(greeting[6]); => 에러
			// 문자열을 일반 배열처럼 취급을 안한다.
			// ==> ★ 자바에서는 인덱스가 아니라 charAt()으로 가져와야함.
	}
}
