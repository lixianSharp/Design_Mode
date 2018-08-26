package org.lixianyuan.flyweight;

import java.util.Hashtable;
/**
 * FlyweightFactory是一个享元工厂，用来创建并管理Flyweight对象。
 * 	它主要是用来确保合理地共享Flyweight，当用户请求一个Flyweight时，
 * 		FlyweightFactory对象提供一个以创建的实例或者创建一个(如果不存在的话)
 * @author 贤元
 *
 */
public class FlyweightFactory {
	private Hashtable flyweights = new Hashtable();
	
	//初始化工厂时，先创建3个实例
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	//根据客户端请求，获得已生成的实例
	public Flyweight getFlyweight(String key){
		return (Flyweight) flyweights.get(key);
	}
}
