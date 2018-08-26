package org.lixianyuan.command;
//ConcreteCommand类，将一个接收者对象绑定于一个动作，调用接收者相应操作，以实现execute。
public class ConcreteCommand extends Command{
	//构造方法
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	//执行命令
	@Override
	public void execute() {
		receiver.action();
	}
	
}
