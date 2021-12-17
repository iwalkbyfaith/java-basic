package garbagecollection;  // ● 정의부 ●

public class Item {
	
	public int num;
	
	public Item(int n) {
		num = n;
		System.out.println(num + "번 객체 생성.");
	
	}

	// 소멸자 finalize()
	// 생성자는 객체가 생성될 때 반드시 호출되고
	// 소멸자는 객체가 소멸될 때 호출됩니다.
	
	protected void finalize() {					// 17번 라인 숫자 왼쪽에 초록색 세모가 생기면 된것.
		System.out.println(num + "객체 삭제.");
	}
		// 원래는 아무 메세지도 안 뜨는데 확인하려고 일부러 프린트하게 호출한거임
	
}
