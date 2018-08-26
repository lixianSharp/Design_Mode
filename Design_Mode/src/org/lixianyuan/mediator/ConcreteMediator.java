package org.lixianyuan.mediator;
//ConcreteMediator类，具体中介者类
public class ConcreteMediator extends Mediator {
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	
	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}
	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	//重写发送信息的方法，根据对象做出选择判断，通知对象
	@Override
	public void send(String message, Colleague colleague) {
		if(colleague==colleague1){
			colleague2.inform(message);//同事1要转告给同事2的消息
		}else{
			colleague1.inform(message);//同事2要回复同事1的消息
		}
	}

}