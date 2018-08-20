package org.lixianyuan.decorator;
//装饰者B
public class ConcreteDecorationB extends Decorator {
	@Override
	public void operation() {
		//首先运行原Component的Operation(),再执行本类的功能，如addedState,相当于对原Component进行了装饰
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作--装饰者B");
	}
	
	//本类独有的方法，区别于ConcreteDecorationA
	private void addedBehavior(){
		System.out.println("装饰者B独有的装饰--装饰者B");
	}
}
