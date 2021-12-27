package string1;

public class String04_P399 {
	public static void main(String[] args) {
		
		// length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동박삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		// replace는 찾아바꾸기 입니다.
		// .replace("찾을단어", "바꿔줄 단어");
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수입니다.";
		
		// report 자체가 변경되지 않으므로, 저장(좌변에 대입!!)까지 해줘야한다.
		report = report.replace("김영수", "고다은");    // => 안녕하세요. 리포트 보고자는 고다은, 고다은입니다.
		
		// (주의!) 위처럼 안하고 report의 변경사항을 저장하지 않는다면.. (좌변 대입 없을시)
		// 이 경우는 String report에서 바꾸기는 하는데 원본에는 반영이 안되는 경우임.(일시적 바꿈)
		report.replace("김영수", "고다은");           // => 안녕하세요. 리포트 보고자는 김영수, 김영수입니다.
		
		System.out.println(report); 
		
	}
}
