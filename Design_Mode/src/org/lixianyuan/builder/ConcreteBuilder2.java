package org.lixianyuan.builder;
//ConcreteBuilder2类-----具体建造者类
public class ConcreteBuilder2 extends Builder{

	private Product product = new Product();
	
	//建造具体的两个部件，是部件X和部件Y
	
	@Override
	public void builderPartA() {
		product.add("部件X");
	}

	@Override
	public void builderPartB() {
		product.add("部件Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
