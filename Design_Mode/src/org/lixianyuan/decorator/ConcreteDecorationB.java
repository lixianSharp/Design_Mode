package org.lixianyuan.decorator;
//װ����B
public class ConcreteDecorationB extends Decorator {
	@Override
	public void operation() {
		//��������ԭComponent��Operation(),��ִ�б���Ĺ��ܣ���addedState,�൱�ڶ�ԭComponent������װ��
		super.operation();
		addedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���--װ����B");
	}
	
	//������еķ�����������ConcreteDecorationA
	private void addedBehavior(){
		System.out.println("װ����B���е�װ��--װ����B");
	}
}
