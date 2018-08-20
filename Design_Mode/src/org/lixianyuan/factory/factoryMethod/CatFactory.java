package org.lixianyuan.factory.factoryMethod;

public class CatFactory implements Factory {
	@Override
	public Animal createAnimal() {
		
		return new Cat();
	}
	
}
