package inheritance;      // ● 정의부 ● (Person의 상속)


// 상속 문법
// 클래스 명칭 오른쪽에 <extends 부모클래스이름>을 적습니다.
// 이렇게 상속한 클래스는 부모, 자식클래스가 하나의 객체 내부에
// ★ 공존하는 형태로 메모리에 생성됩니다.

// 현실에서는 부모가 자식을 선택해 상속하지만 자바에서는 자식이 부모를 선택함. (방향성이 반대)

public class Student extends Person{

	// name, age와
	// getInfo()는 자동으로 작성됩니다. (내가 안 적었지만 기입이 된 것으로 간주.)
	
	// 공통속성(이름, 나이)이 아닌 학생만의 개별적 특성 정의
	public int stuNum;  // 학번
	
	public void getStudentInfo() {
		System.out.println("이름 : " + name + 
						   ", 나이 : " + age + 
						   ", 학번 : " + stuNum);
	}
	
	
}
