package org.lixianyuan.mediator;
//ConcreteColleague2同事类
public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message){
		//发送信息时通常是中介者发送出去的
		mediator.send(message, this);
	}
	
	public void inform(String message){
		System.out.println("同事1得到信息:"+message);
	}

}
