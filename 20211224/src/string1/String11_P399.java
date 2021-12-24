package string1;

public class String11_P399 {
	public static void main(String[] args) {
	
		// String.valueOf()는 괄호 사이의 자료를 문자열로 바꿔줍니다.
		String a = String.valueOf(1000);
			// String a = "1000"; 인 상태.
			// int a = 1000; 를 받았다면 main:10의 값은 1001
		System.out.println(a);
		System.out.println(a + 1);
		
		
		// 실수 하나를 임의로 문자열로 바꿔서 저장해보세요.
		String b = String.valueOf(58.36);
			// double b = 58.36; 를 받았다면 main:18의 값은 59.36
		System.out.println(b);
		System.out.println(b + 1);
		
		
		// String.valueOf()를 쓰지 않고도
		// + ""(빈문자열) => 만으로도 문자열로 만들 수 있다.
		// 자바는 문자열 + 다른 자료형이 오는 경우, 전부 문자로 치환해 처리한다.
		String c = 1000 + "" ;      //  => "1000"이라는 문자가 됨.
		System.out.println(c);  
		System.out.println(c + 1);
		
		
		// boolean 자료형에 대해서 여러분들이 원하는 방식으로
		// 문자열화 해서 콘솔에 찍어주세요.
		
		String bool = true + "는 bool 타입 아님";
		System.out.println(bool);
		
		String bool1 = String.valueOf(false);
		System.out.println(bool1 + "는 bool 타입 아님");
		
	}
}
