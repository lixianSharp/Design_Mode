package org.lixianyuan.visitor;
//ConcreteElementA和ConcreteElementB类，具体元素，实现Accept操作。
public class ConcreteElementA extends Element {

	//充分利用双分派技术，实现处理与数据结构的分离
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visitConcreteElementA(this);
	}
	
	//其它的相关方法
	public void operatorA(){
		
	}

}
