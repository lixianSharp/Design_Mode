package org.lixianyuan.mediator;
//Mediator�࣬�����н�����
public abstract class Mediator {
	//����һ������ķ�����Ϣ�ķ������õ�ͬ�¶���ͷ�����Ϣ
	public abstract void send(String message,Colleague colleague);
}
