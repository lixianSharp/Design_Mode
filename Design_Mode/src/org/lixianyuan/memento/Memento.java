package org.lixianyuan.memento;
//����¼memento��
public class Memento {
	private String state;
	
	//���췽������������ݵ���
	public Memento(String state){
		this.state = state;
	}

	//��Ҫ������������ԣ������Ƕ��
	public String getState() {
		return state;
	}
	
	
}
