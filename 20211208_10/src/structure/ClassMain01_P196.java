package structure;

public class ClassMain01_P196 {
	// PersonClass의 메서드는 작성할 필요가 없다.
	// 이미 PersonClass의 내부에 필요한 메서드를 다 작성해놨기 때문입니다.
	
	public static                                         void main(String[] args) {
		// 사람을 두명 만들어보세요.
		
		PersonClass a = new PersonClass();
		a.name = "가가";
		a.age = 111;
		a.pNum = "01012345677";
		a.uNum = 1;
		a.favorite = "떡볶이";
		
		PersonClass b = new PersonClass();
		b.name = "나나";
		b.age = 222;
		b.pNum = "01056567878";
		b.uNum = 2;
		b.favorite = "수영";		
		
		
		// 만든 사람 두명의 정보를 콘솔에 찍어보세요.
		// 힌트 getInfo의 소속은? => ex) 그냥 getinfo가 아니라 100번지(a)에 소속된 getinfo임. 메서드도 소속이 생김.
		//	   a와 b는 각각 getinfo를 가지고 있음.
		//     힙에는 100번지의 지역과 200번지의 지역이 있는 것. 100번지의 getInfo()는 200번지에 관여 할 수 X
		// Q. 왜 getPersonInfo라고 안하고 getInfo라고 했는지 생각해보기.
		
		a.getinfo();
		b.getinfo();
		
	}
	
}
