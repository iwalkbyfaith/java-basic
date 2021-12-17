
public class DataDouble_P43 {
	public static void main(String[] args) {
		// 실수 표현을 할 때는 float, double 자료형을 씁니다.
		// 기본적으로 대입할 목적으로 숫자를 실수로 적으면 double로 간주됩니다.
		// 만약 float형으로 실수 숫자를 적고 싶다면
		// 숫자 가장 오른쪽에 F라고 추가로 적어줍니다
		
		float a = 1.1F; // 좌변의 a변수에 double 1.1을 넣으려해서 에러 발생(f붙여야 에러 해제)
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);
		
		// 제대로 표현되지 않는 실수
		// 이진수로 표현되지 않는 실수값이 결과값인 경우는 정확한 값이 나오지 않는 경우도 있다.
		double c = 1-(0.1*7); 
		// 1-0.7 = 0.3인데 결과값은 0.2999~ 이런 식으로 나옴.
		// 0.3이라는 숫자는 2진수로 나타낼수 없어서 그 중에서 제~일 가까운 숫자로 출력한 것임.
		System.out.println(c);
	}
}
