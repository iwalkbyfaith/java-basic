package casting;  // instance of

public class Main02 {
	public static void main(String[] args) {
		
		// Animal로 Cat을 받아서 생성
		Animal c1 = new Cat("퐁구", 2);
		
		// c1 변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(c1 instanceof Cat);
			// Cat으로 만든게 맞으니까 true
		
		System.out.println(c1 instanceof Dog);
			// Dog가 아니니까 false
		
		System.out.println(c1 instanceof Animal);
			// + 내부에 Animal을 포함하고 있기 때문에 true로 나옴.
		
	}
}
