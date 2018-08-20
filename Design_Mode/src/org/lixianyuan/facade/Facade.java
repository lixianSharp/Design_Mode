package org.lixianyuan.facade;
//外观类
/**
 * 外观类：知道那些子系统类负责处理请求，将客户的请求代理给适当的子系统对象
 * @author 贤元
 *
 */
public class Facade {
	private SubSystemOne one;
	
	private SubSystemTwo two;
	private SubSystemThree three;
	private SubSystemFour four;
	
	//构造函数，为子系统的实例初始化
	public Facade(){
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
		four = new SubSystemFour();
	}
	
	//方法组A(),用于执行特定的功能A
	public void methodA(){
		System.out.println("方法组A()---");
		one.methodOne();
		two.methodTwo();
		four.methodFour();
	}
	
	//方法组B(),用于执行特定的功能B
	public void methodB(){
		System.out.println("方法组B()---");
		two.methodTwo();
		three.methodThree();
	}
}
