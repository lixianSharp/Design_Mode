package org.lixianyuan.memento;
//������
public class Caretaker {
	private Memento memento;

	//�õ�����¼
	public Memento getMemento() {
		return memento;
	}
	//���ñ���¼
	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
}
