package org.lixianyuan.strategy;

public class Test {
	public static void main(String[] args) {
		Context context;
		// 我想使用加法算法
		context = new Context(new ConcreteStrategyAdd());
		context.contextInterface(5, 4);

		// 我想使用减法算法
		context = new Context(new ConcreteStrategySub());
		context.contextInterface(5, 4);

		// 我想使用乘法算法
		context = new Context(new ConcreteStrategyMul());
		context.contextInterface(5, 4);
	}
}
