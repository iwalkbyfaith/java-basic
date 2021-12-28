package arrays1;

import java.util.Arrays;

public class Arrays03 {
	public static void main(String[] args) {
		
		// Arrays.copyOfRange()는 copyOf()와 유사하지만
		// 시작이 0번 인덱스로 고정되는 copyOf()와 달리
		// copyOfRange(시작번호, 끝번호+1); ((끝번호보다 1 커야 끝번호가 잡힌다.))
		// 와 같이 시작지점과 끝지점을 둘 다 정해줄 수 있습니다.
		
		int[]arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] arrCopy = Arrays.copyOfRange(arr, 3, 7);      // 3~6 (3, 4, 5, 6)
		System.out.println(Arrays.toString(arrCopy));
		
		
		// 이것도 범위를 벗어나게 해보자
		int[] arrCopy2 = Arrays.copyOfRange(arr, 8, 13);
		System.out.println(Arrays.toString(arrCopy2));
		
		
		
	}

}
