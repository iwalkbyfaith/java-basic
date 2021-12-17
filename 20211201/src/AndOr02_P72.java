
public class AndOr02_P72 {
	public static void main(String[] args) {
		// &&, ||은 short circuit(단축검정) 연산자라고 부릅니다.
		// &, |과 똑같이 작동하되, 왼쪽의 조건식만으로 모든 결과가 확정되면 추가적인 연산을 무시합니다.
		// 에러가 발생하는 오른쪽 연산(0으로 나누기)을 생략하는지 테스트
		// 기본적으로는 하나짜리보다 두개짜리를 더 많이 씀.
		
		
		System.out.println((1+3 > 4) && (0 < 2/0));
		// 왼쪽만 실행했을때 false였기에 오른쪽 실행 안했음. &만써서 실행했으면 오류나고 난리남
		// System.out.println(3/0); => Exception: / by zero
		
		System.out.println((5 > 4) || (0 < 2/0));
		// 왼쪽만 실행했을때 true였기에 오른쪽 실행 안했음. |만써서 실행했으면 오류나고 난리남
		
		
	}
}
