package org.lixianyuan.flyweight;
//ConcreteFlyweight�Ǽ̳�FlyWeight�����ʵ��Flyweight�ӿڣ���Ϊ�ڲ�״̬���Ӵ洢�ռ�
public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("����Flyweight��"+extrinsicstate);
	}

}
