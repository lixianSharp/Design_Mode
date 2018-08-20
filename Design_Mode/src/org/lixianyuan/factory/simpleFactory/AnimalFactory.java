package org.lixianyuan.factory.simpleFactory;

//工厂
public class AnimalFactory {
	/**
	 * 工厂方法
	 * @param animalName 动物类型
	 * @return 对应的动物类对象
	 */
	public static Animal createAnimal(String animalType) {
		Animal animal = null;
		switch (animalType) {
		case "cat":
			animal = new Cat();
			break;
		case "dog":
			animal = new Dog();
		default:
			break;
		}
		return animal;

	}
}
