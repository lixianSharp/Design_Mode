package org.lixianyuan.template;

/**
 * 实现父类所定义的一个或多个抽象方法，每一个AbstractClass都可以有任意多个ConcreteClass与之对应，
 * 	而每一个ConcreteClass都可以给出这些抽象方法(也就是顶级逻辑的组成步骤)的不同实现，从而使得顶级逻辑的实现各不相同。
 * @author 贤元
 *
 */
public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		//与ConcreteClassB不同的方法实现
		System.out.println("具体类A方法1实现");
	}

	@Override
	public void primitiveOperation2() {
		////与ConcreteClassB不同的方法实现
		System.out.println("具体类A方法2实现");
	}

}
