package final2;

public class Main01_P276 {
	public static void main(String[] args) {
		// final변수를 쓰기 위한 조건
		// 1. Country라는 소속을 써줘야함.
		// 2. .상수명 을 적어서 Country에 소속된 상수들을 호출함.
			System.out.println(Country.KOREA);
			System.out.println(Country.CANADA);
			System.out.println(Country.CHINA);
			System.out.println(Country.STATES);
			
				// main 내부에서 이 값들을 실수로 고칠 일이 없어짐.
			
		// 값 재할당 불가
			// Country.KOREA = 1003; => 에러
		
		// Math(수학) 18번의 Math 눌러서 어떻게 static final이 미리 만들어져있는지 확인해보자
			System.out.println(Math.PI);
				// static final을 쓰는 것은 보편적으로 쓰이는 법칙 같은 것들을 카테고라이징하기 위해 쓴다고 보면 됨.
			
			
	}
}
