package org.lixianyuan.factory.simpleFactory;

public class Cat extends Animal{
	@Override
	public void sayHello() {
		//super.getAnimalName() ����ʹ�ø����animalName�ֶ�
		System.out.println("sayHello--Cat");
	}
}
