package org.lixianyuan.strategy;
//��������࣬��װ�˾�����㷨����Ϊ���̳���Strategy
//����������������㷨
public class ConcreteStrategySub extends Strategy {

	@Override
	public void algorithmMethod(int numberA,int numberB) {
		System.out.println(numberA+" - "+numberB+" = "+(numberA-numberB)+";");
	}

}