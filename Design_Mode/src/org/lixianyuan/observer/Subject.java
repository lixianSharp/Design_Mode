package org.lixianyuan.observer;

import java.util.LinkedList;
import java.util.List;
/**
 * Subject类，可翻译为主题或抽象通知者，一般用一个抽象类或者一个接口实现。他把所有对观察者对象的引用保存在一个聚集里，
 * 	每个主题都可以有任何数量的观察者。抽象主体提供一个接口，可以增加和删除观察者对象。
 * 
 * Subject类，他把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者。抽象主体提供一个借口，可以增加和删除观察者对象。
 * @author 贤元
 *
 */
public abstract class Subject {
	
	//用一个list集合存放观察者
	private List<Observer> observers = new LinkedList<Observer>();
	
	//增加观察者
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	//移除观察者
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	//通知
	public void inform(){
		for(Observer o:observers){
			o.update();//通知观察者做出相应变化
		}
	}
	
}
