package org.lixianyuan.state;
/**
 * ConcreteStateA�࣬����״̬��ÿһ������ʵ��һ����Context��һ��״̬��ص���Ϊ��
 * @author ��Ԫ
 *
 */
public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		// ����ConcreteStateA�µ�һ״̬��ConcreteStateB
		context.setState(new ConcreteStateB());//�л�״̬
		System.out.println("״̬AʱҪ�����¡�");
	}

}
