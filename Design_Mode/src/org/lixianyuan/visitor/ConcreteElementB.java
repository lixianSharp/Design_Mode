package org.lixianyuan.visitor;
//ConcreteElementA��ConcreteElementB�࣬����Ԫ�أ�ʵ��Accept������
public class ConcreteElementB extends Element {

	//�������˫���ɼ�����ʵ�ִ��������ݽṹ�ķ���
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementB(this);
	}
	
	//��������ط���
	public void operatorB(){
		
	}

}
