package org.lixianyuan.decorator;
//客户端代码
public class Test {
	public static void main(String[] args) {
		//c是被装饰者
		ConcreteComponent c = new ConcreteComponent();
		//装饰者d1
		ConcreteDecorationA d1 = new ConcreteDecorationA();
		//装饰者d2
		ConcreteDecorationB d2 = new ConcreteDecorationB();
	 	
		/**
		 * 装饰的方法是：首先用ConcreteComponent实例化对象c，然后
		 * 	用ConcreteDecoratorA的实例化对象d1来包装c，
		 * 	再用ConcreteDecorationB的对象d2包装d1,最终执行d2的Operation();
		 */
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		//是有执行顺序的，执行的顺序由客户端代码顺序决定
	}
}
