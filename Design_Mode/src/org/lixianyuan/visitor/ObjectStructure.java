package org.lixianyuan.visitor;

import java.util.ArrayList;
import java.util.List;

//ObjectStructure�࣬��ö������Ԫ�أ������ṩһ���߲�Ľӿ�����������߷�������Ԫ��
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
