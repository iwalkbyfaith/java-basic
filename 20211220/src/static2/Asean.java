package static2;

public class Asean {
	// 출석(check), 중간고사(midTerm), 기말고사(finalTerm)을 변수로 설정해주세요.
	// 이 변수들은 개별 객체가 따로따로 관리하는 변수들입니다.
	private int check;
	private int midTerm;
	private int finalTerm;
	
	// 공용 발표 점수인 presentationScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
		
	// public으로 설정하면 바로 sysout()으로 조회 가능하고
		//public static int presentationScore = 19;
	// private인 경우는 오로지 static 메서드를 통해서만 조회할 수 있습니다.
		private static int presentationScore = 19;
		// 이렇게 쓰면 private으로 만든 멤버 변수와 다를바 없음.
		// new 키워드 없이도 쓸 수 있다는 장점이 사라짐.
		// ==> static이 걸려있는 getter로 처리해야함.
		// 근데.. 굳이 static 영역에 만드는 이유가 없음
	
	
	
	// 생성자는 객체 생성시 출석, 중간, 기말 점수만 받아서 초기화합니다.
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	
	// 일반 메서드로 showAseanInfo()를 생성해주시되 성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : x점, 기말고사 : y점 . . . .
	public void showAseanInfo() { // 개별의 점수를 알고 싶다면
		System.out.println("출석 점수 : " + this.check +
				           ", 발표 점수 : " + presentationScore +
						   ", 중간 고사 : " + this.midTerm +
						   ", 기말 고사 : " + this.finalTerm);
	}
	
	
	// 위 요소 정의 후 Main01.java를 생성해서 구성원 4명을 만들어서 활용해보세요.
	
	// private static은 같은 static 영역에서 접근하도록 만들어야 합니다.
	public static void showPre() {  // 일종의 getter
		System.out.println("ASEAN조의 발표 점수는 : " + presentationScore);
	}
}
