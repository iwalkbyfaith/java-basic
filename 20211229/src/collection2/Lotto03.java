package collection2;  // 힌트 안 보고 문제 풀어보기.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {
	public static void main(String[] args) {
		
				// 로또복권 당첨 시뮬레이터를 만들어주세요.
				// 1. 당첨번호 6개를 뽑습니다.
				// 2. 추첨번호 6개를 뽑습니다.
				// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
				// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
				// 이어서 비교해서 일치여부 검사.
		
		
		// 1. 당첨 번호 뽑기 (선생님은 이것도 while문으로 돌려서 뽑으심)
		List<Integer> lotto = new ArrayList<>();
		
		lotto.add(1);
		lotto.add(12);
		lotto.add(13);
		lotto.add(17);
		lotto.add(19);
		lotto.add(20);
		
		
		// 2. 추첨 번호 뽑기
		List<Integer> myNum = new ArrayList<>();
			// 3. 랜덤 번호를 받을 변수 만들기
			int num = 0;
			// 9. while문에 사용할 변수 count 만들어줌.
			int count = 0;		         // 몇 바퀴 돌렸는지 알려줄 변수

			
			
			// 8. while문 사용 (추첨 번호가 당첨 번호가 한번에 똑같지는 않을테니까 같을 때까지 돌려주는 while문 추가.) = 비교용
			while(!lotto.equals(myNum)) {   // 뽑은 번호가 기존의 번호와 같지 않다면 진입.
											// 나는 변수  bool을 썼지만 선생님은 => !lotto.equals(myNum) 이렇게 하심. 저게 더 직관적이지.
				
				// 12-1 나는 12번에서 배열을 비워줬는데 선생님은 여기다가 만드심.
				
				// 4. while문 사용. (추첨 번호의 개수가 6개가 될때까지 true여야 함.) = 뽑기용
				while(myNum.size() != 6) {  // 사이즈인 6을 상수 처리해도 됨.
					// 5. 일단 번호부터 뽑고
					num = (int)(Math.random() * 20) + 1 ;      // 원래는 45라고 써야됨.
						// 6. 그 번호가 myNum에 없는 번호라면 더해줌
						if(myNum.contains(num) == false) {
						myNum.add(num);
						}
				}
							// 7. 다 뽑았다면 추첨번호를 정렬함
							Collections.sort(myNum);
							
							// 10. 정렬한 추첨번호를 당첨 번호와 비교
							if(lotto.equals(myNum)) {
								// 11. true(같다)면 while문 조건 부분을 false로 만들고 콘솔에 찍어줌)
								count ++;
								System.out.println("==================================");
								System.out.println("당첨 번호는 : " + lotto);
								System.out.println("추첨 번호는 : " + myNum);
								System.out.println("총 " + count + "개를 구매, " + 
												          (count * 1000) + "원을 사용해서 1등에 당첨 되었습니다.");
								System.out.println("==================================");
								// 12. false(같지 않다)라면 추첨번호를 싹 비워주고 다시 돌릴 준비.
							}else {
								// 이런식으로 표현 할 수도 있음
									// System.out.println("" + lotto + myNum);
									// 그럼 콘솔 왼쪽에는 당첨 번호가, 오른쪽에는 추첨 번호가 프린트됨.
								System.out.println("추첨 번호는 : " + myNum);
								myNum.clear();
								count ++;
							}
			
			}
			
			// 최종 결과를 마지막에 찍어줘도 됨.
			
			
			

			
		
	}

}
