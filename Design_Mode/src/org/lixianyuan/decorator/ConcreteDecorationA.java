package org.lixianyuan.decorator;
//装饰者A  就是具体的装饰对象，起到给Component添加职责的功能
public class ConcreteDecorationA extends Decorator{
	
	//本类独有功能，区别于ConcreteDecorationB
	private String addedState;
	
	@Override
	public void operation() {
		//首先运行原Component的Operation(),再执行本类的功能，如addedState,相当于对原Component进行了装饰
		super.operation();
		addedState = "New StateA新状态--装饰者A";
		System.out.println("具体装饰对象A的操作--装饰者A");
	}
}
