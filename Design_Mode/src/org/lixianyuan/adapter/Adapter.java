package org.lixianyuan.adapter;
//Adapter(ͨ�����ڲ���װһ��Adaptee���󣬰�Դ�ӿ�ת����Ŀ��ӿ�
public class Adapter extends Target{

	//����һ��˽�е�Adaptee����
	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		//�����Ϳ��԰ѱ����ϵ���request()�������ʵ�ʵ���specificRequest()
		adaptee.specificRequest();
	}
}
