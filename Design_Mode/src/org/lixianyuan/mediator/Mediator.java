package org.lixianyuan.mediator;
//Mediator类，抽象中介者类
public abstract class Mediator {
	//定义一个抽象的发送消息的方法，得到同事对象和发送信息
	public abstract void send(String message,Colleague colleague);
}
