package org.lixianyuan.state;
//ConcreteStateB����״̬��ÿһ������ʵ��һ����Context��һ��״̬��ص���Ϊ��
public class ConcreteStateB extends State {

	@Override
	public void handle(Context context) {
		// ����ConcreteStateB�µ�һ״̬��ConcreteStateA
		context.setState(new ConcreteStateA());//�л�״̬
		System.out.println("״̬BʱҪ������");
	}

}
