package overrideing;    // ● 정의부 ● (Animal 상속)

public class Cat extends Animal{
	
	public String owner;   // 주인이름
	
	public void howl() {
		System.out.println("야옹");
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + 
				   ", 털 색 : " + color + 
				   ", 나이 : " + age +
				   ", 주인 이름 : " + owner);
	}

}
