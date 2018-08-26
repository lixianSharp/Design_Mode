package org.lixianyuan.visitor;
/**
 * ConcreteVisitor1��ConcreteVisitor2�࣬��������ߣ�ʵ��ÿ����Visitor�����Ĳ�����
 * ÿ������ʵ���㷨��һ���֣������㷨Ƭ�����Ƕ�Ӧ�ڽṹ�ж�����ࡣ
 * @author ��Ԫ
 *
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getTypeName()+"��"+this.getClass().getTypeName()+"����");
		
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getTypeName()+"��"+this.getClass().getTypeName()+"����");
	}
	
}
