package org.lixianyuan.strategy.strategy_simplefactory;
//具体策略类，封装了具体的算法或行为，继承于Strategy
//用于两个数相减的算法
public class ConcreteStrategySub extends Strategy {

	@Override
	public void algorithmMethod(int numberA,int numberB) {
		System.out.println(numberA+" - "+numberB+" = "+(numberA-numberB)+";");
	}

}
