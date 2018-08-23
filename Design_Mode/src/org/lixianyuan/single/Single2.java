package org.lixianyuan.single;
//单例模式---饿汉式  在自己被加载时就将自己实例化
public class Single2 {
	private static Single2 instance = new Single2();
	
	//构造方法让其private,这就杜丝勒外界利用new创建此类实例的可能
	private Single2(){}
	
	//此方法是获得本类实例的唯一全局访问点，返回该类的实例。静态方法
	public static Single2 getInstance(){
		return instance;
	}
}
