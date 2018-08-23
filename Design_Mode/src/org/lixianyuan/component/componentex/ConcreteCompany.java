package org.lixianyuan.component.componentex;

import java.util.LinkedList;
import java.util.List;

//具体公司类，实现接口，树枝节点
public class ConcreteCompany extends Company {

	private List<Company> children = new LinkedList<Company>();
	
	//构造方法
	public ConcreteCompany(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		children.add(c);
	}

	@Override
	public void remove(Company c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		String str = "";//用于拼接'-',dept等于多少就表示拼接几个'-',用于显示效果
		for(int i=0;i<depth;i++){
			str +="-";
		}
		System.out.println(str+name);
		
		for(Company component:children){
			component.display(depth+2);//递归显示
		}
	}
	
	
	//履行职责
	@Override
	public void lineOfDuty() {
		// TODO Auto-generated method stub
		for(Company component:children){
			component.lineOfDuty();
		}
	}

}
