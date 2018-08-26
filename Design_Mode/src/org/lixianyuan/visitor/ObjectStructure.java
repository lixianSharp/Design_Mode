package org.lixianyuan.visitor;

import java.util.ArrayList;
import java.util.List;

//ObjectStructure类，能枚举他的元素，可以提供一个高层的接口以允许访问者访问它的元素
public class ObjectStructure {
	private List<Element> elemenets = new ArrayList<Element>();
	public void attach(Element element){
		elemenets.add(element);
	}
	public void detach(Element element){
		elemenets.remove(element);
	}
	public void accept(Visitor visitor){
		for(Element e:elemenets){
			e.accept(visitor);
		}
	}
}
