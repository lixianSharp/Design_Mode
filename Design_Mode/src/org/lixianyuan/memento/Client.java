package org.lixianyuan.memento;

public class Client {
	public static void main(String[] args) {
		//������
		Originator o = new Originator();
		o.setState("ԭ��ʼ״̬-On");//Originator��ʼ״̬��״̬����Ϊ"On"
		o.show();//state=ԭ��ʼ״̬-On
		
		//������
		Caretaker c = new Caretaker();
		//����״̬ʱ���������˺ܺõķ�װ����������Originator��ʵ��ϸ��
		c.setMemento(o.createMemento());//o.CreateMemento()��ʾ����һ������¼�����������˵����ݱ����ڱ���¼��
		
		//originator�����˸ı���״̬����Ϊ"Off"
		o.setState("�ı���״̬Off");
		o.show();//state=�ı���״̬Off
		
		//�ָ�ԭ��ʼ״̬
		o.setMemento(c.getMemento());
		o.show();//state=ԭ��ʼ״̬-On
	}
}
