package org.lixianyuan.builder;
//ConcreteBuilder1类-----具体建造者类
public class ConcreteBuilder1 extends Builder{

	private Product product = new Product();
	
	//建造具体的两个部件，是部件A和部件B
	
	@Override
	public void builderPartA() {
		product.add("部件A");
	}

	@Override
	public void builderPartB() {
		product.add("部件B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
