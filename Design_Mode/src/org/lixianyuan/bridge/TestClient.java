package org.lixianyuan.bridge;

public class TestClient {
	public static void main(String[] args) {
		Abstraction ab = new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();//����ʵ��A�ķ���ִ��
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();//����ʵ��B�ķ���ִ��
	}
}
