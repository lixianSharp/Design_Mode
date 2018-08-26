package org.lixianyuan.bridge;

public class TestClient {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();//具体实现A的方法执行
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();//具体实现B的方法执行
	}
}
