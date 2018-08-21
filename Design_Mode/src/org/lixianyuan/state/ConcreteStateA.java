package org.lixianyuan.state;
/**
 * ConcreteStateA类，具体状态，每一个子类实现一个与Context的一个状态相关的行为。
 * @author 贤元
 *
 */
public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		// 设置ConcreteStateA下的一状态是ConcreteStateB
		context.setState(new ConcreteStateB());//切换状态
		System.out.println("状态A时要做的事。");
	}

}
