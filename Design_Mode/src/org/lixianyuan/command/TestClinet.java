package org.lixianyuan.command;
//客户端测试类
public class TestClinet {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		i.setCommand(c);
		i.executeCommand();//执行请求
	}
}
