package org.lixianyuan.observer;

/**
 * Observer类，抽象观察者，为所有的具体观察者定义一个接口，
 * 		在得到主题通知的时候更新自己，这个接口叫做更新接。抽象观察者一般用一个抽象类或者一个接口实现。
 * 		更新接口通常包含一个update()方法，这个方法叫做更新方法。
 * 
 * Observer类，抽象观察者，为所有的具体观察者定义一个接口，在得到主题的通知时更新自己。
 * @author 贤元
 *
 */
public abstract class Observer {
	public abstract void update();
}
