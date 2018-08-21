package org.lixianyuan.state;

public class TestClient {
	public static void main(String[] args) {
		//设置Context的初始状态为ConcreteStateA
		Context c = new Context(new ConcreteStateA());
		//不断的请求，同时更改状态
		c.request();
		c.request();
		c.request();
		c.request();
		
		/**
		 * 打印结果：
		 * 状态A时要做的事。
			状态B时要做的事
			状态A时要做的事。
			状态B时要做的事

		 */
	}
}
