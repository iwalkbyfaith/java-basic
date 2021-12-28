package calendar1;

import java.util.Calendar;

public class Calendar01_P470 {
	public static void main(String[] args) {
		
		// Calendar는 현재 시간을 일반 시간이 아닌 요일, 오전/오후 등으로
		// 달력 기준으로 표기해주는 방식입니다.
		
		// 자바에서도 많이 쓰지만, 자바스크립트에서 웹으로 넘어갈 때도 많이 씀.
		
		// Calendar.getInstance();를 이용해 사용합니다.
		// 추상 클래스이므로 new 키워드를 쓸 수 없습니다.
		
		// 컨트롤 + 왼쪽 클릭으로 가서 내부구조도 보고 오자
		
		
		// 순서 1. Calendar 타입의 변수 now를 만든다.
		Calendar now = Calendar.getInstance();
		
		// 순서 2. now.get(Calendar.얻고싶은정보);를 이용해 정보를 얻어온다.
		System.out.println("년도 : " + now.get(Calendar.YEAR));
		
		
		
		// ※ 월은 0부터 시작한다 (0 = 1월, ... , 11 = 12월)
		System.out.println("월 : " + now.get(Calendar.MONTH));  // 12월인데 11월 나옴
		
		// 일은 멀쩡 
		System.out.println("일 : " + now.get(Calendar.DAY_OF_MONTH));
		
		// 요일 ( 1 = 일, 7 = 토.) 0이 없음
		System.out.println("요일 : " + now.get(Calendar.DAY_OF_WEEK));
		
		// 오전 오후 (0 = 오전, 1 = 오후)
		System.out.println("오전, 오후 여부 : " + now.get(Calendar.AM_PM));
		
		// 시, 분, 초
		System.out.println("시 : " + now.get(Calendar.HOUR));
		System.out.println("분 : " + now.get(Calendar.MINUTE));
		System.out.println("초 : " + now.get(Calendar.SECOND));
		
	}
}
