package org.lixianyuan.mediator;
//�ͻ���
public class TestClient {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		
		//����������ͬ������ʶ�н��߶���
		ConcreteColleague1 c1 = new ConcreteColleague1(m);
		ConcreteColleague2 c2 = new ConcreteColleague2(m);
		
		//���н�����ʶ��������ͬ�������
		m.setColleague1(c1);
		m.setColleague2(c2);
		
		//����ͬ�������ķ�����Ϣ����ͨ���н���ת��
		c1.send("�Թ�������");//ͬ��1��ͬ��2
		c2.send("û���أ��������ͣ�");//ͬ��2�ش�ͬ��1
	}
}
