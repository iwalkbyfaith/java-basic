package collection1;  // 여기 동영상으로 한 번 더 보자

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lotto01 {
	public static void main(String[] args) {
		
		
		// 로또 복권 추첨기를 만들어보겠습니다.
		// 로또 복권 추첨기는 1 ~ 45 범위에서 겹치는 숫자 없이 6개의 숫자를 뽑습니다.
		// 순서를 정렬해서 콘솔에 찍어주도록 만들어주세요.
		// ArrayList의 정렬은 .sort() 대신 -> Collections.sort(ArrayList)를 사용합니다.
		
		
//		// 첫번째 시도 X
//		List<Integer> list1 = new ArrayList<>();
//		
//		for(int i = 0; i < 6; i++) {                           => (안되는 이유) 딱 6바퀴만 돌면 중복되어도 6바퀴만 돈다. => while문 써야.
//			int num = (int)(Math.random() * 45) + 1;
//			list1.add(num);
//		}
//		Collections.sort(list1);
//		System.out.println("추첨된 번호 : " + list1);
		
		
		
		// 두번째 시도. 힌트 겟
		
		
		// 1. Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
		
		// 2. 로또 번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int num = 0;
		
		// 3. while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록.
		while(lotto.size() != 6) {   // = 중복되지 않은 6개의 숫자를 뽑힐 때까지 돌리겠다.
			// 4. 번호 뽑기
			num = (int)(Math.random() * 45) + 1;
			// 5. 번호가 만약 기존에 뽑은 번호 목록에 포함되어 있지 않다면
			if(lotto.contains(num) == false) {  // 선생님은 (!lotto.contains(num)) 이렇게 쓰심
				// 6. 추가하기
				lotto.add(num);
			}
		}
		// 7. 다 돌면 정렬하기
		Collections.sort(lotto);
		
		// 8. 추첨 번호 보여주기
		System.out.println("추첨된 번호 : " + lotto);	
		
		
		// 9. 2등 당첨 번호 보여주기. 선생님 버전
		
		// num에 저장된 번호가 기존 lotto 리스트에 저장되어 있는 리스트라면(반복문)		
		while(lotto.contains(num)) {            
			// 새로운 번호를 다시 getNum에 저장			
			num = (int)(Math.random() * 45) + 1;
		}
		// 반복문 탈출 후 2등 당첨 번호 화면에 출력
		System.out.println("2등 당첨 번호 : " + num);
		
		// main:59 지금 num에는 lotto에 들어가 있는 번호 중 한 번호가 들어 있음.
		// lotto.contains(num) = true -> num:61로 이동해서 새로운 번호 부여 받음
		// main:62를 만나서 maim:59로 이동
			// 그 번호가 또 중복이라면 true를 반환해서 새로운 번호를 부여 받음
			// 그 번호가 중복이 아니라면 반복문을 탈출해서 main:64로 이동. 콘솔창에 찍어준다.
		
		
		
		
		
//		// 9. 2등 당첨번호 보여주기. 내 버전
//		while(true) {
//		int num2 = (int)(Math.random() * 45) + 1;
//		if(lotto.contains(num2) == false) {
//			System.out.println("2등 당첨 번호 : " + num2);
//			return;
//		}
//		}
		
		
	}

}

