package overrideing;    // ● 정의부 ● (Animal 상속)

public class Dog extends Animal{
	
	public String race; //품종
	
	// 오버라이딩 요건
	// 이름과 리턴 자료형 등이 같은 부모쪽 메서드를 중복해서 작성함.
	// 12번에 녹색 세모 => overrides overrideing.Animal.howl
			// Animal의 howl을 재정의하고 있다는 뜻.
	
	public void howl() {
		System.out.println("멍멍");
	}

	public void getInfo() {
		System.out.println("이름 : " + name + 
				   ", 털 색 : " + color + 
				   ", 나이 : " + age +
				   ", 품종 : " + race);
	}
}
