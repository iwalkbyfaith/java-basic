package structure;

public class PersonClass {
	// 사람 정보를 Person에서 만들었던 것처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
	
	public String name;
	public int age;
	public String pNum;
	public int uNum;
	public String favorite;
	
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static을 적지 않습니다.
	// ★ 클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	
	public void getinfo() {   // getPersonInfo라고 하지 않은 이유도 설명해 주실거라고 하심. // getinfo() 소괄호 안에 왜 없을까?
		System.out.println(name + "의 정보를 조회합니다.");  // 왜 p.name이 아닐까? 생각해보기
		System.out.println("이름 : " + name +
							", 나이 : " + age + 
							", 연락처 : " + pNum + 
							", 유저 번호 : " + uNum + 
							", 좋아하는 것 : " + favorite);  // 더하기 다음 부분을 기준으로 엔터쳐도 에러가 나지 않음.
		System.out.println("==========================================");
	}
	
	
}
// main쪽에 작성하냐 PersonClass쪽에 작성하냐의 차이.

// PersonClass지역 내부에 getInfo 지역이 있는 것.
// PersonClass지역 내부에 name, age, pNum, uNum, favorite, getinfo 가 있는 것. => 다 같은 소속임. 매서드까지 같은 소속이 됨.
//		-> '힙'안에 getinfo자리까지 총 6개 그려주어야 함. 메서드임을 나타내기위해 "getInfo()" 이렇게 만듦.
//	    선생님은 public boolean glasses 만드셨고 얘는 힙 안에서 기본으로 false가 들어간다.
// 같은 반(8반) 친구를 8반 다은아라고 부르지 않듯이 (물론 8반 다은아라고 불러도 되긴 함)
// 같은 동네 있기 때문에 p.name이 아니라 그냥 name이라고 불러도 되는것임. (우선순위가 가장 높게 되기 때문에. 자기랑 가장 가까운 곳부터 호출/필터링 함.)
// getinfo에서 name을 호출하면 자기랑 같은 소속인 PersonClass지역 내부에 있는 name을 호출한다는 것. (get info : '내가 name이라는 애를 가지고 있던가?' 같은 소속인지 확인)

// Q) 그럼 왜 다른 곳에서는 그렇게 안 했을ㄱ까?
// A) Structure02_190.java 파일 안의 getinfo 소속은 <Structure02_190 지역>임. 얘는 Person이랑 소속이 다르다. 
//    소속이 다르니까 name을 나타낼때 어느 소속의 name인지를 반드시 밝혀주어야 함.(왜냐면 cat도 name 있으니까)



