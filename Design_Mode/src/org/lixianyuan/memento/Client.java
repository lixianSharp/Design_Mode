package org.lixianyuan.memento;

public class Client {
	public static void main(String[] args) {
		//发起人
		Originator o = new Originator();
		o.setState("原初始状态-On");//Originator初始状态，状态属性为"On"
		o.show();//state=原初始状态-On
		
		//管理者
		Caretaker c = new Caretaker();
		//保存状态时，由于有了很好的封装，可以隐藏Originator的实现细节
		c.setMemento(o.createMemento());//o.CreateMemento()表示创建一个备忘录，并将发起人的数据保存在备忘录中
		
		//originator发起人改变了状态属性为"Off"
		o.setState("改变后的状态Off");
		o.show();//state=改变后的状态Off
		
		//恢复原初始状态
		o.setMemento(c.getMemento());
		o.show();//state=原初始状态-On
	}
}
