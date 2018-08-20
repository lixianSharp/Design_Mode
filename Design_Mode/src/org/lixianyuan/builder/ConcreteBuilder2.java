package org.lixianyuan.builder;
//ConcreteBuilder2��-----���彨������
public class ConcreteBuilder2 extends Builder{

	private Product product = new Product();
	
	//�������������������ǲ���X�Ͳ���Y
	
	@Override
	public void builderPartA() {
		product.add("����X");
	}

	@Override
	public void builderPartB() {
		product.add("����Y");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
