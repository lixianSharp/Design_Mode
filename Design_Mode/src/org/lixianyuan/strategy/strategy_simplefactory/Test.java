package org.lixianyuan.strategy.strategy_simplefactory;

public class Test {
	public static void main(String[] args) {
		Context context;
		// ����ʹ�üӷ��㷨
		/*context = new Context(new ConcreteStrategyAdd());
		context.contextInterface(5, 4);*/
		context = new Context("add");
		context.contextInterface(5, 4);

		// ����ʹ�ü����㷨
		/*context = new Context(new ConcreteStrategySub());
		context.contextInterface(5, 4);*/
		context = new Context("sub");
		context.contextInterface(5, 4);
		
		// ����ʹ�ó˷��㷨
		/*context = new Context(new ConcreteStrategyMul());
		context.contextInterface(5, 4);*/
		context = new Context("mul");
		context.contextInterface(5, 4);
	}
}
