package constructor;    // ● 실행부 ●

public class Main03_P204 {
	public static void main(String[] args) {
		Webtoon w1 = new Webtoon("소녀의세계", "모랑지");
		w1.getInfo();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.completeWebtoon();
		w1.getInfo();
		
		Webtoon w2 = new Webtoon("독립일기", "자까");
		w2.getInfo();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.completeWebtoon();
		w2.getInfo();
	}

}
