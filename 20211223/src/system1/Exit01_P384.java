package system1;

public class Exit01_P384 {
	public static void main(String[] args) {
		
		// System.exit()은 break문처럼 실행 즉시 프로그램 자체를 강제로 종료합니다.
		System.out.println("실행중1");
		System.out.println("실행중2");
		System.out.println("실행중3");
		System.out.println("실행중4");
		
		// 0 : 정상종료(에러발생 X), 0이외 : 비정상종료(에러발생 O)
		System.exit(-1);
		System.out.println("실행중5");
		System.out.println("실행중6");
		
		// 원래는 비정상종료시 에러 나는데 요즘에 바뀌었나봄.
	}

}
