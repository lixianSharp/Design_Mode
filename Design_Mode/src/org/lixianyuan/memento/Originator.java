package org.lixianyuan.memento;
/**
 * ������Originator��
 * @author ��Ԫ
 *
 */
public class Originator {
	//��Ҫ��������ԣ������ж��
	private String state;
	
	//��������¼������ǰ��Ҫ�������Ϣ���벢ʵ������һ��Memento����
	public Memento createMemento(){
		return new Memento(state);
	}
	
	//�ָ�����¼����Memento���벢��������ݻָ�
	public void setMemento(Memento memento){
		state = memento.getState();
	}
	
	//��ʾ����
	public void show(){
		System.out.println("state="+state);
	}
	
	
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
