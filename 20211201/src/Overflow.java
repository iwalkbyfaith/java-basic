
public class Overflow {
	public static void main(String[] args) {
		
		// 오버플로우는 표현할 수 있는 최대 숫자를 넘겨서 표현하면
		// 그 자료형으로 표현할 수 있는 최소값으로 초기화되는 현상을 의미합니다.
		// 아래와 같이 -128 ~ 127 사이의 범위를 표현할 수 있는 byte의 최대값인
		// 127을 넘겨버리면 최소 표현값인 -128부터 다시 수가 잡히는 것을 볼 수 있습니다.
		// 오버플로우를 방지하기 위하여 아예 long을 쓴 경우도 있다. (int는 좀 애매쓰)
		
		byte a = 127;
		byte b = 1;
		
		System.out.println((byte)(a + b));
		// a + b = 128이지만 byte에서는 128을 쓸 수 없기 때문에 오버플로우가 생겨서 -128이라고 나옴.
		
		System.out.println((a + b));
		// byte를 쓰지 않으면 a + b 를 알아서 int로 변환해주기 때문에 오류가 나지 않음.
		
		System.out.println(a + b);
		// 이건 그냥 해봄.
	}
}
