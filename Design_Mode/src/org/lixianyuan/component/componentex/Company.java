package org.lixianyuan.component.componentex;
//公司类，抽象类或接口
public abstract class Company {
	protected String name;
	
	public Company(String name){
		this.name = name;
	}
	
	public abstract void add(Company c);//增加
	public abstract void remove(Company c);//移除
	public abstract void display(int depth);//显示
	public abstract void lineOfDuty();//履行职责
}
