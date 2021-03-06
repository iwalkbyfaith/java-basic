package heapmemory;  // 문자열에서 처리하는 경우(특수) // 자바 튜터로 돌려봐

public class Stringcomparison {
	public static void main(String[] args) {
		// 문자열은 같은 문자로 저장시 같은 주소를 공유합니다. (애초에 변경 자체가 안되니까 같은 주소를 줘도 상관 없는 것.)
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "Hallo";
		
	
		
		// 일반 변수의 배정 값 조회시 .hashCode()를 씁니다.
		// 대략적인 주소값을 볼 수 있음
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		// 주소가 똑같음.
			// 문자열은 같은 값이면 주소를 돌려씀.
			// 왜냐하면 문자열은 일부분만 변경할 수 없음.
		//	str1[0] = "Q";   => 변경이 안된다 = 독립적으로 관리할 필요가 없다.(참조사항이 절대 안바뀐다는 보장이 있으니까. 따로 저장하면 메모리 낭비.)
		//					 => 일반 배열 같은 경우는 변경이 되니까 다른 배열까지 영향을 주지 않기 위해 독립적으로 관리해야한다.
		// The type of the expression must be an array type but it resolved to String
			
		
		
		//★★★★★  str1 == str2와 같이 비교하는 것은 문자열 비교가 아니고 '주소비교'입니다. ★★★★★
		System.out.println(new String("Hello"));           // => 힙에 새로운 Hello를 만들겠다1 => 스택과 연결되어 있지 않아서 
		System.out.println(str1 == new String("Hello"));   // => 힙에 새로운 Hello를 만들겠다2    garbage collection 만들면 사라질 애들
		System.out.println(str1 == str2);
				// 문자가 똑같아서 뜨는게 아니라 주소값이 같은 것임.
				// ★ new 키워드로 생성시 내용이 같은 문자열도 별개의 공간을 새로 배정해 만듭니다. ★
		
		
		
		// 하지만 우리가 보통 비교할 때 주소를 비교하고 싶어하진 않음. 그 안의 내용이 같은지 다른지 궁금한거지.
		// ★★★★★★문자열간 비교는(주소 말고 내용물간 비교) => .equals()로 진행합니다.★★★★★★
		
		System.out.println(str1.equals(new String("Hello")));
			// 웹페이지 비밀번호가 맞는지 아닌지 확인할 때. db에 있는거랑 사용자가 가지고 있는 것과 비교할때
	}
}
