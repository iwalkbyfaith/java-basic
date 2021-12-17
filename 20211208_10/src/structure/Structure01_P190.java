package structure;   // ● 실행부 ●

public class Structure01_P190 {// 유튜브 동영상 <210621구조체>
	public static void main(String[] args) {
		
		// 이제부터는 실행 코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java 파일에 저장합니다.
		// 커스텀 디자인 자료형은 (ex. int, double같은거 말고)
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		// 같은 폴더에 있기 때문에(1번 줄 확인) Person 가져다 쓸 수 있음.
		
		Person p1 = new Person();    // <- ★ 오른쪽 먼저 실행.
									// new person() = '힙에다가 새로운 양식으로 person을 생성해라'라는 뜻
		
		// System.out.println(p1);		
		// p1 내부에 정의한 변수를 
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		
		p1.name = "고다은";
		System.out.println(p1.name);
		p1.age = 20;
		System.out.println(p1.age);
		p1.pNum = "01072460755";
		System.out.println(p1.pNum);
		p1.uNum = 10001;
		System.out.println(p1.uNum);    // ★ 이렇게 저장된 데이터는 p1에 모여 다닌다(찾아 쓰기 편함)
		
		
		// 또 다른 사람을 하나 만들어봅시다.
		Person p2 = new Person(); 
		p2.name = "고조선";
		System.out.println(p2.name);
		p2.age = 21;
		System.out.println(p2.age);
		p2.pNum = "01001010101";
		System.out.println(p2.pNum);
		p2.uNum = 223;
		System.out.println(p2.uNum);
		
		// 3번째
		Person p3 = new Person();
		p3.name = "고구마";
		System.out.println(p3.name);
		p3.age = 223;
		System.out.println(p3.age);
		p3.pNum = "01012123434";
		System.out.println(p3.pNum);
		p3.uNum = 337;
		System.out.println(p3.uNum);
		
	}
}




// 밑의 설명 숫자 알아서 다시 수정하기.

// p1은 변수 하나에 4개를 저장할 수 있음(name, age, pNum, uNum)

// 12번-> 스택의 main지역 안의 p1에 주소를 넣어줌 ex)379619aa
// -> 힙에는 379619aa번지에 name, age, pNum, uNum 공간이 생김.
// 18번이 생기면서 힙의 name에 "고다은"이 들어가는 것.
// pNum = 문자 => null이 자동으로
// uNum = 숫자 => 0이 자동으로

// 새로운 사람을 만들면
// 힙 안에 다른 번지가 생기고 또 네개의 정보가 생김.
// name, pNum = null(초기값) / age, uNum = 0 (초기값)
// 그리고 작성한 코드의 값들을 힙 안의 공간에 넣어줌.

// ★★★★ p1과 p2는 독립적인 관계(스택의 main지역 안에서 따로 논다는 말.) ★★★

// 구조체 단점 : 10시 23분 캡쳐
//			   사람에 대한 정보는 양식화시켜서 조회할 수 있지만 프린트로 괄호 안에 찍어줘야하는 내용이 복잡하다. (길어지니까 가독성이..)
//			   그 사람들이 만명, 이만명.. 점점 많아진다면?
//  => (고민) 양식을 보여주는 내용을 같이 묶어서 가져가면 편하지 않을까?
//  => (해결) Structure02_190 확인 (매서드 활용)