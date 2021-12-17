package structure;  //  ● 실행부 ●

public class Structure02_190 {
	
	// person 내부의 정보를 쉽게 조회하기 위한 매서드 생성
	public static void getinfo(Person p) {
		System.out.println(p.name + "의 정보입니다.");
		System.out.println("이름 : " + p.name + "/ 나이 : " + p.age + "/ 연락처 : " + p.pNum + "/ 유저 번호 : " + p.uNum);
	}
	
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요(a, b)
		
		Person a = new Person();
		
		a.name = "유산균";
		a.age = 2;
		a.pNum = "01000100010";
		a.uNum = 123;
		

		
		Person b = new Person();
		
		b.name = "배고파";
		b.age = 23;
		b.pNum = "01012341234";
		b.uNum = 456;
		
		getinfo(a);  // a의 주소값을 getinfo의 p에 전달.
		getinfo(b);
				
	}

}
