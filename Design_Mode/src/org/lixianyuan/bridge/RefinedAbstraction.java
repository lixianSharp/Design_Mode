package org.lixianyuan.bridge;
//RefinedAbstraction└Ó
public class RefinedAbstraction extends Abstraction {
	
	@Override
	public void operation() {
		implementor.operation();
	}
}
