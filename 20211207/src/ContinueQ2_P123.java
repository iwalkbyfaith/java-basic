
public class ContinueQ2_P123 {
	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 일단 math 점수를 내주시되, 합격자 평균만 내주세요.
		// 합격 점수는 60점 이상입니다.
		
		int[] math = {96, 23, 52, 82, 72, 31, 58};
	
		// 1. 총점 변수와 합격자수 변수 생성
		int total = 0;
		int count = 0;
		
		// 2. 반복문 실행(향상된 for문 권장)
		for(int item:math) {
		
		// 3. 검사해서 60점 미만이면 continue
		// 4. 60점 이상이면 합격자수 +1, 총점에 합격 점수 더하기
				if(item < 60) {
				continue;
				}
				count += 1;
				total += item;		
		}                                            // 2번의 반복문 for 영역은 여기까지
		
		// 5. 다 돌고 나오면 총점 / 합격자수로 합격자평균 내기
		System.out.println("수학 평균 : " + total/count);   // 이건 반드시 for 바깥에 적어야된다 아니면 난리남
		
		
		// 영어
		
		// total = 0; 이렇게 해도 됨.
		// count = 0; 나는 아예 새로운 변수를 선언한거고.
		
		int[] eng = { 62, 42, 68, 31, 80, 77, 45 };
		int total1 = 0;
		int count1 = 0;
		
		for(int item1 : eng) {
			if(item1 < 60) {
				continue;
			}
			count1 += 1;
			total1 += item1;
		}
		System.out.println("영어 평균 : " + total1/count1);
		
		
		// 컴퓨터
		
		int total2 = 0;
		int count2 = 0;
		
		int[] com = { 10, 28, 39, 74, 65, 90, 98 };
		
		for(int item2 : com) {
			if(item2 < 60) {
				continue;
			}
			count2 += 1;
			total2 += item2;
		}
		System.out.println("컴퓨터 평균 : " + total2/count2);
		
	}
}
