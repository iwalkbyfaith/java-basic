package casting;

public class Main01 {
	public static void main(String[] args) {
		
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// 각각 .sit()을 호출해보세요.
		
		Animal a1 = new Animal("동물", 3);
		Animal c1 = new Cat("깜구", 2);
		Animal d1 = new Dog("발바리", 2);
		
		a1.sit();
		c1.sit();
		// c1.grooming(); 하면 오류가 뜸.
		// c1은 Animal 타입이기 때문에 Cat영역에 있는 오리지널 메서드에 영향을 끼치지 못함.
		// Animal에서 오버라이드한 sit은 호출할 수 있는 명분이 있음. 그래서 가능.
		
		// d1. 에 대한 특수 명령어 설명도 해주세요.
		d1.sit();
		
		// ■■■■■■■■■■■■■■■■■■■■ 여기부터 강제 형 변환(Casting) 설명 시작 ■■■■■■■■■■■■■■■■■■■■■
		// 각 자료형에 맞는 변수로 바꿔서 대입하겠습니다.
			//Cat cat = c1;  => Type mismatch: cannot convert from Animal to Cat
			// Animal에다가 Cat자료를 넣는 것은 가능하지만 Cat에다 Animal을 넣는 것은 불가능하다.
		
		// c1 자체는 Animal 타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환 가능
		Cat cat = (Cat)c1;
			// 힙에 저장되어 있는 것이 근본적인 자료형이다.
			// 다형성을 위해서 일시적으로 Animal로 제한해서 쓰고 있는 것이기 때문에 다시 Cat으로 돌릴 수 있다.
			// 100번지(선생님기준)를 Cat 자료형의 cat이라는 변수 안에 넣어주는 것임(스택에 cat이라는 새로운 변수가 생긴 것)
			// 만들어진 변수 cat은 이제 100번지의 Animal과 Cat에 모두 영향력을 끼칠 수 있음.
		
		// dog에 대해서도 똑같이 해보자
		Dog dog = (Dog)d1;
			// 다형성을 썼는데 자식쪽에서만 쓸 수 있는 메서드를 쓰고 싶다면 이런 방법을 쓰면 된다는 것.
		
		dog.dig(); // => 새로운 변수 dog는 Dog에만 있는 메서드인 dig()를 사용할 수 있음.
		
		
		
		
		
	}

}
