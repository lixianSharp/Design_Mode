package org.lixianyuan.template;

/**
 * ʵ�ָ����������һ���������󷽷���ÿһ��AbstractClass��������������ConcreteClass��֮��Ӧ��
 * 	��ÿһ��ConcreteClass�����Ը�����Щ���󷽷�(Ҳ���Ƕ����߼�����ɲ���)�Ĳ�ͬʵ�֣��Ӷ�ʹ�ö����߼���ʵ�ָ�����ͬ��
 * @author ��Ԫ
 *
 */
public class ConcreteClassA extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		//��ConcreteClassB��ͬ�ķ���ʵ��
		System.out.println("������A����1ʵ��");
	}

	@Override
	public void primitiveOperation2() {
		////��ConcreteClassB��ͬ�ķ���ʵ��
		System.out.println("������A����2ʵ��");
	}

}
