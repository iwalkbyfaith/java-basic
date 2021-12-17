package inheritance;    // ● 정의부 ●

public class Person {
	
	
	// 사람이라면 공통적으로 가질 수 있는 속성 정의
		// 왜 private로 안하는지? => 처음부터 다 설명하면 이해하기 너무 어려울 것 같음.
	
	public String name;
	public int age;
		
	
	// getInfo() 이름은 name입니다. 나이는 age입니다라고 프린트
	
	public void getInfo() {
		System.out.println("이름은 " + name + "입니다. 나이는 "+ age + "입니다.");
	}
	

}
