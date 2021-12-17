import java.util.Arrays;

public class EnhancedFor_P162 {
	public static void main(String[] args) {
		// ★★★★★★★★★★★★향상된 for문★★★★★★★★★★★★★
		
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복 실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		// 7개의 요소를 묶어서 arr1에 저장
		int[] arr1 = { 100, 211, 339, 475, 591, 600, 700 };
			// (예습) []는 '하나 이상을 저장하겠다'라는 의미
		
		
		// arr1[순번]을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
		System.out.println(arr1[5]);
		
		// System.out.println(arr1);
			// 이렇게만 쓰면 내부에 있는 요소들 전체를 보여주지 않음.
		System.out.println(Arrays.toString(arr1));
			// 이렇게하면 나옴.
		
	// 문법
	// for(하나씩받을변수 : 배열){
	//     실행문들...;
	// }
		
	for(int item: arr1) {
		System.out.println(item);
	}
	
	// arr1에 들어있는 요소만큼 바퀴를 돔.
	// 첫번째 바퀴는 순번 0번 소모 => 100 찍힘
	// 두번째 바퀴는 순번 1번 소모 => 211 찍힘
	// 세번째 바퀴는 순번 2번 소모 => 339 찍힘
	// n번째 바퀴는 . . .
	// 한 번 소모된 아이템은 사용할 수 없다.
	
	
	// 배열 내부 요소의 개수는 배열명.length로 확인할 수 있다.
	System.out.println("배열 내부 요소 갯수?");
	System.out.println(arr1.length);
	
	
	// ~~~~~향상된 for문이 나오기전에는 이렇게 처리했었음 ~~~~~~ (결과적으로는 같음)
		for(int i = 0; i <7; i++) {           // i -> 0 ~ 6
			System.out.println(arr1[i]);      // arr1[0] , arr1[1] . . . arr1[6]
		}
		// 단점 : arr1에 새로운 요소를 추가한 경우에 (7 -> 8개) 이미 범위를 적어놨기 때문에 업데이트가 안됨.
		//       아이템이 추가되거나 누락될 때 두군데를 동시에 고쳐야 함.(1. 추가된 요소 2. 범위(38번))
		// 배열명.length를 사용해서 내부 요소의 갯수를 대신해서 쓸 수 있다 => 수정된 수를 바로 반영할 수 있음.
			// for(int i = 0; i < arr1.length; i++) {           
			// System.out.println(arr1[i]);
	
	
		
		
		
	}
}
