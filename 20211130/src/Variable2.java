
public class Variable2 {
	public static void main(String[] args) {
		
		// < 변수의 선언 >
		// 박스를 만든다 = 변수를 선언한다.
		
		//동시에 2개 이상의 변수 선언도 가능하다.
		int b, c; 
		
		b = 10; // b박스에 10을 넣겠다.
		c = 15; // c박스에 15을 넣겠다.
		// 선언과 동시에 값을 넣어줄 수도 있다. 
		// 근데 따로따로 넣어줘야 함(;를 두번 쓰라는 말임)
		
		int a = 5; // a라는 박스를 생성하면서 거기에 정수 5를 넣겠다.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		// a에 있던 값을 20으로 갱신
		// 새로운 값을 넣으면 기존의 값은 사라진다.
		a = 20;
		System.out.println(a);
	}
}
