package org.lixianyuan.mediator;
//����ͬ����
public abstract class Colleague {
	protected Mediator mediator;
	
	//���췽�����õ��н��߶���
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}
