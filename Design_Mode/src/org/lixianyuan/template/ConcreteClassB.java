package org.lixianyuan.template;
/**
 * ʵ�ָ����������һ���������󷽷���ÿһ��AbstractClass��������������ConcreteClass��֮��Ӧ��
 * 	��ÿһ��ConcreteClass�����Ը�����Щ���󷽷�(Ҳ���Ƕ����߼�����ɲ���)�Ĳ�ͬʵ�֣��Ӷ�ʹ�ö����߼���ʵ�ָ�����ͬ��
 * @author ��Ԫ
 *
 */
public class ConcreteClassB extends AbstractClass {

	@Override
	public void primitiveOperation1() {
		//��ConcreteClassA��ͬ�ķ���ʵ��
		System.out.println("������B����1ʵ��");
	}

	@Override
	public void primitiveOperation2() {
		////��ConcreteClassA��ͬ�ķ���ʵ��
		System.out.println("������B����2ʵ��");
	}

}
