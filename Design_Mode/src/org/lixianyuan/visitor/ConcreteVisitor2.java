package org.lixianyuan.visitor;
/**
 * ConcreteVisitor1和ConcreteVisitor2类，具体访问者，实现每个由Visitor声明的操作。
 * 每个操作实现算法的一部分，而该算法片段乃是对应于结构中对象的类。
 * @author 贤元
 *
 */
public class ConcreteVisitor2 extends Visitor {

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getTypeName()+"被"+this.getClass().getTypeName()+"访问");
		
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getTypeName()+"被"+this.getClass().getTypeName()+"访问");
	}
	
}
