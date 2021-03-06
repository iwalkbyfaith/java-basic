package game.accessmodifier;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		// 닉네임을 입력 받을 스캐너 생성
		Scanner scan = new Scanner(System.in);
		System.out.println("생성할 닉네임을 입력하세요.");
		String name = scan.nextLine();
		
		
		Warrior w1 = new Warrior(name);
		
		// 최초 생성 후 조회
		w1.getInfo();
		
		// 더블어택 두 번
		w1.doubleAttack();
		w1.doubleAttack();
		w1.getInfo();
		
		// 사냥
		w1.hunt();
		w1.getInfo();
		
		// 더블어택 한 번
		w1.doubleAttack();
		w1.getInfo();
		
		// 마력을 소모하는 체력회복 물약 마시기
		w1.drink();
		w1.getInfo();
		
		// 레벨업 해보기
		w1.doubleAttack();
		w1.doubleAttack();
		w1.getInfo();
		
		// 함정에 빠져보기
		w1.trap();
		
		
		// 보스 레이드하다가 죽어보기
		w1.bossRaid();
		w1.getInfo();
		
		scan.close();
	}

	
}
