package org.lixianyuan.visitor;
//ConcreteElementA��ConcreteElementB�࣬����Ԫ�أ�ʵ��Accept������
public class ConcreteElementA extends Element {

	//�������˫���ɼ�����ʵ�ִ��������ݽṹ�ķ���
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
	
	//��������ط���
	public void operatorA(){
		
	}

}
