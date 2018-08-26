package org.lixianyuan.bridge;
//Abstraction类
public class Abstraction {
	//聚合
	protected Implementor implementor;

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation(){
		implementor.operation();//使用Implementor中的方法
	}
	
}
