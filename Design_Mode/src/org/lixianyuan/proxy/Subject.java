package org.lixianyuan.proxy;
//Subject类，定义了RealSubject和Proxy的共用接口，这样就可以在任何使用RealSubject的地方都可以使用Proxy.
public abstract class Subject {
	public abstract void request();
}
