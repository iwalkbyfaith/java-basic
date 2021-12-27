package math1;

public class Math04_P480 {
	public static void main(String[] args) {
		
		// Math.random()은 0이상 1 미만인 난수를 구해줍니다. (1은 안나와!!)
		
		double a = Math.random();
		System.out.println(a);
		
		
		// 게임을 만들 때, 50% 확률로 강화 성공을 만들고 싶으면
		if(Math.random() > 0.5) {
			System.out.println("강화에 성공했습니다.");
		}else {
			System.out.println("강화에 실패했습니다.");
		}
		
		
		// 범위를 제한하고 싶은 경우 ( 0이상 6미만 )
		int b = (int)(Math.random() * 6);
			// 5.999999999~ 까지 밖에 안 나옴.
			// 이것을 int로 바꾸면 당연히 5까지 나옴.
		System.out.println(b);
		
	}

}
