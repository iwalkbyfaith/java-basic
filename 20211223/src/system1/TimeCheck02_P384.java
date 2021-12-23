package system1;

public class TimeCheck02_P384 {
	public static void main(String[] args) {
		// try ~ catch 구문의 소요시간을 구해주세요.
		// 내부에는 여러분들이 원하는 속성의 예외를 발생시키세요. throw로 발생시키면 됩니다.
		
		// 시작
		long start = System.currentTimeMillis();
		System.out.println(start + "에 시작했음.");
		
		
		int randomNum = (int)(Math.random() * 5);
		System.out.println("난수의 값 : " + randomNum);

		
		try {
			if(randomNum >= 2 ) {
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("이 난수는 2보다 작습니다.");
			}
		}catch(Exception e) {
			System.out.println("2보다 크면 예외로 만듭니다.");
			e.printStackTrace();
		}
		
		//끝
		long end = System.currentTimeMillis();
		System.out.println(end + "에 끝났음.");
		System.out.println((end - start) + "만큼의 시간이 소요 되었음.");
		
		
	}
}
