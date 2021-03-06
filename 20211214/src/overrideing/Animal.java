package overrideing;   // ● 정의부 ●

public class Animal {
	
	// 특성 3가지
	public String name;     // 이름
	public String color;    // 색
	public int age;         // 나이
	
	
	// 메서드 울기 howl()을 가지고 내부에는 sysout"동물이 웁니다."
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	
	// 동물의 정보를 보여주는 getInfo()
	// 자식 동물에게도 오버라이딩 이용해서 getInfo() 재정의해 추가된 특성까지 보여주도록
	
	public void getInfo() {
		System.out.println("이름 : " + name + 
						   ", 털 색 : " + color + 
						   ", 나이 : " + age);
	}
	
	// Q. howl()과 getInfo() 자체를 자식쪽에만 만들어도 되는데 왜 굳이 부모쪽에도 만드는 걸까? 
	//    고민해보자. (당연히 이유가 있음)
	
}
