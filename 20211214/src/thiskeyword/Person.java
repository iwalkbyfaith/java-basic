package thiskeyword;

public class Person {
	// 사람의 정보를 여기 기입합니다.
	
	private String name;    // 이름
	private int age;        // 나이
	private int money;      // 소지금액
	private String major;   // 전공
	
	
	
	public Person(String name, int age, int money, String major) {
		this.name = name;         // this = 가장 상위에 있는.
		this.age = age;           // this가 person의 역할을 함.
		this.money = money;
		this.major = major;
		
		// 생성자 지역에 있는 name이 person의 name으로 되는 
		// 생성자 지역에서 name을 호출하면 person클래스의 파란색 name이 아니라 자기 지역이랑 제일 가까운 갈색 name이 호출되는 것.
		
		
		// 하위 지역에서는 상위 지역의 데이터를 가져올 수 있다. (상위 지역에서 하위지역의 내역을 받을수는 없음)
			// 헷갈리면 폭포가 상위->하위로 떨어진다고 생각. 밑에서는 윗 물을 받아쓸 수 있지만 상위에서는 그럴 수 없음.
		// 원래 name = n;라고 했을때 된 이유는 1) 생성자지역에서 name 찾아봄 -> 없음 -> 2) 상위 지역인 Person class에서 name을 찾음 -> 발견
	}
	
	public void getInfo() {
		System.out.println("이름 : " + name + 
						   ", 나이 : " + age + 
						   ", 소지금액 : " + money + 
						   ", 전공 : " + major);
	}
		// name을 호출했을 때 동등한 지역(생성자와 getInfo)에서는 정보를 가져오지 않는다
			//(생성자에서 name을 가져오는 것보다 person클래스 상위 지역에서 가져오는 것이 우선순위에 있기 때문.)
		// this.name이라고 적어도 결국엔 같은 말임.
	
	
	/*   <파싱>
	 *   책으로 비유하면 읽어서 이해하는 것. 사기만 했다고 이해할 수 없음. 읽어야지 이해가 되는 것.
	 *   우리가 작성한 코드를 컴퓨터가 이해를 해야지 기계어로 번역을 할 수 있음.
	 *   컴퓨터가 코드를 이해하는 과정. 판단하는 일련의 과정 = 파싱
	 */

	// 정의부에서는 코드 순서가 중요하지 않음. 컴터가 구조만 이해하고 넘어가기 때문
	// 실행부 main 에서는 코드 순서가 중요함.
	
	
}
