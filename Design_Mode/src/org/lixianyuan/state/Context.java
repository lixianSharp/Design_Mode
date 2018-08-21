package org.lixianyuan.state;
/**
 * Context类，维护一个ConcreteState子类的实例，这个实例定义当前的状态。
 * @author 贤元
 *
 */
public class Context {
	//状态
	private State state;
	public Context(State state){//定义Context的初始状态
		this.state = state;
	}
	
	//对请求做处理，并设置状态
	public void request(){
		state.handle(this);
	}
	
	
	//可读可写的状态属性，用于读取当前状态和设置新状态
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
