package overloading;    // ● 실행부 ●

public class Main02 {
	public static void main(String[] args) {
		
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		Parttimer p1 = new Parttimer(true, 15000, "투썸", "다은");
		
		Parttimer p2 = new Parttimer(false, "스타벅스", "지민");
		
		
		// p에 최저시급보다 적은 금액이 들어올 경우
		// 최저시급으로 강제로 보정하는 로직을 추가해주세요
		
		Parttimer p3 = new Parttimer(true, 3200, "투썸", "가은");
		Parttimer p4 = new Parttimer(true, -1200, "스벅", "나은");
	}

}
