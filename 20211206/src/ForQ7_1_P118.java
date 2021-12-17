
public class ForQ7_1_P118 {
	public static void main(String[] args) {
		// ForQ7_P118 while로 한번 해 봄
		
		int i = 4;
		int j = 1;
		
		
		while(i > 0) {
			while(j <= i) {
				System.out.print("*");
				j += 1;
			}
			System.out.println();
			i -= 1;
			j = 1;
		}
	}
}
