package Client;

import Decorator.Basic;
import Decorator.Dolls;
import Decorator.Neckless;
import Decorator.Ribon;
import Decorator.Shoes;

public class Client {
	static public void main(String args[]) {
		// 1. 기본인형가격 10000
		// 2. 리본추가 10000
		// 3. 목걸이추가 20000
		// 4. 신발추가 5000

		// 1. 기본인형 구입할 때
		Dolls doll = new Basic();
		System.out.println("1. 기본인형 구입할 때 가격 : " + doll.getPrice());

		// 2. 기본인형+리본 구입할 때
		Dolls doll2 = new Ribon(new Basic());
		System.out.println("2. 기본인형+리본 구입할 때 가격 : " + doll2.getPrice());

		// 3. 기본인형+리본+목걸이 구입할 때
		Dolls doll3 = new Neckless(doll2);
		System.out.println("3. 기본인형+리본+목걸이 구입할 때 가격 : " + doll3.getPrice());

		// 4. 기본인형+리본+목걸이+신발 구입할 때
		Dolls doll4 = new Shoes(doll3);
		System.out.println("4. 기본인형+리본+목걸이+신발 구입할 때 가격 : " + doll4.getPrice());
	}

}
