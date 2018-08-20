package org.lixianyuan.observer;
/**
 * 客户端代码
 * @author 贤元
 *
 */
public class TestClient {
	public static void main(String[] args) {
		//创建主题
		ConcreteSubject s= new ConcreteSubject();
		//为主题添加观察者
		s.attach(new ConcreateObserver(s,"X"));
		s.attach(new ConcreateObserver(s,"Y"));
		s.attach(new ConcreateObserver(s,"Z"));
		//模拟改变主题的状态
		s.setSubjectState("ABC");
		//当主题状态改变时，通知观察该主题的观察者做出相应变化
		s.inform();
		
	}
}
