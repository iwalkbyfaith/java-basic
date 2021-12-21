package final1;

public class FinalMain01_P278 {
	public static void main(String[] args) {
		// 상수를 선언할 때는 자료형 왼쪽에 final 키워드를 붙인다.
		final int a = 50;
		
		// 상수를 조회하는데에는 제약이 없다.
		System.out.println(a);
		
		// 값을 변경하려고 하면 에러가 난다.
		//a = 500;
			// The final local variable a cannot be assigned. It must be blank and not using a compound assignment
		
		// 상수 변수는 선언만 하고 초기화를 동시에 하지 않으면 내부에 값이 없는 상태가 박제되어 버린다.
		// 따라서, 반드시 선언과 동시에 초기화를 해야한다.
		//  ==> 최근에는 가능하도록 변경됨. 가능하다고해도 권장하지는 않음
		final int b;
		b = 50;
		System.out.println(b);
		// b = 40;
			// 처음은 넣을 수 있지만, 역시 또 값을 바꾸려고 하니 두번째는 에러 뜨는 것을 볼 수 있음
		
	}
}
