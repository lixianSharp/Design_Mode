package org.lixianyuan.strategy.strategy_simplefactory;

//Context上下文，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
public class Context {
	private Strategy strategy;

	// 构造方法，注意，参数不是具体的算法策略对象，而是一个字符串，表示策略的类型
	public Context(String strategyType) {
		
		/**
		 * 将实例化具体策略的过程由客户端转移到Context类中，简单工厂的应用
		 */
		switch (strategyType) {
			case "add":
				strategy = new ConcreteStrategyAdd();
				break;
			case "sub":
				strategy = new ConcreteStrategySub();
				break;
			case "mul":
				strategy = new ConcreteStrategyMul();
				break;
		}

	}

	// 根据具体的策略对象，调用其算法的方法
	public void contextInterface(int numberA, int numberB) {
		strategy.algorithmMethod(numberA, numberB);
	}

}
