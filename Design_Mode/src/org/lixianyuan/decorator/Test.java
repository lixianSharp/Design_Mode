package org.lixianyuan.decorator;
//�ͻ��˴���
public class Test {
	public static void main(String[] args) {
		//c�Ǳ�װ����
		ConcreteComponent c = new ConcreteComponent();
		//װ����d1
		ConcreteDecorationA d1 = new ConcreteDecorationA();
		//װ����d2
		ConcreteDecorationB d2 = new ConcreteDecorationB();
	 	
		/**
		 * װ�εķ����ǣ�������ConcreteComponentʵ��������c��Ȼ��
		 * 	��ConcreteDecoratorA��ʵ��������d1����װc��
		 * 	����ConcreteDecorationB�Ķ���d2��װd1,����ִ��d2��Operation();
		 */
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		//����ִ��˳��ģ�ִ�е�˳���ɿͻ��˴���˳�����
	}
}
