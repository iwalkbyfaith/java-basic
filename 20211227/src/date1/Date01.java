package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때 Date를 이용해 날짜 자료를 받아오거나 넘겨주는 것이 권장됩니다.
		// 사용시 import java.util.Date를 해야합니다.
		
		Date now = new Date();
		String strNow = now.toString();
		
		// 실행시 큰 차이는 없음.
		System.out.println(now);
		System.out.println(strNow);
		
		
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용합니다.
		// 1) import를 추가로 해야합니다. 컨트롤 + 스페이스를 활용해주세요.
		
		// 2) 사이에 양식을 넣어줘야 함.
		// yyyy = 연도, MM = 월, dd = 일, hh = 시, mm = 분, ss = 초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM"); 
				
		
		// 3) 원래 만들어졌던 Date를 .format()에 넣어줌
		String strNow1 = sdf.format(now); 
		System.out.println(strNow1);
		
		
		// (문제) now 변수에 들어있는 출력 양식을 2021년 12월 27일 aa시 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 기준시 : z");
		String strNow2 = sdf1.format(now);
		System.out.println(strNow2);
		
		
		
	}
	
	
}
