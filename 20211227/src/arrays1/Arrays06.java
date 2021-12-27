package arrays1;

import java.util.Arrays;

public class Arrays06 {
	public static void main(String[] args) {
		
		// 유니코드를 활용하는 모든 문자
		// 이모지가 가장 마지막으로 소팅됨.
		String[] arr = {"왕만두", "王子", "高", "🤣🤣", "賢", "한자"};
		
		// 정렬
		Arrays.sort(arr);
		
		// 프린트
		System.out.println(Arrays.toString(arr));
		
		// 결과
		// [王子, 賢, 高, 왕만두, 한자, 🤣🤣]
		
		}
}
