package org.lixianyuan.factory.abstractFactory;

//ΪColor��Shape���󴴽����������ȡ����
public abstract class AbstractFactory {
	public abstract Color getColor(String color);

	public abstract Shape getShape(String sharp);
}
