package org.lixianyuan.factory.simpleFactory;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = null;
		//��������
		animal = AnimalFactory.createAnimal("dog");//����dog����
		animal.sayHello();//�����sayHello--Dog
		//��������
		animal = AnimalFactory.createAnimal("cat");//����dog����
		animal.sayHello();//�����sayHello--Cat
	}
}
