package final1;

public class FinalMain02_P278 {
	public static void main(String[] args) {
		// 일반 숫자를 이용한 출력요소
		System.out.println("전사의 체력 : " + 50);
		System.out.println(50);
		System.out.println("몬스터 경험치 : " + 20);
		System.out.println(20);
			// 6번, 8번은 무엇인지 설명이 있지만 7번, 9번만 있다면 봤을때 이 숫자가 뭔지 모름
			// 자기 자신의 코드일때는 상관 없지만 협업을 하는 상황이라면?
				// 이런 모호한 수치들이 문제가 됨. (설명을 안 들으면 파악하기 어려우니까)
		
		// 쓰는 이유 1) 코드 가독성 (변수명 잘 짓는게 너무너무너무 중요하다)
		// ★★ 자주 사용하게 될 고정값은 아래와 같이 상수 처리해서 코드에 대입을 해준다
		// 이러면 변수명만으로도 어떤 의미를 가진 수치인지 바로 유추가 가능하기 때문에 코드 가독성이 높아진다.
		// 상수는 대문자로만 적으며 단어 사이는 _(언더바)로 연결한다.
			// 협업할 때, 그리고 본인이 짠 코드라도 시간이 지나면 기억이 안나니 이렇게 써 놓는게 좋음!
		final int WARRIOR_HP = 50;
		final int MONSTER_EXP = 20;
		
		System.out.println(WARRIOR_HP);
		System.out.println(MONSTER_EXP);
		
		
		// 쓰는 이유 2) 상수를 굳이 쓰는 이유는 값을 일괄적으로 바꾸기 편하기 때문이다.
			// 프로그램 특성상 숫자가 하나만 달라져도 에러가 날 수 있는데 일괄적으로 바꿔준다면 굉장한 장점임.
		// 만약 워리어의 체력이 (50) 같이 되어 있다면 수치를 바꿀때 전부 하나씩 바꿔주어야 한다. 밑의 경우는 3번.(더 많아지면 빠트리는 경우가 생길지도)
		// 하지만 final 변수로 되어 있으면 코드를 선언하는 그 부분(main:19)만 한번 바꾸어주면 된다.
		System.out.println(50);
		System.out.println(MONSTER_EXP);
		System.out.println(50);
		System.out.println(MONSTER_EXP);
		System.out.println(50);
		System.out.println(MONSTER_EXP);
		
		
		
		
	}
}
