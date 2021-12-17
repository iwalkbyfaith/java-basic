package heapmemory;  // 일반배열에서 처리하는 경우

import java.util.Arrays;

public class ArrayComparison {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;                // ★ arr1의 배열이 들어가는 것이 아니라 arr1의 주소값이 들어가는 것임.
		int[] arr3 = {1, 2, 3, 4, 5};
		arr1[0] = 10;					  // arr2[0] = 10; 을 입력해도 같은 결과값이 나옴.어차피 하나의 주소값이니까.
		System.out.println(arr1[0]);      // =>[I@156643d4의 0번째를 보여달라
		System.out.println(arr2[0]);      // =>[I@156643d4의 0번째를 보여달라.
		System.out.println(arr3[0]);
		
		// 그냥 출력하면 주소값이 나옴. => arr1의 주소와 arr2의 주소가 같음.
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
	
		
		// 주소에 접근했을 때 나오는 자료 조회시
		// Arrays.toString(자료);로 조회합니다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
	}
}
