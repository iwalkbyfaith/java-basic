package thiskeyword;

public class Main01_P224 {
	public static void main(String[] args) {
		
		
		// Person 두 명 생성해 보시되
		// 생성시 지역간 데이터 교환을 염두에 두고 확인해가면서 생성해보세요.
		// 생성된 Person은 getInfo()를 실행합니다.
		// ★ new Person(); 괄호 안에 값을 넣기 전에 컨트롤 + 스페이스 + 더블클릭
		
		Person p1 = new Person("가가", 1, 1000, "경영");
		p1.getInfo();
		
		Person p2 = new Person("나나", 2, 2000, "언론");
		p2.getInfo(); 
		
		
		
	}
}
