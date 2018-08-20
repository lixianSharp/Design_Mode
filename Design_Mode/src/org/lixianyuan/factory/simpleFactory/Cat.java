package org.lixianyuan.factory.simpleFactory;

public class Cat extends Animal{
	@Override
	public void sayHello() {
		//super.getAnimalName() 代表使用父类的animalName字段
		System.out.println("sayHello--Cat");
	}
}
