package org.lixianyuan.flyweight;

import java.util.Hashtable;
/**
 * FlyweightFactory��һ����Ԫ��������������������Flyweight����
 * 	����Ҫ������ȷ������ع���Flyweight�����û�����һ��Flyweightʱ��
 * 		FlyweightFactory�����ṩһ���Դ�����ʵ�����ߴ���һ��(��������ڵĻ�)
 * @author ��Ԫ
 *
 */
public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();
	
	//��ʼ������ʱ���ȴ���3��ʵ��
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	//���ݿͻ������󣬻�������ɵ�ʵ��
	public Flyweight getFlyweight(String key){
		return (Flyweight) flyweights.get(key);
	}
}
