package static2;

public class Main01_P276 {
	public static void main(String[] args) {
		
		// Asean 조원 생성 없이도 팀 점수는 'public'으로 처리된 경우 바로 조회 가능
			// System.out.println(Asean.presentationScore);
		
		Asean a1 = new Asean(20, 30, 30);
//		Asean a2 = new Asean(19, 10, 10);
//		Asean a3 = new Asean(10, 30, 21);
//		Asean a4 = new Asean(10, 20, 30);
//		
//		a1.showAseanInfo();
//		a2.showAseanInfo();
//		a3.showAseanInfo();
//		a4.showAseanInfo();
		
		Asean.showPre();  // 발표점수가 private인경우 new로 생성 없이 볼 수 있음
		a1.showPre();     // 이 메서드를 개인이 쓸 수 있다.
		
	}
}
