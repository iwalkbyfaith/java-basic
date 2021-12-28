package practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice01 {
	public static void main(String[] args) {
		
		// 로또 복권 추첨기를 만들어보겠습니다.
		// 로또 복권 추첨기는 1 ~ 45 범위에서 겹치는 숫자 없이 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort() 대신 -> Collections.sort(ArrayList)를 사용합니다.
		
		
		
		// 일단 배열을 만들어야지
		List<Integer> lotto = new ArrayList<>();
			// 얘는 지금 빈 배열이야 여기다가 랜덤한 숫자를 하나씩 넣어줄거임
		
		// 일단 숫자 받자
		int num = 0;
		
		// lotto 배열에 숫자가 하나씩 들어가야 함.
		// 추가하는 .add()를 쓰면 되겠지
		
		
		while(lotto.size() != 6) { // lotto 배열 내에는 6개가 들어가야 하니까
		// 중복되지 않는 경우만 넣어주기
		num = (int)(Math.random() * 45) + 1;
		if(lotto.contains(num) == false) {
			lotto.add(num);
		}
		
		}
		Collections.sort(lotto);
		System.out.println(lotto);
		
		while(lotto.contains(num)) {
			num = (int)(Math.random() * 45) + 1;
		}
		
		System.out.println("2등 당첨 번호 : " + num);
		
	}
}
