package org.lixianyuan.builder;
//ConcreteBuilder1��-----���彨������
public class ConcreteBuilder1 extends Builder{

	private Product product = new Product();
	
	//�������������������ǲ���A�Ͳ���B
	
	@Override
	public void builderPartA() {
		product.add("����A");
	}

	@Override
	public void builderPartB() {
		product.add("����B");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
