package heterogeneous; // 이종모음

public class HeterogeneousArray {
	public static void main(String[] args) {
		
		// int[]에는 정수만 넣을 수 있음.
		int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		
		// int[] intArr = {"a", "b", 1, 2}; 와 같이는 넣을 수 없음. => 문자열이 있어서 에러 발생
		
		// iArr를 향상된 for문으로 출력해보세요.
		for(int item : iArr) {
			System.out.print("," + item);
		}
		System.out.println();
		
		// 여러 자료형을 받을 수 있도록 모든 클래스의 부모인 object로 배열 생성
		Object[] oArr = {"a", "b", 1, 2, 3.0, 5.1};
			// Object는 다형성의 원리에 의해 모든 자료를 저장 받을 수 있다.
		for(Object value : oArr) {
			System.out.print("," + value);
		}
			// 파이썬의 리스트는 온갖 리스트를 껴 넣을 수 있고 자바는 아니라고 하셨는데
			// 자바에서도 다형성 트릭을 통해서 집어 넣을 수 있다. (보편적으로 쓰는 방법은 아님. '불가능한건 아니다'라는 것을 보여줌)
			// 자료를 받을 때, 기본적으로 필요한 자료형만 들어오게 하는 것이 안전하기 때문에 잘 안씀.
		
		
		
	}
}
