package org.lixianyuan.factory.factoryMethod;

public class AnimalTest {
	public static void main(String[] args) {
		// ������ֻè
		Factory f = new CatFactory();
		// ��������
		Animal animal = f.createAnimal();
		animal.sayHello();
	}
}
