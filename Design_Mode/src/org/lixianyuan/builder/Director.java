package org.lixianyuan.builder;
//Director��----ָ������
public class Director {
	
	//����ָ�ӽ������
	public void construct(Builder builder){
		builder.builderPartA();
		builder.builderPartB();
	}
}
