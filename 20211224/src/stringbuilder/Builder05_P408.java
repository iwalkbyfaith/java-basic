package stringbuilder;

public class Builder05_P408 {
	public static void main(String[] args) {
		
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요.
		
		// 문자열은 "abcdefghijklmnopqrstuvwxyz"입니다.
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");

		// 이거 약간스 백퍼 이해 안되는데 복습할 때 그림 그려서 다시 보자
		int i = 0;
		
		while(i < a.length()) {
			
			a.deleteCharAt(i);
			i = i + 3;
		}
		System.out.println(a);
		
		
		
		// 선생님은 for문을 쓰셨다고 하니 나도 해보자
		
//		for(int j = 0; j < a.length() ; j += 3) {
//			a.deleteCharAt(j);
//			}
//		System.out.println(a);
		
		
		
		// 선생님 답
		
//		for(int j = 0; j < a.length() ; j ++) {
//			if(j % 3 == 0) {
//				a.deleteCharAt(j);
//			}
//		}
//		System.out.println(a);
	
		
		
		// 이렇게 해도 됨.
		
//		for(int j = 0; j < a.length() ; j += 3) {
//				a.deleteCharAt(j);
//		}
//		System.out.println(a);
}
	
}
