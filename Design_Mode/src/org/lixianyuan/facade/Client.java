package org.lixianyuan.facade;

//客户端
public class Client {
	//客户端调用
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
		
		/**
		 * 打印结果
		 * 方法组A()---
			子系统方法一
			子系统方法二
			子系统方法四
			方法组B()---
			子系统方法二
			子系统方法三
		 */
	}
}
