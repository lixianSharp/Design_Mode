package org.lixianyuan.mediator;
//ConcreteColleague2ͬ����
public class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message){
		//������Ϣʱͨ�����н��߷��ͳ�ȥ��
		mediator.send(message, this);
	}
	
	public void inform(String message){
		System.out.println("ͬ��1�õ���Ϣ:"+message);
	}

}
