package garbagecollection;  // ● 실행부 ●

public class Main_P201 {
	
	public static void main(String[] args) {
		// 6개 객체 생성
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		
		// 메모리 중간에 회수하도록 강제 명령
		System.gc();
			// 원래도 주기적으로 도는데
			// garbage collection이 판단하는 순간(얘는 System.gc랑 다른 느낌)
				// 메인지역의 i2 와 힙의 200번지가 연결이 끊겨있음-> 200번지 데이터가 호출될 방법이 없다 -> 삭제함
				// 전체적으로 스캔해서 필요 없는거 삭제 (= 힙을 한번 뒤져서 삭제해라)
				// 찝어서 하는게 아니라 랜덤한 영역만 돌아가면서 일부분씩 조회하는 것(다 조회하는 것은 비효율적이니까)
				// 전체적으로 칼같이 잡는 개념이 아님. 만약 그랬다면 2객체가 3번과 4번 사이에 삭제 되어야 했을 것.
				// 그리고 돌릴때마다 콘솔에 찍히는게 계속 달라짐. => 랜덤하게 삭제된다는 뜻
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		System.gc();
		Item i6 = new Item(6);
		
		
	}
}
