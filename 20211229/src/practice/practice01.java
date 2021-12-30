package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice01 {
	public static void main(String[] args) {
		
				// 로또복권 당첨 시뮬레이터를 만들어주세요.
				// 1. 당첨번호 6개를 뽑습니다.
				// 2. 추첨번호 6개를 뽑습니다.
				// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
				// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
				// 이어서 비교해서 일치여부 검사.
		
		
		
		List<Integer> lotto = new ArrayList<>();
		
		lotto.add(1);
		lotto.add(12);

		List<Integer> myNum = new ArrayList<>();
			int num = 0;
			int count = 0;		       
			
			while(!lotto.equals(myNum)) {   

				while(myNum.size() != 2) {
					num = (int)(Math.random() * 45) + 1 ; 
					
						if(myNum.contains(num) == false) {
						myNum.add(num);
						}
				}
							
				Collections.sort(myNum);
							
							
				if(lotto.equals(myNum)) {
					count ++;
					System.out.println("==================================");
					System.out.println("당첨 번호는 : " + lotto);
					System.out.println("추첨 번호는 : " + myNum);
					System.out.println("총 " + count + "개를 구매, " + 
							(count * 1000) + "원을 사용해서 1등에 당첨 되었습니다.");
					System.out.println("==================================");
				}else {
					System.out.println("추첨 번호는 : " + myNum);
					myNum.clear();
					count ++;
				}
			
			}
			
			
			
			

			
		
	}

}
