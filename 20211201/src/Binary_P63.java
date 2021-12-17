
public class Binary_P63 {
	public static void main(String[] args) {
		// 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자입니다.
		// 산술 연산자는 우리가 잘 알고 있는 사칙연산 등을 활용하기 위한 연술자이며,
		// 연산 우선순위도 그대로 계승합니다.
		// 단 % 연산자의 우선순위는 *, / 와 동일합니다.
		// +, -, *
		System.out.println(3 + 5);
		System.out.println(17 - 21);
		System.out.println(2 * 3);
		
		// (주의!)  /(나누기)는 왼쪽 수를 오른쪽 수로 나눠서 몫을 구합니다(정수 / 정수 = 정수)
		System.out.println(7 / 2);
		// 원래는 3.5인데 정수로 바꿔서 출력 => 3
		
		// 3.5로 바꾸고 싶으면? 둘 중 하나, 혹은 둘 다를 실수로 바꿔야 함.
		// 작은 쪽이 큰 쪽을 따라가니까.
		System.out.println(7 / 2.0);
		
		// %는 정수 최대 몫을 구하고 남은 값만 출력합니다.
		System.out.println(10 % 4);
		// 몫:2 / 나머지:2 => 나머지 2 출력
		
		// 연산자의 우선순위는 그대로 존재합니다: *, /, % > +, -
		System.out.println(10 + 6 % 4);   // => 12
		System.out.println((10 + 6) % 4); // => 0
	
	
	
	}
}
