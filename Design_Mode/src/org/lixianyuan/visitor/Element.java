package org.lixianyuan.visitor;
//Element类，定义一个Accept操作，它以一个访问者为参数
public abstract class Element {
	public abstract void accept(Visitor visitor);
}
