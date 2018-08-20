package org.lixianyuan.observer;
/**
 * ConcreteObserver类，具体观察者，实现抽象观察者橘色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 * 具体观察者角色可以保存一个只想具体主题对象的引用。具体观察者角色通常用一个具体子类实现
 * 
 *ConcreteObserver类，具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 * @author 贤元
 *
 */
public class ConcreateObserver extends Observer{
	private String name;//观察者名字
	private String observerState;//观察者状态
	private ConcreteSubject subject;//主题。具体观察者(也就是此观察者)所要观察的主题
	
	//构造方法，为属性subject和name初始化
	public ConcreateObserver(ConcreteSubject subject,String name){
		this.subject = subject;
		this.name = name;
	}
	
	@Override
	public void update() {
		observerState = subject.getSubjectState();
		System.out.println("观察者"+name+"的更新状态是"+observerState);
	}

	
	
	public ConcreteSubject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}
	
}
