package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap01_P458 {
	public static void main(String[] args) {
		
		// ★ Map 인터페이스의 대표 구현체는 HashMap 입니다.
		// 제네릭 내부에는 <Key자료형, Value자료형>으로 작성합니다.
			// 파이썬에서는 딕셔너리라고 부름.
				// 사과를 찾으면 -> 무슨 모양, 무슨 색 ... 정보 나옴
				// 근데 무슨 모양, 무슨 색이 뭐지? -> 무엇인지 찾을 수 없음.
		
		
		Map<String, String> map = new HashMap<>();    // key도 String, Value도 String 이라는 뜻
		
		//        Key     Value
		map.put("코로나", "백신");
		map.put("고다은", "자바왕");
		map.put("점심", "새우볶음밥");
		
		System.out.println(map);  // 콘솔 결과 : {코로나=백신, 고다은=자바왕, 점심=새우볶음밥}
		
		
		// 자료 조회시는 .get(Key값)으로 조회합니다.
		// ★ map은 키로 밸류를 조회하는 것은 가능하지만, 역으로 밸류로 키를 조회하는 건 불가능합니다.
		// 없는 키 값으로 조회하면 null이 나온다.
		// 인덱스 번호도 없습니다.
		System.out.println(map.get("고다은"));   // Key   -> 콘솔 결과 : 자바왕
		System.out.println(map.get("자바왕"));   // Value -> 콘솔 결과 : null (그런 것 없음)

		
		// remove는 key를 이용해서 key = value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);  				// 콘솔 결과 : {고다은=자바왕, 점심=새우볶음밥}
		
		// .size()는 크기를 알려줍니다. 정수로 몇 개의 key = value 쌍이 저장되어 있는지 확인할 수 있습니다.
		System.out.println(map.size());         // 콘솔 결과 : 2
		
	}
}
