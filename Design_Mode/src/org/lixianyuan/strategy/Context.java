package org.lixianyuan.strategy;
//Context�����ģ���һ��ConcreteStrategy�����ã�ά��һ����Strategy���������
public class Context {
	private Strategy strategy;
	//��ʼ��ʱ���������Ĳ��Զ���
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	//���ݾ���Ĳ��Զ��󣬵������㷨�ķ���
	public void contextInterface(int numberA,int numberB){
		strategy.algorithmMethod(numberA, numberB);
	}
	
}
