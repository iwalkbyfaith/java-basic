
public class Binary04_P77 {
	public static void main(String[] args) {
		// 비트 이동 연산자(=시프트 연산자)는 숫자 >> (<<) 자리수(숫자가 들어감) 문법을 사용한다.
		// 꺽쇠의 방향이 <<인 경우는 왼쪽으로 자리수만큼 밀어준다.
		// 이때 정수 숫자는 2의 자리수 제곱만큼 증가합니다.
		// 반대 방향인 경우는 2의 자리수 제곱만큼 줄어든 값이 된다.
		int a = 80;
		System.out.println(a >> 3);
	
		System.out.println(a);
		// 이동 결과가 a에 저장되지는 않으므로 a는 80이다.
		
		System.out.println(a << 3);
		
	
	}
}
