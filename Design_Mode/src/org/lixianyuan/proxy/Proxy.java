package org.lixianyuan.proxy;
/**
 * ���Ǵ���
 * Proxy�࣬����һ������ʹ�ô�����Է���ʵ�壬
 * 	���ṩһ����Subject�Ľӿ���ͬ�Ľӿڣ���������Ϳ����������ʵ�塣
 * @author ��Ԫ
 *
 */
public class Proxy extends Subject {

	//ʵ�壬����Ҫ������Ķ���
	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();//������ʵʵ��ķ���
	}

}
