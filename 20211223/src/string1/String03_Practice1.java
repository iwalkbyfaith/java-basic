package string1;

public class String03_Practice1 {
	// Scanner를 통해서 전체 문장을 입력 받으세요. (뭐가 들어올지 모름)
	// 다음으로 문장 내에서 찾고 싶은 단어를 추가로 입력 받으세요.
	// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
	// 출력해주는 코드를 작성해보세요.
	
	public static void main(String[] args) {
		
	
	String sentence = "banana chacha banana chacha";
	String searchVoca = "na";
	int idx = 0;
	int count = 1;
	
	while(true) {
	int get = sentence.indexOf(searchVoca, idx);
	if(get == -1) {
		System.out.println("더 이상 찾을 수 없습니다.");
		return;
	}else {
		System.out.println(searchVoca+"의 "+count +"번째 인덱스 번호는 "+ get + "번 입니다.");
		
		idx = get + 1;
		count ++;
	}
	}
	
	}
}
