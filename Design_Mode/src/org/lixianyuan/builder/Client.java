package org.lixianyuan.builder;

//�ͻ��ˣ��ͻ��˴��룬�ͻ�����Ҫ֪������Ľ�����̣�
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();

		// ָ������ConcreteBuilder1�ķ����������Ʒ
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		/**
		 * ��ӡ�����
		 *  ��Ʒ  ����---
			����A
			����B
		 */

		// ָ������ConcreteBuilder2�ķ����������Ʒ
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
		/**
		 * ��ӡ�����
		 *  ��Ʒ  ����---
			����X
			����Y
		 */

	}
}
