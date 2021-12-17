
public class ForQ1_P112 {
	public static void main(String[] args) {
		// Hello Java를 10번 출력하는 구문을 작성해보세요.
		// for문을 사용해서 작성해주세요.
		
		for(int i=0; i < 10; i++ ) {
			System.out.println("Hello Java" + i);
		}
	}
}
// 조건 자체를 비워버리면 무한루프 될 수 있음.
//
// ★★ <println 과 print의 차이>
// println에서 ln을 지우면 엔터 안치고 다음줄로 내리지 않고 오른쪽으로 연달아 프린트됨.(한줄에 출력)
// 다른 여러 식?을 프린트해도 마찬가지 서로 다른 식인데도 ln을 빼고 출력하면 모~두 한 줄에 프린트된다.
// System.out.print("Hello Java" + i);
// 다른 출력 없이 그냥 한 줄만 내려주고 싶은 경우는 비어있는 system.out.println();을 실행시켜주면 된다.
// (그럼 다른 식들이 ln을 뺀 상태에서도 엔터친 효과가 나는 것임.) (아무것도 출력은 안하지만 ln으로 엔터쳐줌)
// ln(=Line)은 한 줄 출력 후 엔터쳐주는 느낌이라고 생각하면 됨.