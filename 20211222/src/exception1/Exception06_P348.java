package exception1;

public class Exception06_P348 {
	public static void main(String[] args) {
		
		// 예외 발생 케이스 5	
			// 상속 관계가 있는 자료는 부모가 동일하다면  
			// 논리적으로는 부모자료형이 어떤 형태로든 자식 자료형을 가질 수 있기 때문에 부모 자료형에서 어떤 자료형으로도 형 변환이 가능하다.
			// 그러나 그것이 반드시 작동됨을 보장하지는 않는다.
			// Object 자료형은 자바 모든 클래스의 부모 클래스이다.
		
			String str = "3";				  // 배열과 문자열은 힙에 들어감.
			Object obj = str;
			Integer integer = (Integer)obj;   // 힙에 저장하는 정수 Integer (보라색으로 된 기본형 정수는 스택에 저장)
											  // 하나짜리도 필요에 따라서는 힙에 저장하는 경우가 있음.
											  // 검은색으로 되는 애들은 힙에 저장된다고 보면 됨. int 말고 Integer라고 적으면 됨.
			
			// 명목상으로는 부모->자식 / 자식-> 부모 변환이 가능하니까 Object타입인 obj를 Integer로 변환하는게 될거라고 생각하지만
			// 힙 쪽에서 보면 obj는 Object 타입이 아니라 String 타입이다.
			// 따라서 String -> Integer로 바꿀 수 없기 때문에 에러가 난다.
			
			// 에러 => java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
	}
}
