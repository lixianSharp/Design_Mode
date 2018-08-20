package org.lixianyuan.strategy.strategy_simplefactory;

//Context�����ģ���һ��ConcreteStrategy�����ã�ά��һ����Strategy���������
public class Context {
	private Strategy strategy;

	// ���췽����ע�⣬�������Ǿ�����㷨���Զ��󣬶���һ���ַ�������ʾ���Ե�����
	public Context(String strategyType) {
		
		/**
		 * ��ʵ����������ԵĹ����ɿͻ���ת�Ƶ�Context���У��򵥹�����Ӧ��
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

	// ���ݾ���Ĳ��Զ��󣬵������㷨�ķ���
	public void contextInterface(int numberA, int numberB) {
		strategy.algorithmMethod(numberA, numberB);
	}

}
