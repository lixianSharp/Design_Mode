package org.lixianyuan.decorator;
//װ����A  ���Ǿ����װ�ζ����𵽸�Component���ְ��Ĺ���
public class ConcreteDecorationA extends Decorator{
	
	//������й��ܣ�������ConcreteDecorationB
	private String addedState;
	
	@Override
	public void operation() {
		//��������ԭComponent��Operation(),��ִ�б���Ĺ��ܣ���addedState,�൱�ڶ�ԭComponent������װ��
		super.operation();
		addedState = "New StateA��״̬--װ����A";
		System.out.println("����װ�ζ���A�Ĳ���--װ����A");
	}
}
