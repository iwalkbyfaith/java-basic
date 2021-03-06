package overloading;     // ● 정의부 ●

public class Parttimer {
	
	
	// 파트타이머 정보
	// 오전 여부, 시급, 가게명, 본인 이름
	
	private boolean afternoon;  // true면 오후, false면 오전
	private int pay;            // 시급
	private String shopName;    // 가게명
	private String name;        // 본인 이름

	
	// 생성자 오버로딩은, 생성자를 여러개 오버로딩 형식으로 만드는 것입니다.
	// afternoon, pay, shopName, name을 모두 받는 생성자를 만들어주세요.
	// 접근 제한자는 public입니다.
	
		// p에 최저시급보다 적은 금액이 들어올 경우
		// 최저시급으로 강제로 보정하는 로직을 추가해주세요
		// ※ 선생님은 변수에 값을 입력받는 33번줄에 if로 처리하셨음. ※
			// if(p < 8720) {
			//		pay = 8720;
			//}else {
			//		pay = p;
			//}
		// 그렇게하면 sysout을 두 번 안 써도 되니까. 근데 자기 마음.
		// 지금 당장은 내 코드가 더 이해가 잘되지만 나중에 sysout쪽이 길어지면
		// 선생님이 작성한 코드처럼 하는게 맞는 것 같다.
	
	public Parttimer(boolean a, int p, String s, String n) {
		afternoon = a;
		pay = p;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		
		if(p < 8720) {
		pay = 8720;
		System.out.println("오후알바여부 : " + afternoon + 
						   ", 시급 : " + pay +
						   ", 가게명 : " + shopName +
						   ", 이름 : " + name);
		}else {
			System.out.println("오후알바여부 : " + afternoon + 
					   ", 시급 : " + pay +
					   ", 가게명 : " + shopName +
					   ", 이름 : " + name);	
		}
	}
	
	
	// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성 해주세요.
	// pay는 최저시급으로 넣어주세요.
	
	public Parttimer(boolean a, String s, String n) {
		afternoon = a;
		pay = 8720;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바여부 : " + afternoon +
						   ", 시급 : " + pay +
						   ", 가게명 : " + shopName +
						   ", 이름 : " + name);
		
	}
	
	
	

}
