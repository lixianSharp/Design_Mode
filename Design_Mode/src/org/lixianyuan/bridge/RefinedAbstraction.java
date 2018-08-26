package org.lixianyuan.bridge;
//RefinedAbstraction¿‡
public class RefinedAbstraction extends Abstraction {
	
	@Override
	public void operation() {
		implementor.operation();
	}
}
