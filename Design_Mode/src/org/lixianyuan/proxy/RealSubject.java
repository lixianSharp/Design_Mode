package org.lixianyuan.proxy;
//RealSubject�࣬����Proxy���������ʵʵ��
public class RealSubject extends Subject {

	@Override
	public void request() {
		System.out.println("��ʵ������");
	}

}
