package org.lixianyuan.factory.abstractFactory;

//为Color和Shape对象创建抽象类类获取工厂
public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String sharp);
}
