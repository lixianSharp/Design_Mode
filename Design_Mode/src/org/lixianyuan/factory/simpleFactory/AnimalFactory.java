package org.lixianyuan.factory.simpleFactory;

//����
public class AnimalFactory {
	/**
	 * ��������
	 * @param animalName ��������
	 * @return ��Ӧ�Ķ��������
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
