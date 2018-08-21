package org.lixianyuan.state;
/**
 * Context�࣬ά��һ��ConcreteState�����ʵ�������ʵ�����嵱ǰ��״̬��
 * @author ��Ԫ
 *
 */
public class Context {
	//״̬
	private State state;
	public Context(State state){//����Context�ĳ�ʼ״̬
		this.state = state;
	}
	
	//������������������״̬
	public void request(){
		state.handle(this);
	}
	
	
	//�ɶ���д��״̬���ԣ����ڶ�ȡ��ǰ״̬��������״̬
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
