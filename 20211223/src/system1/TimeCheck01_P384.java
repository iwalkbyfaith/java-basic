package system1;

public class TimeCheck01_P384 {
	public static void main(String[] args) {
		
		// currentTimeMills의 자료는 long형에 저장해야 합니다. (1000분의 1초)
		
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println("시작시간 " + start);      // 일반적으로 뜨는 시간이 아니고 ★'Unix 시간'으로 뜸
												   // 1970년 1월 1일 0시 0분부터 지난 시간을 말함.
												   // 밀리초니까 뒤부터 3자리는 없애고 확인해야됨.
												   // DB랑 컴퓨터에서는 유닉스 시간이 표준임.
		long all = 0;
		
		for(int i = 0; i < 2000000001; i++) {
			all += i;
		}
		System.out.println("1부터 20억까지 다 더하면 : " + all);
		
		// 끝나는 시점
		long end = System.currentTimeMillis();
		System.out.println("끝난 시간 : " + end);
		System.out.println("소요 시간 : " + (end - start));
		
		// 코드를 실행하는데 시간이 얼마나 걸리는지 측정할 수 있음.
		
	}
}
