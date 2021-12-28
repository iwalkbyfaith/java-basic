package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice02 {
	public static void main(String[] args) {
		
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
				// 1. 당첨번호 6개를 뽑습니다.
				// 2. 추첨번호 6개를 뽑습니다.
				// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
				// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
				// 이어서 비교해서 일치여부 검사.
		
		List<Integer> num = new ArrayList<>();
		
		num.add(1);
		num.add(12);
		num.add(21);
		num.add(34);
		num.add(35);
		num.add(44);
		
		
		List<Integer> number = new ArrayList<>();
		int number1 = 0; // 
		boolean bool = true;
		int count = 0;
		
		while(bool) {
		
			while(number.size() != 6) {
				number1 = (int)(Math.random() * 45) + 1 ;
					if(number.contains(number1) == false) {
						number.add(number1);
					}
			}
			Collections.sort(number);
			System.out.println("추첨번호는 : " + number);
			
			
				if(num.equals(number)) {
					System.out.println("===============================================");
					System.out.println("당첨 번호는 : " + num);
					System.out.println("추첨 번호는 : " + number);
					System.out.println("총 로또 복권을 " + count * 1000 + "원 사고서야 1등에 당첨 되셨습니다.");
					System.out.println("===============================================");
					bool = false;
				
				}else {
					count++;
					number.clear();
			}
		}
	}

}
