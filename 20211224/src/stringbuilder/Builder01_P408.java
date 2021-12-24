package stringbuilder;

public class Builder01_P408 {
	public static void main(String[] args) {
		
		// StringBuilder
		
		// StringBuilder는 String 클래스와 의 로직차이로 인해 속도 개선이 되었습니다.
		// 일부 기능은 String의 기능과 겹칩니다.
		
		StringBuilder a = new StringBuilder("abefg");
		
		// 2번 이후의 모든 자료를 다 한칸씩 뒤로 밀고(2번자료부터~) 확보된 공간에 "cd"를 입력
			// ★★★★★ 삭제하거나 교체하는 개념이 아님. '뒤로 밀어서 그 자리에 넣는다'라는 것  ★★★★★ 
		a.insert(2, "cd");
		System.out.println(a);
		
		
		
	}
}
