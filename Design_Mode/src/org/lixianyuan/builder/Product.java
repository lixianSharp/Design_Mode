package org.lixianyuan.builder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//产品类，由多个部件组成
public class Product {
	private List<String> parts = new LinkedList<String>();
	
	//添加产品部件
	public void add(String part){
		parts.add(part);
	}
	
	//列举所有的产品部件
	public void show(){
		System.out.println("产品  创建---");
		//列举所有的产品部件
		for(String part:parts){
			System.out.println(part);
		}
	}
}
