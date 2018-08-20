package org.lixianyuan.factory.factoryMethod;

public class AnimalTest {
	public static void main(String[] args) {
		// 需求：找只猫
		Factory f = new CatFactory();
		// 上溯造型
		Animal animal = f.createAnimal();
		animal.sayHello();
	}
}
