package org.lixianyuan.single;
//多线程时的单例
public class Singleton {
	private static Singleton instance;
	private static  Object syncRoot = new Object();
	
	//让构造方法私有，这就杜丝勒外界利用new创建此类实例的可能。不让外界通过new创建对象
	private Singleton(){}
	
	//静态方法
	public static Singleton getInstance(){
		//先判断实例是否存在，不存在再加锁处理
		if(instance==null){
			synchronized (syncRoot) {
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	/**
	 * 为什么在外面已经判断了instance实例是否存在，还要在synchronized里面做一次实例是否存在的判断呢？
	 * 	对于instance存在的情况，就直接返回，这没有问题。
	 *  当instance为null并且同时又两个线程调用getInstance()方法时，他们都可以通过第一重instance==null的判断。然后由于synchronized机制，
	 *  	这两个线程则只有一个进入，另一个在外排队等候，必须要其中的一个进入并出来后，另一个才能进入。
	 *  		而此时如果没有了第二重的instance是否为null的判断，则第一个线程创建了实例，二第二个线程还是可以继续再创建新的实例，这个就没有达到单例的目的了。
	 */
}
