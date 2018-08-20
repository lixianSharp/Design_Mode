package org.lixianyuan.builder;
//Director类----指挥者类
public class Director {
	
	//用来指挥建造过程
	public void construct(Builder builder){
		builder.builderPartA();
		builder.builderPartB();
	}
}
