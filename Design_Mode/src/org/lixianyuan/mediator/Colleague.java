package org.lixianyuan.mediator;
//抽象同事类
public abstract class Colleague {
	protected Mediator mediator;
	
	//构造方法，得到中介者对象
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
