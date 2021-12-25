package practice;

public class Practice04 {
	public static void main(String[] args) {
		
		
		// deleteCharAt()을 사용해서 0부터 세번째마다 단어 삭제
		
		StringBuilder a = new StringBuilder("123456789123456789");
		
		
		for(int i = 0; i < a.length() ; i+=3) {
		System.out.println("지금 길이는 " + a.length());
		System.out.println("현재 i는 " + i);
		System.out.println("없어질 문자는 " + a.charAt(i));
		System.out.println(a.deleteCharAt(i));
		System.out.println("======================");
		}
		
		
	}
}
