package stringbuilder;

public class Builder08_P408 {
	public static void main(String[] args) {
		
		// reverse()는 문자열을 인덱스 순으로 따졌을 때 역순으로 나열해줍니다.
		
		StringBuilder str = new StringBuilder("로꾸꺼로꾸꺼");
		
		str.reverse();
		System.out.println(str);
		
		
	}
}
