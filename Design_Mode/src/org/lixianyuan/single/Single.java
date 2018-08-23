package org.lixianyuan.single;
//单例模式---懒汉式 第一次被使用时，才会被实例化
public class Single {
	private static Single instance;
	
	//构造方法让其private,这就杜丝勒外界利用new创建此类实例的可能
	private Single(){}
	
	//此方法是获得本类实例的唯一全局访问点。返回该类的实例
	public static Single getInstance(){
		//若实例不存在，则new 一个新实例，否则返回已有的实例
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
}
