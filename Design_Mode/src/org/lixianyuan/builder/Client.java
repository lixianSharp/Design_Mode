package org.lixianyuan.builder;

//客户端，客户端代码，客户不需要知道具体的建造过程，
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();

		// 指挥者用ConcreteBuilder1的方法来建造产品
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		/**
		 * 打印结果：
		 *  产品  创建---
			部件A
			部件B
		 */

		// 指挥者用ConcreteBuilder2的方法来建造产品
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
		/**
		 * 打印结果：
		 *  产品  创建---
			部件X
			部件Y
		 */

	}
}
