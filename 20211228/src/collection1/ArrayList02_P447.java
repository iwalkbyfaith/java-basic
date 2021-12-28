package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02_P447 {
	public static void main(String[] args) {
		
		// 여러분들이 직접 String 자료를 가변적으로 받을 수 있는 ArrayList를 만들어주시고
		// 안쪽에 자료로 "사과", "딸기", "망고", "블루베리", "파인애플"을 넣어주세요.
		// 자료가 적재된 ArrayList를 콘솔에 찍어주세요.
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("사과");
		list1.add("딸기");
		list1.add("망고");
		list1.add("블루베리");
		list1.add("파인애플");		
		System.out.println(list1);
		
		
		// .contains("자료")는 리스트 내에 찾는 자료가 있으면 true, 없다면 false 출력해준다.
		System.out.println(list1.contains("사과"));   // Q) list1 내부에 사과가 있니?  A) true
		System.out.println(list1.contains("복숭아")); // Q) list1 내부에 복숭아가 있니? A) flase
			// 인터넷에서 데이터를 땡겨오면 뭐가 들어있는지 모르는 상황에서 씀
		
		
		// .get(번호) 는 주어진 인덱스에 저장되어 있는 자료를 조회해줍니다.
		System.out.println(list1.get(1)); // Q) 인덱스 1번에 뭐가 들어있니? A) 딸기
		
		// 없는 인덱스 번호를 입력하면 예외가 발생해 전체 코드가 종료됩니다.
			//System.out.println(list1.get(10));
			// 에러 => IndexOutOfBoundsException
			// Q) 그럼 몇개가 들어있는지 모르는 상황에서는 어떻게 해?
		
		// A) .size()로 내부 요소 개수를 확인할 수 있다.
		System.out.println(list1.size());     // Q) list1 안에 몇 개 있니? A) 5개
		
		// .isEmpty()는 비어있는지 여부를 체크해줍니다.
		System.out.println(list1.isEmpty());  // Q) list1이 비어있니? A) false
		
		
		// 빈 리스트 list2를 만들어서 .isEmpty()와 .size()를 조회해주세요.
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list2.isEmpty());  // Q) list2가 비어있니?     A) true
		System.out.println(list2.size());     // Q) list2 안에 몇 개 있니? A) 0개
		
		
		
	}

}
