package org.lixianyuan.visitor;
//Visitor类，为该对象结构中ConcreteElement的每一个类声明一个Visit操作
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
