
public class Unary01_P65 {
	public static void main(String[] args) {
		// 단항 연산자 ++, --
		// ++, -- 는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있습니다.
		// 왼쪽에 붙는 경우를 전(前)위 수식, 오른쪽에 붙는 경우를 후(後)위 수식이라고 표현하며
		// 어느 방향에 붙냐에 따라 '실행 순서'가 달라집니다.
		// ++는 대상 변수의 숫자를 1 증가, -- 는 1 감소 시킵니다.
		
		int a = 1;
		
		System.out.println(++a);  
		// 전위 수식, 실행 전에 먼저 a값(=1)에서 1 증가
		// 실행 전에 변경했으니 출력값 = 최종값 = 2
		// 두개의 로직이 있다고 생각하면 됨.
		// 1. a 값을 먼저 1 증가시킴 : a = a(=1)+1
		// 2. 증가된 a 값을 콘솔에 찍음 : sysout(a(=2))
		
		System.out.println(a); 
		// a 값은 1 증가(=2)한채로 유지됨.
		
		System.out.println(a++); 
		// 후위 수식, a출력(=2)후 1 증가
		// 실행이 끝난다음에 1을 증가시키기 때문에 출력값 = 2, 최종값=3
		// 1. a 값을 콘솔에 찍음 : sysout(a(=2))
		// 2. a 값을 1 증가시킴 : a = a(=2)+1
		
		System.out.println(a); 
		// a 값은 1 증가한채(=3)로 유지됨
	}
}
