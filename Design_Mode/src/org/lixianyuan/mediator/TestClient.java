package org.lixianyuan.mediator;
//客户端
public class TestClient {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		//让两个具体同事类认识中介者对象
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		//让中介者认识各个具体同事类对象
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		//具体同事类对象的发送信息都是通过中介者转发
		c1.send("吃过饭了吗？");//同事1问同事2
		c2.send("没有呢，你打算请客？");//同事2回答同事1
	}
}
