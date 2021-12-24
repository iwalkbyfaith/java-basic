package string1;

public class String08_P399 {
	public static void main(String[] args) {
		
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모은 공백을 제거합니다.
		String str = "                         Hello         Java                   ";
//		System.out.println(str.trim());
//		System.out.println(str);
			// 마찬가지로 시뮬레이션일 뿐 저장되지 않는다.
		
		
		// replace()를 이용해서 공백 전체를 없애보세요.
//		str = str.replace(" ", "");
//		System.out.println(str);
//		
		
		// trim()과 replace()를 이용해 Hello java 사이의 공백을 한칸만 남겨보세요. (헬로와 자바사이는 공백이 9칸)
		str = str.trim();
		str = str.replace("  ", "");
		System.out.println(str);
		
		String str1 = str.trim().replace("  ", "");    // 메서드 체이닝 검색해보자 (명령을 연달아 걸어주는 개념)
		System.out.println(str1);					   // 되는 경우와 안되는 경우가 있음. (<- 이말을 당장 이해하기는 배울게 많은지 어렵다고 하시네)
		
	}
}
