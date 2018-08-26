package org.lixianyuan.flyweight;
//ConcreteFlyweight是继承FlyWeight超类或实现Flyweight接口，并为内部状态增加存储空间
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("具体Flyweight："+extrinsicstate);
	}

}
