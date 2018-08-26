package org.lixianyuan.mediator;
//ConcreteColleague2ͬ����
public class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void send(String message){
		//������Ϣʱͨ�����н��߷��ͳ�ȥ��
		mediator.send(message, this);
	}
	
	public void inform(String message){
		System.out.println("ͬ��2�õ���Ϣ:"+message);
	}

}
