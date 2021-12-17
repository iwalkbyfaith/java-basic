
public class OperandQ1 {

	public static void main(String[] args) {
		// 다음 조건을 만족하는 코드를 작성해주세요.
		// kor, math, eng, com 변수를 '한 줄로 선언'해주신다음 각각 
		// 80, 55, 65, 85를 대입해주시고
		// total 변수에 총점을 저장해주신다음
		// 콘솔창에 평균 점수를 출력해주세요.
		
		int kor, math, eng, com;  // 선언만 할 때는 값 입력해주지 않아도 됨.
		// 선언한 변수는 두 번 할 수 없다. (error ex_ Duplicate local variable kor)
		
		
		kor = 80;
		math = 55;
		eng = 65;
		com = 85;
		
		
		int total = kor + math + eng + com;
		
		System.out.println(total / 4);
		// ★ 소숫점 아래까지 나오게 하고 싶으면 '4.0'으로 나누어주어야 한다.
		// 지금은 정수 / 정수 => 정수만 나옴.
		
		// 내 답...
		// int kor = 80; int math = 55; int eng = 65; int com = 85;
		// int total = kor + math + eng + com;
		// System.out.println(total / 4);
		
		
		
	}

}
