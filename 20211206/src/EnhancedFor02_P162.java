
public class EnhancedFor02_P162 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 위 3개의 명칭으로 array를 만들어 담아주신 다음
		// 과목별 평균 점수를 enhanced for문을 이용해 구한 다음 콘솔창에 출력해주세요. => 숫자들을 어떻게 더하지?
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int total = 0; 
		
		for(int score : math) {
			total += score;
		}
		System.out.println("수학평균 : " + total/math.length);  // => for 구문이 다 끝나고 print해야 아까처럼 오류 안남.
		
		int total1 = 0;
		for(int score1 : eng) {
			total1 += score1;
			}
		System.out.println("영어 평균 : " + total1/eng.length);
		
		int total2 = 0;
		for(int score2 : com) {
			total2 += score2;
		}
		System.out.println("컴퓨터 평균 : " + total2/com.length);
		
		
		// 일반 for문으로 eng 평균 만들기
		
		int total3 = 0;
		for(int i = 0; i < eng.length; i++) {
			total3 += eng[i];
		}
		System.out.println("new 영어평균 : " + total3/eng.length);
		
		
		
	}
}
