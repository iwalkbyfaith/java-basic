package collection1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01_P447 {
	public static void main(String[] args) {
		
		// ★ LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있습니다. (안 변할때는 안 써도 됨)
		// 일반적인 상황에서는 ArrayList를 더 많이 쓰고
		// 결과적으로는 양 자료형간 사용법 차이는 없고 로직만 다릅니다. (기능 완전 똑같애. 기능이 구현되는 과정만 차이가 있음.)
		
		
		List<String> list1 = new LinkedList<>();
		
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스트링부트");
		
		System.out.println(list1);  // => ArrayList랑 기능 똑같음. 그럼 무엇이 다르냐?
		
		
		// .remove()는 두 유형이 있습니다.
			// .remove(번호) => 해당 인덱스의 자료 삭제
			// .remove("자료") => 번호와 상관없이 자료를 삭제
		
		list1.remove(0);           // 0번 인덱스의 "자바" 삭제
		System.out.println(list1);
		
		list1.remove("스프링");     // 1번 인덱스의 "스프링" 삭제
		System.out.println(list1);
		
		// 리스트를 전체적으로 비우고 싶을때는 .clear()를 사용
		list1.clear();
		System.out.println(list1);
		
		// 4개 자료 아무거나 추가하기
		list1.add("감자");
		list1.add("맛탕");
		list1.add("고구마");
		list1.add("튀김");
		
		// 자료 정렬은 Collections.sort(정렬대상) 입니다.
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		
		
			
		
		// ArrayList (=순차 리스트)
		// 빈 공간이 없음.(무조건) 인덱스 0을 삭제하면 뒤에서 땡겨옴. 마지막 공간 한 칸(비어진 칸)은 삭제됨.
		// 장점 : 공간이 타이트하게, 딱 필요한 만큼만 들어간다. 자료 절약됨(Integer로 만들었을때 숫자 하나에 번지수 4개씩 할당. 4바이트니까)
		// 단점 : 데이터가 10만개가 있다고 했을때, 0번 데이터를 삭제할때 횟수로 99999번 데이터를 앞으로 땡겨줘야함)
		// 자기 자신(값)과 인덱스번호가 있음.
		
		
		// LinkedList
		// 단점 : 데이터가 몇번지에 배정될지 모르기 때문에 비효율적으로 저장, 자료만 저장하는게 아니라 자료랑 번지수를 같이 저장해야해서 차지하는 공간이 큼
		// 장점 : 삭제나 변경이 빈번한 경우, 중간에 연결을 끊고서 새로 연결만 해주면 됨. 데이터 전체적으로 유지되면서 수정이 가능함.
			// 인덱스를 넣으면 성능이 반감된다.(ArrayList랑 다를바가 없어짐) => 인덱스 번호가 들어오지 않는게 좋다. => 자기자신(값)과 번지수만 있음
			// sysout(list1.get(1)) -> 인덱스 번호로 조회가 되긴 됨(원론적으로 봤을때는 되면 안됨) 
	}

}
