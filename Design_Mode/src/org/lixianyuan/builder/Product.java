package org.lixianyuan.builder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//��Ʒ�࣬�ɶ���������
public class Product {
	private List<String> parts = new LinkedList<String>();
	
	//��Ӳ�Ʒ����
	public void add(String part){
		parts.add(part);
	}
	
	//�о����еĲ�Ʒ����
	public void show(){
		System.out.println("��Ʒ  ����---");
		//�о����еĲ�Ʒ����
		for(String part:parts){
			System.out.println(part);
		}
	}
}
