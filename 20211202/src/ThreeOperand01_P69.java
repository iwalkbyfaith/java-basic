
public class ThreeOperand01_P69 {
	public static void main(String[] args) {
		// 삼항연산자는 (조건식? 참일떄결과 : 거짓일때결과) 형식으로 작성합니다.
		// 조건식의 결과가 true라면 참일때결과로 적어놓은 것이 출력되고
		// 조건식의 결과가 false라면 거짓일때결과로 적어놓은 것이 출력됩니다.
		// 더 정확히는 false라면 거짓일때 결과를 제외한 나머지가 다 제거되는 식임.
		
		System.out.println((3 < 5? "참입니다" : "거짓입니다."));
		System.out.println((3 > 5? "참입니다" : "거짓입니다."));
	}
}
