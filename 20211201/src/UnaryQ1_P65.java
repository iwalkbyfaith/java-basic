
public class UnaryQ1_P65 {
	public static void main(String[] args) {
		// int a 에 15를 담은 다음 후위 -> 전위 --를 unaray01 처럼 사용해서
		// 1씩 차감하고 콘솔에 찍는 것을 반복해주세요.
		// 단, 실행 로직은 Unary01 에서 그랬듯 주석으로 하단에 풀어서 작성까지 해주세요.
		
		int a = 15;
		
		System.out.println(a--);
		// 1. 콘솔에 찍는다 a = 15
		// 2. 콘솔에 찍은 후에 a에서 1을 감소시킨다. a = a(15)-1
		
		System.out.println(a); 
		// a = 14
		
		System.out.println(--a);
		
		// 1. 콘솔에 찍기 전 a 값을 1 감소시킨다. a = a(14)-1
		// 2. a를 콘솔에 찍는다. a = 13
		
		
		System.out.println(a); 
		// a = 13
		
	}
}
