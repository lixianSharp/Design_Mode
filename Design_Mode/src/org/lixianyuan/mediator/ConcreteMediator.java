package org.lixianyuan.mediator;
//ConcreteMediator�࣬�����н�����
public class ConcreteMediator extends Mediator {
	private ConcreteColleague1 colleague1;
	private ConcreteColleague2 colleague2;
	
	public void setColleague1(ConcreteColleague1 colleague1) {
		this.colleague1 = colleague1;
	}
	public void setColleague2(ConcreteColleague2 colleague2) {
		this.colleague2 = colleague2;
	}

	//��д������Ϣ�ķ��������ݶ�������ѡ���жϣ�֪ͨ����
	@Override
	public void send(String message, Colleague colleague) {
		if(colleague==colleague1){
			colleague2.inform(message);//ͬ��1Ҫת���ͬ��2����Ϣ
		}else{
			colleague1.inform(message);//ͬ��2Ҫ�ظ�ͬ��1����Ϣ
		}
	}

}