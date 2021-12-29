package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02_P458 {
		public static void main(String[] args) {
			
			// 식당 메뉴판을 만들어보세요.
			// Key는 음식 이름, Value는 가격(정수)로 저장해주세요.
			// 메뉴는 5개 이상 집어넣어주세요.
			// 메뉴를 3개 조회해서 화면에 출력해주세요.
			
			
			Map<String, Integer> menu = new HashMap<>();
				// <String, Object> 꺽쇠 안에 Object를 넣으면 다형성에 의해서 온갖 자료가 가능함.
				// 웹에서 많이 씀. 모든 자료형을 다 받을 수 있기 때문에 자료형이 바뀌더라도 저항성이 강하다.
				// 권장하지 않으신다고.
			
			menu.put("떡볶이", 3500);
			menu.put("새우볶음밥", 7000);
			menu.put("팟타이", 7000);
			menu.put("제육볶음", 8000);
			menu.put("치즈김치볶음밥", 6000);
			
			System.out.println("떡볶이 가격 : " + menu.get("떡볶이"));
			System.out.println("새우볶음밥 가격 : " + menu.get("새우볶음밥"));
			System.out.println("팟타이 가격 : " + menu.get("팟타이"));
			
			
			
			
		}

}
