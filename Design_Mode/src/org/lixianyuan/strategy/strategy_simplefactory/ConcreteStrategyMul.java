package org.lixianyuan.strategy.strategy_simplefactory;
//��������࣬��װ�˾�����㷨����Ϊ���̳���Strategy
//���ڳ˷����㷨
public class ConcreteStrategyMul extends Strategy {

	@Override
	public void algorithmMethod(int numberA,int numberB) {
		System.out.println(numberA+" * "+numberB+" = "+(numberA*numberB)+";");
	}

}
