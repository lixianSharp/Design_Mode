package org.lixianyuan.flyweight;
/**
 * UnsharedConcreteFlyweight��ָ��Щ����Ҫ�����Flyweight���ࡣ
 * 	��ΪFlyweight�ӿڹ����Ϊ���ܣ���������ǿ�ƹ���
 */

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("������ľ���Flyweight:"+extrinsicstate);
	}

}
