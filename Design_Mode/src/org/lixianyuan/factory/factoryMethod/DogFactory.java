package org.lixianyuan.factory.factoryMethod;

public class DogFactory implements Factory{
	@Override
	public Animal createAnimal() {
		return new Dog();
	}

}
