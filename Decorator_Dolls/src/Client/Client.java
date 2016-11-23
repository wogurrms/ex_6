package Client;

import Decorator.Basic;
import Decorator.Dolls;
import Decorator.Neckless;
import Decorator.Ribon;
import Decorator.Shoes;

public class Client {
	static public void main(String args[]) {
		// 1. �⺻�������� 10000
		// 2. �����߰� 10000
		// 3. ������߰� 20000
		// 4. �Ź��߰� 5000

		// 1. �⺻���� ������ ��
		Dolls doll = new Basic();
		System.out.println("1. �⺻���� ������ �� ���� : " + doll.getPrice());

		// 2. �⺻����+���� ������ ��
		Dolls doll2 = new Ribon(new Basic());
		System.out.println("2. �⺻����+���� ������ �� ���� : " + doll2.getPrice());

		// 3. �⺻����+����+����� ������ ��
		Dolls doll3 = new Neckless(doll2);
		System.out.println("3. �⺻����+����+����� ������ �� ���� : " + doll3.getPrice());

		// 4. �⺻����+����+�����+�Ź� ������ ��
		Dolls doll4 = new Shoes(doll3);
		System.out.println("4. �⺻����+����+�����+�Ź� ������ �� ���� : " + doll4.getPrice());
	}

}
