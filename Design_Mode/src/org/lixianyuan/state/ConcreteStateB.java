package org.lixianyuan.state;
//ConcreteStateB具体状态，每一个子类实现一个与Context的一个状态相关的行为。
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		// 设置ConcreteStateB下的一状态是ConcreteStateA
		context.setState(new ConcreteStateA());//切换状态
		System.out.println("状态B时要做的事");
	}

}
