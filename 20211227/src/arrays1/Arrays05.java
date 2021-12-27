package arrays1;

import java.util.Arrays;

public class Arrays05 {
	public static void main(String[] args) {
		
		//sort는 숫자뿐만 아니라 순번을 정할 수 있는 다른 자료형에도 작동합니다.
		// 이를테면 문자 (A = 65, a = 97)도 대응하는 숫자를 가지기 때문에 문자도 정렬이 가능하다.
		// 아스키코드 규칙에 따라 정렬됩니다.
		
		// 문자열은 맨 앞글자의 ASCII코드 번호의 대소관계를 이용해 정렬됩니다.
			// 몇 글자인지, 글자들의 총 합이 무엇인지 중요하지 않음.
		
		String[] arr = {"apple", "Apple", "banana", "giraffe", "Zet", "가나다라", "하하하", "자이로"};
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 콘솔 결과 : [Apple, Zet, apple, banana, giraffe, 가나다라, 자이로, 하하하]
		// 65, 90, 97, 98, 103 ...
		// 한글은 유니코드 체계를 따르기 때문에 2바이트
		
		// 코테 풀 때 필요한 개념.
		
		
		
		
	}
}
