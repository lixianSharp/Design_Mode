package org.lixianyuan.factory.simpleFactory;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = null;
		//上溯造型
		animal = AnimalFactory.createAnimal("dog");//返回dog对象
		animal.sayHello();//结果：sayHello--Dog
		//上溯造型
		animal = AnimalFactory.createAnimal("cat");//返回dog对象
		animal.sayHello();//结果：sayHello--Cat
	}
}
