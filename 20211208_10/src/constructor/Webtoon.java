package constructor;    // ● 정의부 ●
public class Webtoon {
	
	// 멤버 변수
	public String name;       // 제목
	public int series; 		  // 회차
	public String painter;    // 작가
	public boolean complete;  // 완결여부
		
	// 생성자에는 위 name, painter 정보를 입력 받도록 해주시고
	// complete는 처음 생성시 false, series는 1로 자동으로 입력됩니다.
	public Webtoon(String n, String p){
		name = n;
		painter = p;
		series = 1;
		complete = false;
	}
	
	// 웹툰 정보 안내하기 메서드 getInfo()
	public void getInfo() {
		System.out.println("제목은 " + name + 
				           ", 회차는" + series + 
				           ", 작가는 " + painter + 
				           ", 완결 여부는 " + complete);
	}
	
	// 웹툰 업로드하기 uploadWebtoon() => 시리즈를 1증가
	public void uploadWebtoon() {
		series += 1;
	}

	// 웹툰 완결짓기 completeWebtoon() => complete변수를 true로 변경
	public void completeWebtoon() {
		complete = true;
	}
	
}
