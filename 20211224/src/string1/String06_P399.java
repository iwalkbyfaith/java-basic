package string1;

public class String06_P399 {
	public static void main(String[] args) {
		// substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.
		// 인덱스 번호를 두 개 주면 처음 인덱스 번호 ~ 두번째 인덱스 번호 사이만 남겨줍니다.
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);          // 0 ~ 4 까지 날아감
		System.out.println(result);
		
		result = str.substring(10, 15);            // 10 ~ 14 (★15는 포함이 안됨. 15 직전까지)
		System.out.println(result);
		
	}
}
