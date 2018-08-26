package org.lixianyuan.visitor;

//客户端代码
public class TestClient {
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		o.accept(v1);
		o.accept(v2);
		
		/**
		 * 打印结果：
org.lixianyuan.visitor.ConcreteElementA被org.lixianyuan.visitor.ConcreteVisitor1访问
org.lixianyuan.visitor.ConcreteElementB被org.lixianyuan.visitor.ConcreteVisitor1访问
org.lixianyuan.visitor.ConcreteElementA被org.lixianyuan.visitor.ConcreteVisitor2访问
org.lixianyuan.visitor.ConcreteElementB被org.lixianyuan.visitor.ConcreteVisitor2访问
		 */
	}
}
