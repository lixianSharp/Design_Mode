package org.lixianyuan.state;

public class TestClient {
	public static void main(String[] args) {
		//����Context�ĳ�ʼ״̬ΪConcreteStateA
		Context c = new Context(new ConcreteStateA());
		//���ϵ�����ͬʱ����״̬
		c.request();
		c.request();
		c.request();
		c.request();
		
		/**
		 * ��ӡ�����
		 * ״̬AʱҪ�����¡�
			״̬BʱҪ������
			״̬AʱҪ�����¡�
			״̬BʱҪ������

		 */
	}
}
