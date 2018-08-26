package org.lixianyuan.visitor;

//�ͻ��˴���
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
		 * ��ӡ�����
org.lixianyuan.visitor.ConcreteElementA��org.lixianyuan.visitor.ConcreteVisitor1����
org.lixianyuan.visitor.ConcreteElementB��org.lixianyuan.visitor.ConcreteVisitor1����
org.lixianyuan.visitor.ConcreteElementA��org.lixianyuan.visitor.ConcreteVisitor2����
org.lixianyuan.visitor.ConcreteElementB��org.lixianyuan.visitor.ConcreteVisitor2����
		 */
	}
}
