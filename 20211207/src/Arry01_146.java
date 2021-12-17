import java.util.Arrays;

public class Arry01_146 {
	public static void main(String[] args) {   
		// 배열은 일반 변수와 달리 하나의 변수명에 여러 값을 입력할 수 있고
		// 자료형에 []를 붙이는 것으로 선언합니다.
		// 배열은 크기를 정해서 생성할수도 있고, 정하지 않고 생성할수도 있는데
		// 설정된 크기 이상으로 자료를 넣을 수 없습니다.
		// 배열의 크기(저장가능개수)는 "배열의 길이"라 표현합니다.
		// 배열명.length를 이용해 배열 크기를 알 수 있습니다.
		
		// 자바튜터에 넣고 돌려보세요
		
		// 배열의 선언1 (길이 확정되지 않음. 길이 제한 없음.)
			int a[] = {1, 2, 3, 4};  // a변수 하나에 값이 여럿 들어간다.
			System.out.println(Arrays.toString(a));
			
		// 배열의 선언 2 (길이 확정이 되지 않음)
			double[] b = {5, 6, 7, 8};  // b변수 하나에 값이 여럿 들어간다.
			System.out.println(Arrays.toString(b)); 
			
		// 배열의 '생성' (길이 확정시킬 수 있음.) // 자동으로 0이 채워진다.
			int[] c = new int[10];        // 10칸짜리 빈 배열 생성(0~9번까지 전부 0으로 '자동'으로 채워짐)
			System.out.println(Arrays.toString(c));
			
		// 배열의 길이는 .length로 알 수 있습니다. (힙의 개수가 몇개인지 확인해 줌)
			System.out.println(a.length);
			System.out.println(b.length);
			System.out.println(c.length);
			
		// arrys.toString
	
	}
}


// 4번의 main 영역이 시작되자 마자 스택에 영역이 생김. 4 ~ 33번 영역
// 