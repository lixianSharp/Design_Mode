package org.lixianyuan.proxy;
/**
 * 这是代理。
 * Proxy类，保存一个引用使得代理可以访问实体，
 * 	并提供一个与Subject的接口相同的接口，这样代理就可以用来替代实体。
 * @author 贤元
 *
 */
public class Proxy extends Subject {

	//实体，即需要被代理的对象
	private RealSubject realSubject;
	
	@Override
	public void request() {
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();//调用真实实体的方法
	}

}
