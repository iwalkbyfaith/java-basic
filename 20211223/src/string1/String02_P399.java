package string1;

public class String02_P399 {
	public static void main(String[] args) {
		
		// String 클래스의 주요 메서드 확인 2. indexOf()
		
		// indexOf()는 특정 문자열의 시작 인덱스 값을 반환한다.
		// 만약 특정 문자열이 포함되어 있지 않다면 -1을 리턴한다.
		
		String tomato = "tomato";
		int get = tomato.indexOf("to");
		
		// 첫 번째 to 단어는 0번부터 시작
		System.out.println(get);
		
		
		// 중복문자 집계
			// Q) 두 번째 to 단어를 알고 싶을때는?
			// A) 0번이 아닌 1번 인덱스부터 조회해서 처음으로 나오는 to 조회
			get = tomato.indexOf("to", 1);
			System.out.println(get);
		
		// 포함되어있지 않은 값 조회	
			// Q) 없는 것을 조회시?
			// A) -1이라는 가상의 인덱스 번호를 준다.
			// 파이썬에서는 -1은 뒤에서 첫번째였지만, 자바에서는 -1은 '없는 것'이라는 뜻.
		
		get = tomato.indexOf("banana");
		System.out.println(get);
	}
}
